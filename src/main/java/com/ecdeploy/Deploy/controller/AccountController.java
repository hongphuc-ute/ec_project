/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ecdeploy.Deploy.controller;

import com.ecdeploy.Deploy.dao.AccountDAO;
import com.ecdeploy.Deploy.model.Account;
import com.ecdeploy.Deploy.service.AccountService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.Repository;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
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
    public String add(@RequestBody Account account) {
        accountService.saveAccount(account);
        return "New account is added !";
    }

    @GetMapping("/getAll")
    public List<Account> getAllAccount() {
        return accountService.getAllAccount();
    }

    @GetMapping("/getByID/{id}")
    public Account getAccountByID(@PathVariable int id) {
        return accountService.getAccountByID(id);
    }
    
    @PutMapping("/update")
    public void updateAccount(@RequestBody Account account){
        accountService.updateAccount(account);
    }

    @DeleteMapping("/delete/{id}")
    public void deleteAccount(@PathVariable int id){
        accountService.deleteAccount(id);
    }
    
    
}
