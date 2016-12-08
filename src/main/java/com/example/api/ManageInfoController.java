package com.example.api;

import com.example.Model.Api;
import com.example.Model.ApiMd;
import com.example.Model.Program;
import com.example.Repository.ApiMdRepository;
import com.example.Repository.ApiRepository;
import com.example.Repository.ProgramRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.persistence.criteria.CriteriaBuilder;
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

    @Autowired
    ApiMdRepository apiMdRepository;

    @RequestMapping(value = "/apiNames",method = RequestMethod.GET)
    @ResponseBody
    public List<Program> getApiName(){
        return programRepository.findAll();
    }

    @RequestMapping(value = "/{apiID}/apiDetail",method = RequestMethod.GET)
    @ResponseBody
    public List<Api> getApiDetail(@PathVariable("apiID")String apiID){
        return apiRepository.findByMark(Integer.parseInt(apiID));
    }

    @RequestMapping(value = "/{apiID}/apiDetail/md",method = RequestMethod.GET)
    public String getDetail(@PathVariable("apiID")String apiID){

        return apiMdRepository.findByMark(Integer.parseInt(apiID)).getName();
    }


}
