package com.example.Controller;

import com.example.Model.Api;
import com.example.Model.Program;
import com.example.Repository.ApiRepository;
import com.example.Repository.ProgramRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * Created by byhieg on 17/1/3.
 * Mail to byhieg@gmail.com
 */
@Controller
@RequestMapping("/apiManage/api/v1")
public class ManageInfoController {

    @Autowired
    ProgramRepository programRepository;

    @Autowired
    ApiRepository apiRepository;

    @RequestMapping(value = "/apiNames",method = RequestMethod.GET)
    @ResponseBody
    public List<Program> getApiName(){
        return programRepository.findAll();
    }

    @RequestMapping(value = "/{apiID}/apiDetail",method = RequestMethod.GET)
    @ResponseBody
    public List<Api> getApiDetail(@PathVariable("apiID")String apiID){
        return apiRepository.findAll();
    }

    @RequestMapping(value = "/{apiID}/apiDetail/md",method = RequestMethod.GET)
    public String getDetail(@PathVariable("apiID")String apiID){
        return "detailMD";
    }


}
