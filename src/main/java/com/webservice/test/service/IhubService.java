package com.webservice.test.service;

import com.webservice.test.constant.SftpHosts;
import org.json.JSONObject;

public interface IhubService {

    SftpHosts getConfigurtationData(String host);

}
