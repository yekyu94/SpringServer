package com.youngq.tistory.SpringServer.controller;

import com.youngq.tistory.SpringServer.vo.TestVo;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import java.util.ArrayList;
import java.util.List;

@RestController
public class IndexController {
    @RequestMapping(value = "/home")
    public String home(){
        return "index.html";
    }
    @RequestMapping("valueTest")
    public String valueTest(){
        String value = "Return Test";

        return value;
    }

    @RequestMapping("thymeleafTest")
    public String thymeleafTest(Model model){
        TestVo testModel = new TestVo("yekyu94", "youngQ");
        model.addAttribute("testModel", testModel);
        return "thymeleaf/thymeleafTest";
    }
}