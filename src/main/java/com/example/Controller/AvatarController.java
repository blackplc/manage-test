package com.example.Controller;

import com.example.Model.ManageUser;
import com.example.Tools.HandleSession;
import com.google.common.io.ByteStreams;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;

/**
 * Created by byhieg on 16-8-19.
 */
@Controller
@RequestMapping("/avatar")
public class AvatarController {
    private Resource resource = new ClassPathResource("static/img/123.jpg");
    private boolean isSuccess = false;

    @RequestMapping(method = RequestMethod.GET)
    @ResponseBody
    public byte[] avatar() throws IOException {
        return ManageUser.avatar == null ? ByteStreams.toByteArray(resource.getInputStream()) : ManageUser.avatar;
    }

    @RequestMapping(method = RequestMethod.POST)
    public String upload(@RequestParam("file") MultipartFile file) throws IOException {
        ManageUser.avatar = file.getBytes();
        if (ManageUser.avatar != null) {
            isSuccess = true;
            return "redirect:/manage/" + HandleSession.getUsername();
        }else{
            return "redirect:/upload";
        }
    }

}
