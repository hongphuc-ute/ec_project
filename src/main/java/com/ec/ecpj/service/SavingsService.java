/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ec.ecpj.service;

import com.ec.ecpj.model.Savings;
import java.util.List;

/**
 *
 * @author PhucNguyen
 */
public interface SavingsService {
    public Savings saveSavings(Savings savings);
    public List<Savings> getAllSavings();
}
