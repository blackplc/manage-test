package com.example.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.servlet.http.HttpSession;

@Controller
@RequestMapping("/manage")
public class ManageController {


    @RequestMapping(value = "/{username}",method = RequestMethod.GET)
    public String getManage(@PathVariable("username") String username,HttpSession session){
        if(session.getAttribute(username) == null){
            return "redirect:/login";
        }
        return "manage";
    }
}
