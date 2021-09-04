package com.lch.dubbo.web;

import com.lch.dubbo.model.User;
import com.lch.dubbo.service.UserService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;

@Controller
public class UserController {
    @Resource
    private UserService userService;
    @Resource
    private UserService userService02;

    @RequestMapping("/userDetail")
    public String userDetail(Model model, Integer id){
        User user = userService.queryUserById(id);
        User user2 = userService02.queryUserById(id);

        Integer allUserCount = userService.queryAllUserCount();

        model.addAttribute("user", user);
        model.addAttribute("user2", user2);
        model.addAttribute("count", allUserCount);
        return "userDetail";
    }
}