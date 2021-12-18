/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ecdeploy.Deploy.service;

import com.ecdeploy.Deploy.dao.SavingsDAO;
import com.ecdeploy.Deploy.model.Savings;
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

    @Override
    public void updateSavings(Savings savings) {
        savingsDAO.save(savings);
    }

    @Override
    public void deleteSavings(int id) {
        savingsDAO.deleteById(id);
    }

    @Override
    public Savings getSavingsByID(int id) {
       return savingsDAO.findById(id).get();
    }
    
}
