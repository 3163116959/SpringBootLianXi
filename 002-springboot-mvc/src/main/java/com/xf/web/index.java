package com.xf.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class index {
    @RequestMapping(value = "/web/say")
    @ResponseBody
    public String say() {
        return "Hello SpringBoot";
    }
}
