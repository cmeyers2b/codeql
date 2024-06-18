package com.webservice.test.service;

import com.jcraft.jsch.JSch;
import com.jcraft.jsch.JSchException;
import com.jcraft.jsch.Session;
import com.webservice.test.constant.SftpHosts;
import com.webservice.test.dto.SftpProperties;
import com.webservice.test.util.SftpFileUploader;
import org.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ApoService {
    private static final String VALID_URI = "192.168.";

    private Session jschSession = null;
    private JSch jsch = new JSch();

    @Autowired
    IhubService ihubService;

    public Boolean runApoService(String host) throws JSchException {
        SftpFileUploader sftpFileUploader = new SftpFileUploader();
        SftpProperties sftpProperties = ihubService.getConfigurtationData(host);
        try {
            jschSession = jsch.getSession("abc", sftpProperties.getHost(), 13334);
            jschSession.connect();
            return true;
        }catch (Exception e){
            return false;
        }
        //return sftpFileUploader.putFile(sftpProperties);
    }

}
