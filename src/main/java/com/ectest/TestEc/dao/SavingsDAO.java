/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ectest.TestEc.dao;

import com.ectest.TestEc.model.Savings;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 *
 * @author PhucNguyen
 */
public interface SavingsDAO extends JpaRepository<Savings, Integer>{
    
}
