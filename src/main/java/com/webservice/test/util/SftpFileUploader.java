package com.webservice.test.util;

import com.jcraft.jsch.JSch;
import com.jcraft.jsch.JSchException;
import com.jcraft.jsch.Session;
import com.webservice.test.dto.SftpProperties;

public class SftpFileUploader {

    private Session jschSession = null;
    private JSch jsch = new JSch();

    public boolean putFile(SftpProperties sftpProperties) throws JSchException {

        jschSession = jsch.getSession("abc", sftpProperties.getHost(), 13334);

        return true;
    }

}
