package com.webservice.test.service;

import com.webservice.test.constant.SftpHosts;
import org.json.JSONObject;

public interface IhubService {

    JSONObject getConfigurtationData(String host);

}
