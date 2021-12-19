/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ectest.TestEc.service;

import com.ectest.TestEc.dao.RoleDAO;
import com.ectest.TestEc.model.Role;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author PhucNguyen
 */
@Service
public class RoleServiceImpl implements RoleService {

    @Autowired
    private RoleDAO roleDAO;
    
    
    @Override
    public List<Role> getAllRole() {
        return roleDAO.findAll();
    }

    @Override
    public Role saveRole(Role role) {
        return roleDAO.save(role);
    }

    @Override
    public void updateRole(Role role) {
        roleDAO.save(role);
    }

    @Override
    public void deleteRole(int id) {
        roleDAO.deleteById(id);
    }

}
