package com.example.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Created by byhieg on 16-8-17.
 */
@Controller
@RequestMapping("/")
public class IndexController {

    @RequestMapping(method = RequestMethod.GET)
    public String getIndex(){
        return "redirect:/login";
    }
}
