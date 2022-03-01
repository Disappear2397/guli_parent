package com.atguigu.demo.excel;

import com.alibaba.excel.annotation.ExcelProperty;
import lombok.Data;

/**
 * @author LJ
 * @version 1.0
 * @date 2021/5/20 15:05
 */
@Data
public class DemoData{
    //设置excel表头名称
    @ExcelProperty(value = "学生编号",index = 0)
    private Integer sno;
    @ExcelProperty(value = "学生姓名",index = 1)
    private String sname;
}
