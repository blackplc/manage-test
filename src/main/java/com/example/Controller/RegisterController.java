package com.example.Controller;

import com.example.Model.User;
import com.example.Repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;


@Controller
@RequestMapping(value = "/apiManage/register")
public class RegisterController {

    @Autowired
    private UserRepository userRepository;




    @RequestMapping(method = RequestMethod.GET)
    public String getRegister() {
        return "register";
    }


    @RequestMapping(method = RequestMethod.POST)
    public String doRegister(User user){
        userRepository.save(user);
        return "redirect:/apiManage/login";
    }
}

