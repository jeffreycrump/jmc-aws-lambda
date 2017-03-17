package com.jmc.aws.lambda;

import com.amazonaws.services.lambda.runtime.Context;
import com.amazonaws.services.lambda.runtime.RequestHandler;

public class DemoHandler implements RequestHandler<LambdaRequest, LambdaResponse> {

    @Override
    public LambdaResponse handleRequest(LambdaRequest request, Context arg1) {
        String greetingString = String.format("Hello %s %s.", request.firstName, request.lastName);
        return new LambdaResponse(greetingString);
    }
    
}
