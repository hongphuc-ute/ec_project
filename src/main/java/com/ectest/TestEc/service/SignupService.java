/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ectest.TestEc.service;

import com.ectest.TestEc.model.Signup;
import java.util.List;

/**
 *
 * @author PhucNguyen
 */
public interface SignupService {
    public Signup saveSignup(Signup signup);
    public List<Signup> getAllSignup();
    public Signup getSignupByID(int id);
    public void deleteSignup(int id);
    
}
