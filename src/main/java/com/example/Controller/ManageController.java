package com.example.Controller;

import com.example.Model.Program;
import com.example.Repository.ProgramRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.servlet.http.HttpSession;
import java.util.List;

@Controller
@RequestMapping("/apiManage/index")
public class ManageController {

//    private String userInfoname;
//    private Gson gson = new Gson();

    @Autowired
    ProgramRepository programRepository;


    @RequestMapping(value = "/{username}",method = RequestMethod.GET)
    public String getManage(@PathVariable("username") String username,
                            HttpSession session,
                            Model model){
        if(session.getAttribute(username) == null){
            return "redirect:/apiManage/login";
        }
        List<Program> programs = programRepository.findAll();
        model.addAttribute("username", username);
        model.addAttribute("name1", programs.get(0));
        model.addAttribute("name2", programs.get(1));
        model.addAttribute("name3", programs.get(2));
        model.addAttribute("name4", programs.get(3));
        return "manage";
    }

}
