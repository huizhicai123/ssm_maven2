package cn.xdl.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HelloController {
	@RequestMapping("/hello")
	@ResponseBody
	public String run() {
		System.out.println("111111");
		return "hello Spring";
	} 
	
}
