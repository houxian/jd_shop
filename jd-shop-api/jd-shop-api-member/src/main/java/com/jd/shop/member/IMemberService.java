package com.jd.shop.member;

import com.jd.shop.weixin.entity.AppEntity;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

@Api("会员服务接口")
public interface IMemberService {
    /**
     * 会员服务接口调用微信接口
     *
     * @return
     */
    @ApiOperation(value = "会员调用微信服务接口")
    public AppEntity memberInvokeWeixin();
}
