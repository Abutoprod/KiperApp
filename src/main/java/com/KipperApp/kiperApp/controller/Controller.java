package com.KipperApp.kiperApp.controller;

import com.KipperApp.kiperApp.domain.User;
import com.KipperApp.kiperApp.service.Services;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/hello_world")
public class Controller {
    @Autowired// explica que essa dependencia tem que ser injetada
    private Services  service;



    // Responder as requisiçõe sgt do /hello-world
    @GetMapping
    public String hellowWorld()
    {
        return service.hellow(" tobias");
    }

    @PostMapping("")
    public String helloPost(@RequestBody User body)
    {
        return "nome: "+ body.getName()+ "\n"+
                "key: "+body.getKey();

    }
}
