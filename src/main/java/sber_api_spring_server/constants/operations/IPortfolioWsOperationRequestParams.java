package sber_api_spring_server.constants.operations;

import java.util.List;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

// api: string | null;
//    clientRequestId: string;
//    noSubscription?: boolean;
//    requestId?: string;
//    descriptors?: IPortfolioOperationRequestParams[];
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class IPortfolioWsOperationRequestParams extends IPortfolioOperationRequestParams {
    String api;
    String clientRequestId;
    boolean noSubscription;
    String requestId;
    List<IPortfolioOperationRequestParams> descriptors;
}
