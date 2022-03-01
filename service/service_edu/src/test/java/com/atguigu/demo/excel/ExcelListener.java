package com.atguigu.demo.excel;

import com.alibaba.excel.context.AnalysisContext;
import com.alibaba.excel.event.AnalysisEventListener;
import com.alibaba.excel.read.listener.ReadListener;

import java.util.Map;

/**
 * @author LJ
 * @version 1.0
 * @date 2021/5/20 15:10
 */
public class ExcelListener extends AnalysisEventListener<DemoData> {
    //一行一行读取excel内容
    @Override
    public void invoke(DemoData data, AnalysisContext analysisContext) {
        System.out.println("****"+data);
    }
    //读取表头信息
    @Override
    public void invokeHeadMap(Map<Integer, String> headMap, AnalysisContext context) {
        System.out.println("表头："+headMap);
    }
    //读取完成之后执行
    @Override
    public void doAfterAllAnalysed(AnalysisContext analysisContext) { }
}
