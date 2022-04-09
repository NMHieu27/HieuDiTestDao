/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.nmh.controller;

import com.nmh.pojo.User;
import com.nmh.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

/**
 *
 * @author Asus
 */
@Controller
public class UserController {

    @Autowired
    private UserService userService;

    @GetMapping("/")
    public String index(Model model) {
        model.addAttribute("user", new User());
        return "index";
    }

    @PostMapping("/")
    public String register(Model model, @ModelAttribute(value = "user") User user) {
        if (this.userService.addUser(user) == true)
            return "redirect:/";
        return "index";
//        if (user.getPass().isEmpty()) {
//            model.addAttribute("errMsg", "Nhập mật khẩu má ơi!!!");
//        } else {
//            if (this.userService.addUser(user) == true) {
//                return "redirect:/";
//            }
//
//            model.addAttribute("errMsg", "Co loi xay ra, vui long quay lai sau!!!");
//        }
    }
}
