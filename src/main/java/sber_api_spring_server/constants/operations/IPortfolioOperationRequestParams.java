package sber_api_spring_server.constants.operations;

import java.util.List;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

//    accountIds: string[];
//    companyIds: string[];
//    instrumentIds: string[];
//    operationTypes: string[];
//    statuses: string[] | null;
//    startTime: number | null;
//    endTime: number | null;
//    timezoneOffsetInSeconds: number | null;
//    activeFirst?: boolean;
//    limit: number;
//    offset: number;
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class IPortfolioOperationRequestParams {
    List<String> accountIds;
    List<String> companyIds;
    List<String> instrumentIds;
    List<String> operationTypes;
    List<String> statuses;
    long startTime;
    long endTime;
    long timezoneOffsetInSeconds;
    boolean activeFirst;
    long limit;
    long offset;

}
