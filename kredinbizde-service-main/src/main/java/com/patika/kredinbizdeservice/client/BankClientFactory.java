package com.patika.kredinbizdeservice.BankClientFactory;

import com.patika.kredinbizdeservice.client.BankServiceClient;
import com.patika.kredinbizdeservice.client.garanti.GarantiClient;
import com.patika.kredinbizdeservice.client.akbank.AkbankClient;
import com.patika.kredinbizdeservice.enums.BankType;

public class BankClientFactory {
    public static BankServiceClient createBankClient(BankType bankName) {
        return switch (bankName) {
            case GARANTI -> new GarantiClient();
            case AKBANK -> new AkbankClient();
        };
    }
}