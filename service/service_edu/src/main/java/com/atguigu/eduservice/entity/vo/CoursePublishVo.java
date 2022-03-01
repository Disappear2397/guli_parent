package com.atguigu.eduservice.entity.vo;

import lombok.Data;

/**
 * @author LJ
 * @version 1.0
 * @date 2021/5/23 15:19
 */
@Data
public class CoursePublishVo {
    private String id;
    private String title;
    private String cover;
    private Integer lessonNum;
    private String subjectLevelOne;
    private String subjectLevelTwo;
    private String teacherName;
    private String price;//只用于显示
}