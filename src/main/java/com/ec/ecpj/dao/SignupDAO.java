/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ec.ecpj.dao;

import com.ec.ecpj.model.Signup;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 *
 * @author PhucNguyen
 */
public interface SignupDAO extends JpaRepository<Signup, Integer>{
    
}
