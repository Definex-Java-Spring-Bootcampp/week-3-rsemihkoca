package com.patika.kredinbizdeservice.client.garanti;

import com.patika.kredinbizdeservice.client.BankServiceClient;
import com.patika.kredinbizdeservice.client.dto.request.BankApplicationRequest;
import com.patika.kredinbizdeservice.client.dto.response.ApplicationResponse;

public class AkbankClient implements BankServiceClient {

    private final AkbankServiceClient feignClient;

    public AkbankClient() {
        this.feignClient = null;
    }

    public AkbankClient(AkbankServiceClient feignClient) {
        this.feignClient = feignClient;
    }

    @Override
    public ApplicationResponse createApplication(BankApplicationRequest request) {
        return feignClient.createApplication(request);
    }
}

