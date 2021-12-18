/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ecdeploy.Deploy.service;

import com.ecdeploy.Deploy.dao.CustomerDAO;
import com.ecdeploy.Deploy.model.Customer;
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

}
