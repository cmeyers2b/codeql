package com.webservice.test.controller;

import com.jcraft.jsch.JSchException;
import com.webservice.test.service.ApoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import com.jcraft.jsch.Session;


@RestController
public class FirstController {

    @Autowired
    ApoService apoService;

    private Session jschSession = null;

    @GetMapping("/first")
    public String first(@RequestParam("first") String first){
        return first;
    }

    @PostMapping("/host-name")
    public Boolean second(@RequestParam("host") String host) throws JSchException {

        return apoService.runApoService(host);
    }

}
