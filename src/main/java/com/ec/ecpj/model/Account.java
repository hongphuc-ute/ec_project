/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ec.ecpj.model;

import java.io.Serializable;
import java.util.Collection;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.MappedSuperclass;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author PhucNguyen
 */
@Entity
@Table(name = "account")
@XmlRootElement
public class Account {

    @Id
    @Basic(optional = false)
    @Column(name = "IDAccount")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer iDAccount;
    @Column(name = "UserName")
    private String userName;
    @Column(name = "Password")
    private String password;
    @OneToMany(mappedBy = "iDAccount")
    private Collection<Savings> savingsCollection;
    @OneToMany(mappedBy = "iDAccount")
    private Collection<Signup> signupCollection;
    @JoinColumn(name = "IDRole", referencedColumnName = "IDRole")
    @ManyToOne
    private Role iDRole;
    @OneToMany(mappedBy = "iDAccount")
    private Collection<Customer> customerCollection;

    public Account() {
    }

    public Account(Integer iDAccount) {
        this.iDAccount = iDAccount;
    }

    public Integer getIDAccount() {
        return iDAccount;
    }

    public void setIDAccount(Integer iDAccount) {
        this.iDAccount = iDAccount;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    } 

    public Role getIDRole() {
        return iDRole;
    }

    public void setIDRole(Role iDRole) {
        this.iDRole = iDRole;
    }  
    
}
