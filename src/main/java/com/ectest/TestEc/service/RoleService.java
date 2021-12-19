/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ectest.TestEc.service;

import com.ectest.TestEc.model.Account;
import com.ectest.TestEc.model.Role;
import java.util.List;

/**
 *
 * @author PhucNguyen
 */
public interface RoleService {
    public List<Role> getAllRole();
    public Role saveRole(Role role);
    public void updateRole(Role role);
    public void deleteRole(int id);
}
