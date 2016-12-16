package com.example.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.servlet.http.HttpSession;

@Controller
@RequestMapping("/apiManage/index")
public class ManageController {

//    private String userInfoname;
//    private Gson gson = new Gson();


    @RequestMapping(value = "/{username}",method = RequestMethod.GET)
    public String getManage(@PathVariable("username") String username,
                            HttpSession session,
                            Model model){
        if(session.getAttribute(username) == null){
            return "redirect:/apiManage/login";
        }
        model.addAttribute("username", username);
        return "manage";
    }

}
