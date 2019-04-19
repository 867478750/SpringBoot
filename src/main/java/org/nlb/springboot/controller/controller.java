package org.nlb.springboot.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class controller {

    @RequestMapping("/request1")
    public String controller1(){
        return "success";
    }
}
