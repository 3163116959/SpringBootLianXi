package com.xf.controller;/*--
  Created by IntelliJ IDEA.
  User: xuefei
  Date: 2020/9/26
  Time: 20:08
*/

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class indexController {

    //@Value注解拿出自己在application.properties里面自定义的属性值
    @Value("${school.name}")
    private String schoolName;

    @Value("${xf.age}")
    private String xfAge;

    @RequestMapping(value = "/say")
    public @ResponseBody String say(){
        return "Hello customer Configration"+"名字:"+schoolName+"年龄："+xfAge
                ;
    }
}
