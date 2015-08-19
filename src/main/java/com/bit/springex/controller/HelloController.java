package com.bit.springex.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.context.WebApplicationContext;
import org.springframework.web.context.support.WebApplicationContextUtils;

import com.bit.springex.dao.HelloDao;

@Controller
public class HelloController {
	@Autowired
	private HelloDao helloDao;

	@RequestMapping("/hello2")
	public String hello2(HttpServletRequest request) {
		WebApplicationContext wac = WebApplicationContextUtils
				.getRequiredWebApplicationContext(request.getServletContext());
		HelloDao helloDao = (HelloDao)wac.getBean("helloDao");
		helloDao.hello();
		
		return "/WEB-INF/index.jsp";
	}

	@RequestMapping("/hello")
	public String hello(@RequestParam String id, Model model) {// model.에 list넣음
		helloDao.hello();
		model.addAttribute("id", id);
		return "/WEB-INF/index.jsp";
	}
}
