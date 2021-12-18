/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ecdeploy.Deploy.model;

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
@Table(name = "customer")
@XmlRootElement
public class Customer {

    @Id
    @Basic(optional = false)
    @Column(name = "IDCustomer")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer iDCustomer;
    @Column(name = "Name")
    private String name;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "AccountBalance")
    private Double accountBalance;
    @Column(name = "AccountNumber")
    private String accountNumber;
    @Column(name = "PhoneNumber")
    private String phoneNumber;
    @Column(name = "IdentityNumber")
    private String identityNumber;
    @Column(name = "Address")
    private String address;
    @OneToMany(mappedBy = "iDCustomer")
    private Collection<Signup> signupCollection;
    @JoinColumn(name = "IDAccount", referencedColumnName = "IDAccount")
    @ManyToOne
    private Account iDAccount;

    public Customer() {
    }

    public Customer(Integer iDCustomer) {
        this.iDCustomer = iDCustomer;
    }

    public Integer getIDCustomer() {
        return iDCustomer;
    }

    public void setIDCustomer(Integer iDCustomer) {
        this.iDCustomer = iDCustomer;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getAccountBalance() {
        return accountBalance;
    }

    public void setAccountBalance(Double accountBalance) {
        this.accountBalance = accountBalance;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getIdentityNumber() {
        return identityNumber;
    }

    public void setIdentityNumber(String identityNumber) {
        this.identityNumber = identityNumber;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }


    public Account getIDAccount() {
        return iDAccount;
    }

    public void setIDAccount(Account iDAccount) {
        this.iDAccount = iDAccount;
    }
    
}
