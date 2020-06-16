package sber_api_spring_server.controllers;


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.test.util.ReflectionTestUtils;

public class ApiRequestControllerTest {

    private ApiRequestController apiRequestController;

    @BeforeEach
    private void init(){
        apiRequestController = new ApiRequestController();

            ReflectionTestUtils.setField(
                apiRequestController,
              "host",
                "localhost:8888");
    }
    @Test
    public void shouldBeValidUrl(){
        String url = apiRequestController.getApiPath("/mobile", "/portfolio/account/get_all");
        Assertions.assertEquals(url, "localhost:8888/mobile/portfolio/account/get_all");
    }

}
