package com.example.Controller;

import com.example.Tools.HandleSession;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.servlet.http.HttpSession;
import java.io.IOException;

/**
 * Created by byhieg on 16-8-19.
 */

@Controller
public class FileUploadController {

    @RequestMapping(value = "/upload",method = RequestMethod.GET)
    public String putPic(HttpSession session) throws IOException {
        if (session.getAttribute(HandleSession.getUsername()) == null) {
            return "redirect:/login";
        }
        return "upload";
    }

}
