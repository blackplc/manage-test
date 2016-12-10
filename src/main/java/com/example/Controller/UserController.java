package com.example.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by byhieg on 16-8-18.
 */
@Controller
@RequestMapping("/apiManage/user")
public class UserController {

    @RequestMapping(value = "/info",method = RequestMethod.GET)
    @ResponseBody
    public String getInfo(){
        String userInfo = "{\n" +
                "    \"name\": [\n" +
                "        \"byhieg\"\n" +
                "    ],\n" +
                "    \"password\": [\n" +
                "        \"123456\"\n" +
                "    ]\n" +
                "}";
        return userInfo;
    }

    @RequestMapping(method = RequestMethod.GET)
    public String getText(){
        return "text";
    }
}
