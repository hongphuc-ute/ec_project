/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ecdeploy.Deploy.controller;

import com.ecdeploy.Deploy.model.Savings;
import com.ecdeploy.Deploy.service.SavingsService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
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
@RequestMapping("/savings")
@CrossOrigin
public class SavingsController {
    @Autowired
    private SavingsService savingsService;
    
    @PostMapping("/add")
    public String add(@RequestBody Savings savings){
        savingsService.saveSavings(savings);    
        return "New savings is added !";
    }
    
    @GetMapping("/getAll")
    public List<Savings> getAllRole(){
        return savingsService.getAllSavings();
    }
    
    @PutMapping("/update")
    public void updateSavings(@RequestBody Savings savings){
        savingsService.updateSavings(savings);
    }
    
    @DeleteMapping("/delete/{id}")
    public void deleteSavings(@PathVariable int id){
        savingsService.deleteSavings(id);
    }
    
    @GetMapping("/getByID/{id}")
    public Savings getSavingsByID(@PathVariable int id){
        return savingsService.getSavingsByID(id);
    }
    
}
