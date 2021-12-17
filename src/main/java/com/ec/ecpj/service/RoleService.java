/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ec.ecpj.service;

import com.ec.ecpj.model.Account;
import com.ec.ecpj.model.Role;
import java.util.List;

/**
 *
 * @author PhucNguyen
 */
public interface RoleService {
    public List<Role> getAllRole();
    public Role saveRole(Role role);
}
