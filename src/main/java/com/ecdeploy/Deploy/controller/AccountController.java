/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ecdeploy.Deploy.controller;

import com.ecdeploy.Deploy.model.Account;
import com.ecdeploy.Deploy.service.AccountService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author PhucNguyen
 */
@RestController
@RequestMapping("/account")
public class AccountController {
    @Autowired
    private AccountService accountService;
    
    @PostMapping("/add")
    public String add(@RequestBody Account account){
        accountService.saveAccount(account);
        return "New account is added !";
    }
    
    @GetMapping("/getAll")
    public List<Account> getAllAccount(){
        return accountService.getAllAccount();
    }
}
