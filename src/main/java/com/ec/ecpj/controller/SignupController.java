/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ec.ecpj.controller;

import com.ec.ecpj.model.Signup;
import com.ec.ecpj.service.SignupService;
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
}
