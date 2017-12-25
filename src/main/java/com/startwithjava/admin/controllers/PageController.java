package com.startwithjava.admin.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/admin/pages")
public class PageController {
	@RequestMapping("/list")
	public String list(Model model) {
		return "admin/pages/list";
	}
	@RequestMapping("/add")
	public String add(Model model) {
		model.addAttribute("title","Add Page");
		return "admin/pages/add";
	}
}
