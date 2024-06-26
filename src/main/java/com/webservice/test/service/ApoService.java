package com.webservice.test.service;

import com.jcraft.jsch.JSch;
import com.jcraft.jsch.JSchException;
import com.jcraft.jsch.Session;
import com.webservice.test.dto.SftpProperties;
import com.webservice.test.util.SftpFileUploader;
import org.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ApoService {

    private Session jschSession = null;
    private JSch jsch = new JSch();

    @Autowired
    IhubService ihubService;

    public Boolean runApoService(String host) throws JSchException {
        SftpFileUploader sftpFileUploader = new SftpFileUploader();
        SftpProperties sftpProperties = ihubService.getConfigurtationData(host);
        return sftpFileUploader.putFile(sftpProperties);
    }

    private Boolean put(String host){

        return true;
    }

}
