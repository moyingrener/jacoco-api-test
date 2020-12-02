package com.moyingren.controller;

import com.moyingren.result.ResponseResult;
import com.moyingren.service.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/test")
public class TestController {
    @Autowired
    private TestService testService;
    @GetMapping("/test1")
    public ResponseResult test1(){
        return testService.test01();
    }
    @GetMapping("/test2")
    public ResponseResult test2(){
        return testService.test02();
    }
    @GetMapping("/test3")
    public ResponseResult test3(){
        return testService.test03();
    }
    @GetMapping("/test4")
    public ResponseResult test4(){
        return testService.test04();
    }
    @GetMapping("/test5")
    public ResponseResult test5(){
        return testService.test05();
    }
}
