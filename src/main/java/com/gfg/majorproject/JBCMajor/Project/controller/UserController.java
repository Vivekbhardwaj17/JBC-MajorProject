package com.gfg.majorproject.JBCMajor.Project.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

@RestController
public class UserController {

    @GetMapping("/userid/{name}/{name1}")
    public String userInfo(@PathVariable String name,@PathVariable String name1){
        RestTemplate restController =new RestTemplate();
  String url="http://codeforces.com/api/user.info?handles="+name+";"+name1;
        return restController.getForObject(url,String.class);
    }
}

