/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ecdeploy.Deploy.model;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.MappedSuperclass;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author PhucNguyen
 */
@Entity
@Table(name = "signup")
@XmlRootElement
public class Signup {

    @Id
    @Basic(optional = false)
    @Column(name = "IDSignup")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer iDSignup;
    @Column(name = "Branch")
    private String branch;
    @JoinColumn(name = "IDAccount", referencedColumnName = "IDAccount")
    @ManyToOne
    private Account iDAccount;
    @JoinColumn(name = "IDCustomer", referencedColumnName = "IDCustomer")
    @ManyToOne
    private Customer iDCustomer;

    public Signup() {
    }

    public Integer getIDSignup() {
        return iDSignup;
    }

    public void setIDSignup(Integer iDSignup) {
        this.iDSignup = iDSignup;
    }

    public String getBranch() {
        return branch;
    }

    public void setBranch(String branch) {
        this.branch = branch;
    }

    public Account getIDAccount() {
        return iDAccount;
    }

    public void setIDAccount(Account iDAccount) {
        this.iDAccount = iDAccount;
    }

    public Customer getIDCustomer() {
        return iDCustomer;
    }

    public void setIDCustomer(Customer iDCustomer) {
        this.iDCustomer = iDCustomer;
    }

   
    
}
