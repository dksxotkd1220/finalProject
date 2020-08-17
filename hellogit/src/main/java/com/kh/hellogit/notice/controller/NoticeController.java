package com.kh.hellogit.notice.controller;

import org.springframework.web.bind.annotation.RequestMapping;

public class NoticeController {
	@RequestMapping("insert.no")
	public String noticeInsert() {
		return "home";
	}
	
	
}
