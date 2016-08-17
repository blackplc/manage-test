package com.example.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by byhieg on 16-8-17.
 */
@Controller
@RequestMapping("/error")
public class ErrorController {

    public String getError(){
        return "error";
    }

}
