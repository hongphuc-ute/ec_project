/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ec.ecpj.controller;

import com.ec.ecpj.model.Savings;
import com.ec.ecpj.service.SavingsService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
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
}
