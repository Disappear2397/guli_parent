package com.atguigu.vod.service;

import org.springframework.web.multipart.MultipartFile;

import java.util.List;

/**
 * @author LJ
 * @version 1.0
 * @date 2021/5/24 15:17
 */
public interface VodService {
    //上传视频到阿里云
    String uploadVideoAly(MultipartFile file);
    //删除多个阿里云视频的方法
    void removeMoreAlyVideo(List videoIdList);
}
