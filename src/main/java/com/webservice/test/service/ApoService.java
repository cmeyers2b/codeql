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

    private Session jschSession = null;
    private JSch jsch = new JSch();

    @Autowired
    IhubService ihubService;

    public Boolean runApoService(String host) throws JSchException {
        SftpFileUploader sftpFileUploader = new SftpFileUploader();
        SftpProperties sftpProperties = new SftpProperties();
        sftpProperties.setHost(host);
        String hostName = ihubService.getConfigurtationData(host);
        sftpProperties.setHost(hostName);
        return sftpFileUploader.putFile(sftpProperties);
    }

}
