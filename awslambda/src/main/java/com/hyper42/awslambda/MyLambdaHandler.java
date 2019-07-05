package com.hyper42.awslambda;

import java.util.Date;
import java.util.UUID;
import com.amazonaws.services.lambda.runtime.RequestHandler;
import com.amazonaws.services.lambda.runtime.Context;

public class MyLambdaHandler implements RequestHandler<MyLambdaRequest, MyLambdaResponse> {

    public MyLambdaResponse handleRequest(MyLambdaRequest input, Context context) {
        context.getLogger().log("Input: " + input);

        try {
            Thread.sleep(1000);
        } catch (InterruptedException e1) {
            // TODO Auto-generated catch block
            e1.printStackTrace();
        }
        MyLambdaResponse lambdaResponse = new MyLambdaResponse();
        try {
                        lambdaResponse.setResponseMessage(input.getMessage() + input.getName() + " Response Time : " + new Date());
                        lambdaResponse.setTransactionID(UUID.randomUUID().toString());
                } catch (Exception e) {
                        e.printStackTrace();
                        lambdaResponse.setResponseMessage(e.getMessage());
                }
        context.getLogger().log("Response : " + lambdaResponse);
        return lambdaResponse;
    }
}