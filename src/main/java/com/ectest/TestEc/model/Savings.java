/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ectest.TestEc.model;
import java.io.Serializable;
import java.util.Date;
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
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author PhucNguyen
 */
@Entity
@Table(name = "savings")
@XmlRootElement
public class Savings {
    @Id
    @Basic(optional = false)
    @Column(name = "IDSavings")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer iDSavings;
    @Column(name = "DepositAmount")
    private Double depositAmount;
    @Column(name = "Period")
    private Integer period;
    @Column(name = "InterestRate")
    private Float interestRate;
    @Column(name = "DayEnd")
    @Temporal(TemporalType.DATE)
    private Date dayEnd;
    @JoinColumn(name = "IDAccount", referencedColumnName = "IDAccount")
    @ManyToOne
    private Account iDAccount;

    public Savings() {
    }

    public Integer getIDSavings() {
        return iDSavings;
    }

    public void setIDSavings(Integer iDSavings) {
        this.iDSavings = iDSavings;
    }

    public Double getDepositAmount() {
        return depositAmount;
    }

    public void setDepositAmount(Double depositAmount) {
        this.depositAmount = depositAmount;
    }

    public Integer getPeriod() {
        return period;
    }

    public void setPeriod(Integer period) {
        this.period = period;
    }

    public Float getInterestRate() {
        return interestRate;
    }

    public void setInterestRate(Float interestRate) {
        this.interestRate = interestRate;
    }

    public Date getDayEnd() {
        return dayEnd;
    }

    public void setDayEnd(Date dayEnd) {
        this.dayEnd = dayEnd;
    }

    public Account getIDAccount() {
        return iDAccount;
    }

    public void setIDAccount(Account iDAccount) {
        this.iDAccount = iDAccount;
    }

  
    
}
