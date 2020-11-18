package com.xf.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.naming.event.ObjectChangeListener;
import java.util.HashMap;
import java.util.Map;

@Controller
public class indexController {
    @RequestMapping("/say")
    @ResponseBody
    public String say(){
        return "hello say";
    }
    @RequestMapping("/hi")
    public @ResponseBody Map<String,Object> hi(){
        Map<String, Object> map = new HashMap<>();
        map.put("message","SpringBoot Project");
        return map;
    }
}
