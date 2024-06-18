package com.webservice.test.util;

import com.jcraft.jsch.JSch;
import com.jcraft.jsch.JSchException;
import com.jcraft.jsch.Session;
import com.webservice.test.constant.SftpHosts;
import com.webservice.test.dto.SftpProperties;

public class SftpFileUploader {

    private Session jschSession = null;
    private JSch jsch = new JSch();

    public String host;

    public boolean putFile(SftpProperties sftpProperties) throws JSchException {

        host = sftpProperties.getHost();

        if(SftpHosts.hosts.contains(host)) {
            jschSession = jsch.getSession("abc", host, 13334);
            return true;
        }else if (SftpHosts.arrayHosts[0].equals(host)){
            jschSession = jsch.getSession("abc", SftpHosts.arrayHosts[0], 13334);
            return true;
        }
        return false;
    }

}
