package com.kh.hellogit.goods.controller;

import org.springframework.web.bind.annotation.RequestMapping;

public class GoodsController {
	@RequestMapping("login.do")
		public String GoodsLogin(String id, String pwd) {
			return "hone";
		}
}
