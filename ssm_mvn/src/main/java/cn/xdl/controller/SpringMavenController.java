package cn.xdl.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import cn.xdl.bean.SpringMaven;
import cn.xdl.service.SpringMavenService;

@Controller
public class SpringMavenController {
	@Autowired
	private SpringMavenService springMavenService;
	@RequestMapping("/toLogin")
	public String toLogin() {
		return "login";
	}
	@RequestMapping("/toMain")
	public String toMain() {
		return "main";
	}
	
	public String login(String username,String password,HttpServletRequest request) {
		SpringMaven user = springMavenService.findUser(username, password);
		if(user != null) {
			request.getSession().setAttribute("username", username);
			return "redirect:toMain";
		}
		request.setAttribute("msg", "µÇÂ¼Ê§°Ü");
		return "login";
	}
	
}
