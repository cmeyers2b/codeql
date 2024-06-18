package com.webservice.test.constant;

import com.google.gson.Gson;

import java.util.HashSet;

public class SftpHosts {

    public static final HashSet<String> hosts = new Gson().fromJson("[\"www.google.com\", \"www.amazon.com\", \"192.168.0.0.1\"]", HashSet.class);

    public static final String[] arrayHosts = new String[]{"test", "test2"};

}
