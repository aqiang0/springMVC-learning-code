package com.aqiang.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class RestFulController {

    /*
    *RestFul风格URL
    * 1，映射路径传入形参 @GetMapping("/restful/{p1}/{p2}")
    * 2，方法中使用@PathVariable，并且限定参数类型
    * 3，在浏览器输入http://localhost:8080/s3/restful/4/4，在hello.jsp中显示RestFulController8
     */
    @RequestMapping("/test/{p1}/{p2}")
    public String test(@PathVariable int p1,@PathVariable int p2, Model model){
        int result = p1+p2;
        model.addAttribute("msg","RestFulController"+result);
//        return "hello";//转发方法1
        return "forward:/hello";//转发方法2.转发至http://localhost:8080/s3/hello
    }

    /*
    * 重定向
    * */
    @GetMapping("/t1")
    public String test1(){
        return "redirect:/hello";//重定向至http://localhost:8080/s3/hello
    }
}
