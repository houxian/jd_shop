package com.jd.shop.weixin.entity;

import lombok.Data;

/**

 * @description: App实体类层
 * @author: houxianyong
 * @contact: houxian1103@163.com
 * @date: 2019年1月3日 下午3:03:17
 * @version V1.0
 * @Copyright 该项目“基于SpringCloud2.x构建微服务项目
 */
@Data
public class AppEntity {

	/**
	 * appid
	 */
	private String appId;
	/**
	 * 应用名称
	 */
	private String appName;

	public AppEntity() {

	}

	public AppEntity(String appId, String appName) {
		super();
		this.appId = appId;
		this.appName = appName;
	}

}
