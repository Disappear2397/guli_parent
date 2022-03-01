package com.atguigu.eduservice.client;

import com.atguigu.eduservice.entity.ucenter_member.UcenterMember;
import org.springframework.stereotype.Component;

/**
 * @author LJ
 * @version 1.0
 * @date 2021/6/4 19:17
 */
@Component
public class FeignToUcenterClientImpl implements FeignToUcenterClient {
    @Override
    public UcenterMember selectById(String id) {
        return null;
    }
}
