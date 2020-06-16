package sber_api_spring_server.controllers.operations;

import sber_api_spring_server.constants.operations.IPortfolioWsOperationRequestParams;

public class OperationsWsEventController {

    public OperationsWsEventController(IPortfolioWsOperationRequestParams operationRequestParams){
        if (operationRequestParams.getRequestId() != null) {
            if (operationRequestParams.isNoSubscription()) {
                // last chance to retrieve data - just get cached response or error
//                this.responseWithDataCached(requestParams);
            }
            else {
                // after reconnect behavior
//                this.responseWithDataCachedOrSubscribe(requestParams);
            }
            return;
        }
    }

    private void responseWithDataCached(IPortfolioWsOperationRequestParams operationRequestParams){

    }
    //responseWithDataCached(requestParams, requestId) {
    //        requestId = requestId || requestParams.clientRequestParams.requestId;
    //        if (!requestId) {
    //            this.emitDataRequestError(requestParams, 'No requestId provided to get data from cache');
    //            return;
    //        }
    //        OperationsRequestRepository_1.default.getClientOperationsRequest(requestId)
    //            .then((data) => {
    //            if (data.userId !== requestParams.userId) {
    //                this.emitDataRequestError(requestParams, 'Bad request params', 400);
    //                return;
    //            }
    //            this.emitOperationsData(requestParams, data.responseCode, data.timestamp, data.data);
    //        })
    //            .catch((error) => this.emitDataRequestError(requestParams, error));
    //    }

}
