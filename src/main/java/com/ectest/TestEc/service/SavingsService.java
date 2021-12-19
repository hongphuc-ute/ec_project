/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ectest.TestEc.service;

import com.ectest.TestEc.model.Savings;
import java.util.List;

/**
 *
 * @author PhucNguyen
 */
public interface SavingsService {

    public Savings saveSavings(Savings savings);

    public List<Savings> getAllSavings();

    public void updateSavings(Savings savings);

    public void deleteSavings(int id);
    
    public Savings getSavingsByID(int id);

}
