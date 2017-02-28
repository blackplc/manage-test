package com.example.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Created by byhieg on 17/1/8.
 * Mail to byhieg@gmail.com
 */
@Controller
@RequestMapping("/apiManage/index")
public class RunDetailController {

    @RequestMapping(value = "/runDetail/{id}",method = RequestMethod.GET)
    public String getRundetail(@PathVariable("id") String id){
        switch (id) {
            case "1":
                return "cpsRunDetail";

            case "3":
                return "fileRunDetail";

            default:
                return null;
        }
    }
}
