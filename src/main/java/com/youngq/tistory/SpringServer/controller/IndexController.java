package com.youngq.tistory.SpringServer.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller
public class IndexController {
    @ResponseBody
    @RequestMapping(value = "/home")
    public String home(){
        return "index";
    }

    @ResponseBody
    @RequestMapping("valueTest")
    public String valueTest(){
        String value = "Return Test";

        return value;
    }

    @RequestMapping("/main")
    public ModelAndView mainPage() {
        ModelAndView modelAndView = new ModelAndView("thymeleaf/thymeleafTest2");

        modelAndView.addObject("name", "11");
        modelAndView.addObject("id", "i22d");

        return modelAndView;
    }

}