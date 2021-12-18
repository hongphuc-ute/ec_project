/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ecdeploy.Deploy.service;

import com.ecdeploy.Deploy.dao.AccountDAO;
import com.ecdeploy.Deploy.model.Account;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author PhucNguyen
 */
@Service
public class AccountServiceImpl implements AccountService{

    @Autowired
    private AccountDAO accountDAO;
    
    
    @Override
    public List<Account> getAllAccount() {
       return accountDAO.findAll();
    }

    @Override
    public Account saveAccount(Account account) {
        return accountDAO.save(account);
    }

    @Override
    public Account getAccountByID(int id) {
        return accountDAO.findById(id).get();
    }

    @Override
    public void updateAccount(Account account) {
        accountDAO.save(account);
    }

    @Override
    public void deleteAccount(int id) {
        accountDAO.deleteById(id);
    }
    
}
