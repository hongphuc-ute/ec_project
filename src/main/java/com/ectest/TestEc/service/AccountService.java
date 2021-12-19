/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ectest.TestEc.service;

import com.ectest.TestEc.model.Account;
import java.util.List;

/**
 *
 * @author PhucNguyen
 */
public interface AccountService {
    public List<Account> getAllAccount();
    public Account saveAccount(Account account);
    public Account getAccountByID(int id);
    public void updateAccount(Account account);
    public void deleteAccount(int id);
    
}
