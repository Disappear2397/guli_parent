package com.atguigu.eduorder.utils;

import java.util.Date;

import java.text.SimpleDateFormat;
import java.util.Random;

/**
 * @author LJ
 * @version 1.0
 * @date 2021/6/8 17:59
 */
public class OrderNoUtil {

    /**
     * 获取订单号
     * @return
     */
    public static String getOrderNo() {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMddHHmmss");
        String newDate = sdf.format(new Date());
        String result = "";
        Random random = new Random();
        for (int i = 0; i < 3; i++) {
            result += random.nextInt(10);
        }
        return newDate + result;
    }

}
