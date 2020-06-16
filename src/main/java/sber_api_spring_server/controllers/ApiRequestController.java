package sber_api_spring_server.controllers;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;
import org.springframework.web.client.RestTemplate;

@Service
public class ApiRequestController {

    @Value("${host}")
    private String host;

    public ResponseEntity getRestTemplate(String url, String token, Object obj, String errorMessage){
        HttpHeaders headers = new HttpHeaders();
        //text/json  для nodejs
        headers.setContentType(MediaType.APPLICATION_JSON);
        headers.set("Authorization", token);
        RestTemplate restTemplate = new RestTemplate();
        ResponseEntity responseEntity = null;
        try {
            responseEntity =restTemplate.postForObject(url, new HttpEntity(obj , headers), ResponseEntity.class);
        }
        catch (Exception e){
            //TODO меняем
            System.out.println(errorMessage +" " + e);
        }
        if(responseEntity.getStatusCode().value() != 200){
            //TODO меняем
            System.out.println(errorMessage +" " + responseEntity.getBody());
            return null;
        }
        return responseEntity;
    }

    public String  getApiPath(String api,String path) {
        return new StringBuilder().append(host)
            .append(StringUtils.isEmpty(api) ? "" : api)
            .append(path).toString();
    }

    public ResponseEntity sendOperationsRequest(String url, Object requestParams, String token,@Value("Failed to request operations") String errorMessage){
            return getRestTemplate(url, token, requestParams, errorMessage);
    }

    public ResponseEntity sendFirstOrderRequest(String url, Object requestParams, String token,@Value("Failed to request first order by account id") String errorMessage){
        return getRestTemplate(url, token, requestParams, errorMessage);
    }

    public ResponseEntity sendUserAccountsRequest(String url, Object requestParams, String token,@Value("Failed to request user accounts") String errorMessage){
        return getRestTemplate(url, token, requestParams, errorMessage);
    }

}
