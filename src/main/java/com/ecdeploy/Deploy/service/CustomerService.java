/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ecdeploy.Deploy.service;

import com.ecdeploy.Deploy.model.Customer;
import java.util.List;

/**
 *
 * @author PhucNguyen
 */
public interface CustomerService {
    public Customer saveCustomer(Customer customer);
    public List<Customer> getAllCustomer();

}
