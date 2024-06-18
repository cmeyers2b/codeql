package com.webservice.test.service;

import com.webservice.test.constant.SftpHosts;
import com.webservice.test.dto.SftpProperties;
import org.json.JSONObject;

public interface IhubService {

    SftpProperties getConfigurtationData(String host);

}
