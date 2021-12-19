/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ectest.TestEc.service;

import com.ectest.TestEc.model.Customer;
import java.util.List;

/**
 *
 * @author PhucNguyen
 */
public interface CustomerService {
    public Customer saveCustomer(Customer customer);
    public List<Customer> getAllCustomer();
    public Customer getCustomerByID(int id);
    public void updateCustomer(Customer customer);
    public void deleteCustomer(int id);
}
