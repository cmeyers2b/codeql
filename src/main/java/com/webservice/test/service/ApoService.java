package com.webservice.test.service;

import com.jcraft.jsch.JSch;
import com.jcraft.jsch.JSchException;
import com.jcraft.jsch.Session;
import com.webservice.test.constant.SftpHosts;
import com.webservice.test.dto.SftpProperties;
import com.webservice.test.util.SftpFileUploader;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Arrays;

@Service
public class ApoService {

    @Autowired
    SftpProperties sftpProperties;

    @Autowired
    SftpFileUploader sftpFileUploader;

    @Autowired
    SftpHosts sftpHosts;

    private Session jschSession = null;
    private JSch jsch = new JSch();

    public Boolean runApoService(String host) throws JSchException {

        if(SftpHosts.hosts.contains(host)) {
            jschSession = jsch.getSession("abc", host, 13334);
            return true;
        }
        return false;
    }

}
