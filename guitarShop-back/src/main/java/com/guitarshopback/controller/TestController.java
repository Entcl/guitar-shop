package com.guitarshopback.controller;


import com.google.gson.Gson;
import com.guitarShopBack.mapper.UserLoginMapper;
import com.guitarShopBack.pojo.UserLogin;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@CrossOrigin(origins = {"*","null"})
public class TestController {


    /**
     * 查询所有用户信息
     */
//    @GetMapping("/hello")
//    public List<User> hello() {
//        List<User> users = userMapper.selectUserList();
//        return users;
//    }

    private Gson gson =new Gson();

    @Autowired
    private UserLoginMapper userLoginMapper;

    @GetMapping("/user")
    public String test1(Model model) {

        List<UserLogin> userLogins = userLoginMapper.selectByExample(null);
//        System.out.println(userLogins);
        model.addAttribute(userLogins);
        return gson.toJson(model);
    }

    @PostMapping("/user2")
    public String test2(Model model) {

        List<UserLogin> userLogins = userLoginMapper.selectByExample(null);
//        System.out.println(userLogins);
        model.addAttribute("body",userLogins);
        model.addAttribute("code","200");
        return gson.toJson(model);
    }
}
