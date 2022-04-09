/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.nmh.service.impl;

import com.cloudinary.Cloudinary;
import com.cloudinary.utils.ObjectUtils;
import com.nmh.pojo.User;
import com.nmh.repository.UserRepository;
import com.nmh.service.UserService;
import java.io.IOException;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author Asus
 */
@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserRepository userRepository;
    @Autowired
    private Cloudinary cloudinary;

    @Override
    public boolean addUser(User user) {
        if (user.getFile() != null) {
            try {
                Map res = this.cloudinary.uploader().upload(user.getFile().getBytes(),
                        ObjectUtils.asMap("resource_type", "auto"));
                user.setAvatar(res.get("secure_url").toString());
            } catch (IOException ex) {
                Logger.getLogger(UserServiceImpl.class.getName()).log(Level.SEVERE, null, ex);
            }
        }

        return this.userRepository.addUser(user);
    }

}
