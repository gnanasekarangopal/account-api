package com.acc.training.accountapi.controller;

import javax.validation.Valid;

import com.acc.training.accountapi.api.AccountApi;
import com.acc.training.accountapi.model.Account;
import com.acc.training.accountapi.model.InlineResponse200;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AccountController implements AccountApi {

    @Override
    public ResponseEntity<Account> createAccount(@Valid Account body) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public ResponseEntity<InlineResponse200> deleteAccount(String id) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public ResponseEntity<Account> getAccount(String id) {

        Account stubResponse = new Account();
        stubResponse.setAccountId("12345");
        stubResponse.setAccountNumber("12345678");
        stubResponse.setAccountHolderName("Gnanasekaran Gopal");
        stubResponse.setAccountBranch("Hartford, CT");
        
        return ResponseEntity.status(HttpStatus.OK).body(stubResponse);
    }

    @Override
    public ResponseEntity<Account> updateAccount(@Valid Account body) {
        // TODO Auto-generated method stub
        return null;
    }   
    
}
