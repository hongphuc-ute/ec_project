/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ec.ecpj.service;

import com.ec.ecpj.dao.SignupDAO;
import com.ec.ecpj.model.Signup;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author PhucNguyen
 */
@Service
public class SignupServiceImpl implements SignupService {

    @Autowired
    private SignupDAO signupDAO;

    @Override
    public Signup saveSignup(Signup signup) {
        return signupDAO.save(signup);
    }

    @Override
    public List<Signup> getAllSignup() {
        return signupDAO.findAll();
    }

}
