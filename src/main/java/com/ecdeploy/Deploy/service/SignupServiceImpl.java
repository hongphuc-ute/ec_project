/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ecdeploy.Deploy.service;

import com.ecdeploy.Deploy.dao.SignupDAO;
import com.ecdeploy.Deploy.model.Signup;
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

    @Override
    public Signup getSignupByID(int id) {
        return signupDAO.findById(id).get();
    }

    @Override
    public void deleteSignup(int id) {
        signupDAO.deleteById(id);
    }

}
