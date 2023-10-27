package com.waitylyou.mnative.controller;

import com.waitylyou.mnative.entity.AllocateOperation;
import com.waitylyou.mnative.service.MyService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author PING
 * @date 2023/10/26 14:10
 */
@RestController
@RequestMapping("/test")
public class MyController {

    private final MyService myService;

    public MyController(MyService myService) {
        this.myService = myService;
    }

    @GetMapping("/str")
    public String getStr(){
        return myService.getStr();
    }

    @GetMapping("/list")
    public List<AllocateOperation> getList(){
        return myService.selectList();
    }

}
