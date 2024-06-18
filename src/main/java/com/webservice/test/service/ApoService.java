package com.webservice.test.service;

import com.jcraft.jsch.JSchException;
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

    public Boolean runApoService(String host) throws JSchException {

        if(host == "www.google.com")
        sftpProperties.setHost(host);

        return sftpFileUploader.putFile(sftpProperties);
    }

}
