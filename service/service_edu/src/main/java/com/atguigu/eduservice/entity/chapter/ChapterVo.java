package com.atguigu.eduservice.entity.chapter;

import lombok.Data;

import java.util.ArrayList;
import java.util.List;

/**
 * @author LJ
 * @version 1.0
 * @date 2021/5/22 16:24
 */
@Data
public class ChapterVo {

    private String id;

    private String title;

    //表示小节
    private List<VideoVo> children = new ArrayList<>();
}
