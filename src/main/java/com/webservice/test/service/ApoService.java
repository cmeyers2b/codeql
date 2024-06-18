package com.webservice.test.service;

import com.jcraft.jsch.JSch;
import com.jcraft.jsch.JSchException;
import com.jcraft.jsch.Session;
import com.webservice.test.dto.SftpProperties;
import com.webservice.test.util.SftpFileUploader;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ApoService {

    @Autowired
    SftpProperties sftpProperties;

    @Autowired
    SftpFileUploader sftpFileUploader;
    private Session jschSession = null;
    private JSch jsch = new JSch();

    public Boolean runApoService(String host) throws JSchException {
        sftpProperties.setHost(host);

        if(sftpProperties.getHost().contains("www.google.com")) {
            jschSession = jsch.getSession("abc", sftpProperties.getHost(), 13334);
        }
        return true;
    }

}
