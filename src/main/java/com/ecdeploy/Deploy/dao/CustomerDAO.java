/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ecdeploy.Deploy.dao;

import com.ecdeploy.Deploy.model.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 *
 * @author PhucNguyen
 */
public interface CustomerDAO extends JpaRepository<Customer, Integer>{
    
}
