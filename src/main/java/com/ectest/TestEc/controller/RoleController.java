/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ectest.TestEc.controller;
import com.ectest.TestEc.model.Role;
import com.ectest.TestEc.service.RoleService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
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
    
    @PutMapping("/update")
    public void updateRole(@RequestBody Role role){
        roleService.updateRole(role);
    }
    
    @DeleteMapping("/delete/{id}")
    public void deleteRole(@PathVariable int id)
    {
        roleService.deleteRole(id);
    }
    
}
