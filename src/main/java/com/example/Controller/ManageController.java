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
//        userInfoname = username;
        if(session.getAttribute(username) == null){
            return "redirect:/apiManage/login";
        }
        model.addAttribute("username", username);
        return "manage";
//        return "manage";
    }

//    @RequestMapping(value = "/user/info",method = RequestMethod.GET)
//    @ResponseBody
//    public String getManageUserInfo(HttpSession session){
//        if(session.getAttribute(userInfoname) == null){
//            return null;
//        }
//        ManageUser user = new ManageUser();
//        user.setUser(userInfoname);
//        return gson.toJson(user);
//    }
}
