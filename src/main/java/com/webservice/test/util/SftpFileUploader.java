package com.webservice.test.util;

import com.jcraft.jsch.JSch;
import com.jcraft.jsch.JSchException;
import com.jcraft.jsch.Session;
import com.jcraft.jsch.UserInfo;
import com.webservice.test.constant.SftpHosts;
import com.webservice.test.dto.SftpProperties;
import com.webservice.test.service.IhubService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.util.UriComponentsBuilder;

import java.net.URI;

public class SftpFileUploader {

    private static final String VALID_URI = "www.google.com";
    private Session jschSession = null;
    private JSch jsch = new JSch();

    public String host;

    public boolean putFile(SftpProperties sftpProperties) throws JSchException {

        try {
            if (SftpHosts.hosts.contains(sftpProperties.getHost())) {
                jschSession = jsch.getSession("abc", sftpProperties.getHost(), 13334);
                jschSession.connect();
                return true;
            }
        }catch (Exception e){
            return false;
        }
//        if(SftpHosts.hosts.contains(host)) {
//            jschSession = jsch.getSession("abc", host, 13334);
//            return true;
//        }else if (SftpHosts.arrayHosts[0].equals(host)){
//            jschSession = jsch.getSession("abc", SftpHosts.arrayHosts[0], 13334);
//            return true;
//        }
        return false;
    }

}
