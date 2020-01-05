package com.jd.server.member.feign;

import com.jd.shop.weixin.service.IWeixinService;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;


@FeignClient(name = "jd-shop-weixin")
public interface WeiXinAppServiceFeign extends IWeixinService {

	// /**
	// * 功能说明： 应用服务接口
	// */
	// @GetMapping("/getApp")
	// public AppEntity getApp();

}
