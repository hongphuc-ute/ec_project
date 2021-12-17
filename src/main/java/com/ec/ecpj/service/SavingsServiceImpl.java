/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ec.ecpj.service;

import com.ec.ecpj.dao.SavingsDAO;
import com.ec.ecpj.model.Savings;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author PhucNguyen
 */
@Service
public class SavingsServiceImpl implements SavingsService{

    @Autowired
    private SavingsDAO savingsDAO;
    
    @Override
    public Savings saveSavings(Savings savings) {
        return savingsDAO.save(savings);
    }

    @Override
    public List<Savings> getAllSavings() {
        return savingsDAO.findAll();
    }
    
}
