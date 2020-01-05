package com.jd.server.weixin.impl;

import com.jd.shop.weixin.entity.AppEntity;
import com.jd.shop.weixin.service.IWeixinService;
import org.springframework.web.bind.annotation.RestController;


/**
 * 
 * 
 * @description:微信服务接口的实现
 * @author: houxianyong
 * @contact: houxian1103@163.com
 * @date: 2020年1月4日
 * @version V1.0
 * @Copyright 该项目“基于SpringCloud2.x构建微服务项目
 */
@RestController
public class WeiXinAppServiceImpl implements IWeixinService {

	@Override
	public AppEntity getApp() {
		return new AppEntity("644064779", "houxianyong");
	}

}
