/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ectest.TestEc.controller;

import com.ectest.TestEc.model.Signup;
import com.ectest.TestEc.service.SignupService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author PhucNguyen
 */
@RestController
@RequestMapping("/signup")
@CrossOrigin
public class SignupController {
    @Autowired
    private SignupService signupService;
    
    @PostMapping("/add")
    public String add(@RequestBody Signup signup){
        signupService.saveSignup(signup);    
        return "New signup is added !";
    }
    
    @GetMapping("/getAll")
    public List<Signup> getAllSignup(){
        return signupService.getAllSignup();
    }
    
    @GetMapping("/getByID/{id}")
    public Signup getSignupByID(@PathVariable int id){
        return signupService.getSignupByID(id);
    }
    
    @DeleteMapping("/delete/{id}")
    public void deleteSignup(@PathVariable int id){
        signupService.deleteSignup(id);
    }
}
