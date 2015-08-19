package com.bit.springex.controller;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.bit2015.mysite.vo.UserVo;

@Controller
public class MCController {

	@RequestMapping("/mc/ex1")
	@ResponseBody
	public String ex1() {

		return "Hello spring";

	}

	@RequestMapping("/mc/ex2")
	@ResponseBody
	public Object ex2() {

		Map map = new HashMap();
		System.out.println("!!!");
		map.put("name", "이준기");
		map.put("number", new Integer(100000));
		return map;

	}

	@RequestMapping("/mc/ex3")
	@ResponseBody
	public Object ex3() {
		List<UserVo> list = new ArrayList<UserVo>();
		for (int i = 0; i < 10; i++) {

			UserVo vo = new UserVo();
			vo.setEmail("newmind3@gmail.com");
			vo.setName("이준기");
			vo.setGender("male");
			vo.setPassword("1234");
			vo.setNo((long) i);
			list.add(vo);
			System.out.println();
		}
		return list;
	}

	@RequestMapping("/mc/ex5")
	@ResponseBody
	public Object ex5() {
		List<UserVo> list = new ArrayList<UserVo>();
		for (int i = 0; i < 10; i++) {

			UserVo vo = new UserVo();
			vo.setEmail("newmind3@gmail.com");
			vo.setName("이준기");
			vo.setGender("male");
			vo.setPassword("1234");
			vo.setNo((long) i);
			list.add(vo);
			System.out.println();
		}
		
		
		Map map = new HashMap();
		map.put("number", new Integer(2000));
		map.put("list", list);
		
		return map;
	}

}
