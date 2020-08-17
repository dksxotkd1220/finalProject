package com.kh.hellogit.manager.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ManagerController {
	@RequestMapping("managerMain.do")
	public String managerMain(String id) {
		return "managerMain";
	}
}
