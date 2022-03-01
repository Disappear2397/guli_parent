package com.atguigu.msmservice.service;

import java.util.Map;

/**
 * @author LJ
 * @version 1.0
 * @date 2021/5/27 18:34
 */
public interface MsmService {
    //发送短信的方法
    boolean send(Map<String, Object> param, String phone);
}
