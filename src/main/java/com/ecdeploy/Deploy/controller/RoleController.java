/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ecdeploy.Deploy.controller;
import com.ecdeploy.Deploy.model.Role;
import com.ecdeploy.Deploy.service.RoleService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author PhucNguyen
 */
@RestController
@RequestMapping("/role")
public class RoleController {
    @Autowired
    private RoleService roleService;
    
    @PostMapping("/add")
    public String add(@RequestBody Role role){
        roleService.saveRole(role);    
        return "New role is added !";
    }
    
    @GetMapping("/getAll")
    public List<Role> getAllRole(){
        return roleService.getAllRole();
    }
}
