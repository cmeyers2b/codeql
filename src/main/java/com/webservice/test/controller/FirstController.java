package com.webservice.test.controller;

import com.jcraft.jsch.JSch;
import com.jcraft.jsch.JSchException;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import com.jcraft.jsch.Session;
import com.jcraft.jsch.JSch;


@RestController
public class FirstController {

    private Session jschSession = null;
    private JSch jsch = new JSch();

    @GetMapping("/first")
    public String first(@RequestParam("first") String first){
        return first;
    }

    @GetMapping("/second")
    public String second(@RequestParam("second") String second) throws JSchException {
        jschSession = jsch.getSession("abc", second, 13334);
        return "done";
    }

}
