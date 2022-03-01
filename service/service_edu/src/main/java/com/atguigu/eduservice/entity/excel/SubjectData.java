package com.atguigu.eduservice.entity.excel;

import com.alibaba.excel.annotation.ExcelProperty;
import lombok.Data;

/**
 * @author LJ
 * @version 1.0
 * @date 2021/7/17 16:20
 */
@Data
public class SubjectData{
    //设置excel表头名称
    @ExcelProperty(value = "所述工贸",index = 0)
    private String scom;
    @ExcelProperty(value = "网点名称",index = 1)
    private String sname;
    @ExcelProperty(value = "产品型号",index = 2)
    private String snum;
    @ExcelProperty(value = "保修类型",index = 3)
    private String stype;
    @ExcelProperty(value = "服务类型",index = 4)
    private String service;
    @ExcelProperty(value = "服务措施",index = 5)
    private String sexe;
    @ExcelProperty(value = "服务工程师",index = 6)
    private String seng;
    @ExcelProperty(value = "产品对象",index = 7)
    private String speo;
    @ExcelProperty(value = "登记时间",index = 8)
    private String stime;
    @ExcelProperty(value = "结单时间",index = 9)
    private String send;
    @ExcelProperty(value = "评价结果",index = 10)
    private String seval;
    @ExcelProperty(value = "回访备注",index = 11)
    private String smark;
}
