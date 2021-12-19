/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ectest.TestEc.service;

import com.ectest.TestEc.dao.CustomerDAO;
import com.ectest.TestEc.model.Customer;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author PhucNguyen
 */
@Service
public class CustomerServiceImpl implements CustomerService {

    @Autowired
    private CustomerDAO customerDAO;

    @Override
    public Customer saveCustomer(Customer customer) {
        return customerDAO.save(customer);
    }

    @Override
    public List<Customer> getAllCustomer() {
        return customerDAO.findAll();
    }

    @Override
    public Customer getCustomerByID(int id) {
        return customerDAO.findById(id).get();
    }

    @Override
    public void updateCustomer(Customer customer) {
        customerDAO.save(customer);
    }

    @Override
    public void deleteCustomer(int id) {
        customerDAO.deleteById(id);
    }

}
