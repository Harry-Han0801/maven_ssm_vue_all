package com.hwua.controller;

import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.hwua.entity.User;
import com.hwua.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserService userService;

    @RequestMapping("/select_all_user")
    @ResponseBody
    public Object selectUser(@RequestParam(name = "pageNum",required = true,defaultValue = "1")Integer pageNum,
            @RequestParam(name = "pageSize",required = true,defaultValue = "5")Integer pageSize){
        System.out.println(pageNum+"--"+pageSize);
        Page<Object> page = PageHelper.startPage(pageNum, pageSize);
        List<User> list = userService.selectUser();
        PageInfo<User> info = new PageInfo<>(list);
        System.out.println(info);
        return info;
    }
}
