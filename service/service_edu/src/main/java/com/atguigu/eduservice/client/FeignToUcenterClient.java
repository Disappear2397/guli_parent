package com.atguigu.eduservice.client;

import com.atguigu.eduservice.entity.ucenter_member.UcenterMember;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

/**
 * @author LJ
 * @version 1.0
 * @date 2021/6/4 19:16
 */
public interface FeignToUcenterClient{
    @ApiOperation("根据id获取用户信息")
    @GetMapping("/ucenter_service/ucenter-member/selectById/{id}")
    public UcenterMember selectById(@ApiParam(name = "id", value = "用户id")
                                    @PathVariable(value = "id") String id);

}