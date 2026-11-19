package com.example.store;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {
    @Value("${spring.application.name}")
    private String appName;

    @RequestMapping("/") //we have to give it an argument,slash represents the root of our website, when a request goes to the root of our website this method gets called.user need to send that request /
    public String index(){
        //when we send request to the root of our website, this method will be called
        System.out.println("appName: "+ appName);
        return "index.html";
    }
    private String getViewName(){
        return "index.html";
    }

}

//homecontroller kullanıcıya bir web sayfası görüntülemek için kullanılır