package com.jd.shop.weixin.service;
import com.jd.shop.weixin.entity.AppEntity;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.GetMapping;


@Api(tags = "微信服务接口")
public  interface  IWeixinService {

    /**
     * 功能说明： 应用服务接口
     */
    @ApiOperation(value = "获取微信应用接口")
    @GetMapping("/getApp")
    public AppEntity getApp();
}
