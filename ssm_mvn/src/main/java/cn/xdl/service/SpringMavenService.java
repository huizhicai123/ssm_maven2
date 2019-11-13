package cn.xdl.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cn.xdl.bean.SpringMaven;
import cn.xdl.mapper.SpringMavenDao;
@Service("springMavenService")
public class SpringMavenService {
	@Autowired
	private SpringMavenDao springMavenDao;
	
	public SpringMaven findUser(String username,String password) {
		return springMavenDao.findUser(username, password);
	}
}
