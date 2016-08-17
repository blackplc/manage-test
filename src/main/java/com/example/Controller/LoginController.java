package com.example.Controller;

import com.example.Model.User;
import com.example.Repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpSession;
import java.util.List;

/**
 * Created by byhieg on 16-8-17.
 */
@Controller
@RequestMapping("/login")
public class LoginController {

    @Autowired
    private UserRepository userRepository;

    @RequestMapping(method = RequestMethod.GET)
    public String getLogin() {
        return "login";
    }

    @RequestMapping(method = RequestMethod.POST)
    public String doLogin(@RequestParam("name") String username,
                          @RequestParam("password") String password,
                          HttpSession session){

        List<User> userList = userRepository.findAll();
        for (User item : userList) {
            if(item.getName().equals(username)&& item.getPassword().equals(password)){
                session.setAttribute(username,true);
                return "redirect:/manage/" + username;
            }
        }
        return "error";
    }


}

