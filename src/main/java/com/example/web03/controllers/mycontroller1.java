package com.example.web03.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import javax.servlet.http.HttpSession;
import java.util.Map;
@Controller
public class mycontroller1 {
    @RequestMapping(value = "login")
    public  String viewlogin(@RequestParam("username") String username, @RequestParam("password") String password,
                             Map<String,String> map, HttpSession session ){
        if(username.equals("zs")&&password.equals("123"))
        {
            map.put("username", username);
            session.setAttribute("Loginuser", username);
            return "redirect:/dashbord";
        }
        else{
            map.put("msg", "密码错误，请重新登陆");
            return "login";
        }

    }
}
