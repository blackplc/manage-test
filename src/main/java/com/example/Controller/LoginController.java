package com.example.Controller;

import com.example.Model.User;
import com.example.Repository.UserRepository;
import com.example.Tools.HandleSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpSession;
import java.util.List;

/**
 * Created by byhieg on 16-8-17.
 */
@Controller
@RequestMapping("/apiManage/login")
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
                HandleSession.setUsername(username);
                return "redirect:/apiManage/index/" + username;
            }
        }
        return "error";
    }


}

