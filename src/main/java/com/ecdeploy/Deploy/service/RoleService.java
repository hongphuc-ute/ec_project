/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ecdeploy.Deploy.service;

import com.ecdeploy.Deploy.model.Account;
import com.ecdeploy.Deploy.model.Role;
import java.util.List;

/**
 *
 * @author PhucNguyen
 */
public interface RoleService {
    public List<Role> getAllRole();
    public Role saveRole(Role role);
}
