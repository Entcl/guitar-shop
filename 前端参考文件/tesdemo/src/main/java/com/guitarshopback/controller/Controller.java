package com.guitarshopback.controller;

import com.baomidou.mybatisplus.core.conditions.Wrapper;
import com.google.gson.Gson;
import com.guitarshopback.mapper.StudentMapper;
import com.guitarshopback.pojo.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class Controller {

    @Autowired
    StudentMapper studentMapper;

    private Gson gson = new Gson();


    @GetMapping("/test")
    public String test1() {
        List<Student> list = studentMapper.selectList(null);
        return gson.toJson(list);
    }


    @GetMapping("/del")
    public void test2() {
        String a1 = "{\"id\":13,\"number\":\"113\",\"name\":\"小白\",\"age\":14,\"chi\":78,\"math\":99,\"eng\":93}";
        Student s2 = gson.fromJson(a1, Student.class);
        studentMapper.deleteById(s2);
    }

    @GetMapping("/insert")
    public void test3() {
        String a1 = "{\"id\":13,\"number\":\"113\",\"name\":\"しろ\",\"age\":14,\"chi\":78,\"math\":99,\"eng\":93}";
        Student s2 = gson.fromJson(a1, Student.class);
        studentMapper.insert(s2);
    }

    @GetMapping("/update")
    public void test4() {
        String a1 = "{\"id\":13,\"number\":\"113\",\"name\":\"bebebebebeamdaze\",\"age\":14,\"chi\":78,\"math\":99,\"eng\":93}";
        Student s2 = gson.fromJson(a1, Student.class);
        studentMapper.updateById(s2);
    }

    @PostMapping("/update2")
    public String test5(@RequestBody Student student) {
        studentMapper.updateById(student);
        return "修改成功";
    }
}
