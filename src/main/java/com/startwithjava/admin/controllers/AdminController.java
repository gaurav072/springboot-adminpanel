package com.startwithjava.admin.controllers;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
@Controller
public class AdminController {
	@GetMapping("/admin/test")
	public String test() {
		return "/admin/dashboard";
	}
	@GetMapping("/admin/dashboard")
	public String dashboard() {
		return "/admin/dashboard2";
	}
}
