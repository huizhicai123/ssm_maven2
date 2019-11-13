package cn.xdl.mapper;

import org.apache.ibatis.annotations.Param;

import cn.xdl.bean.SpringMaven;

public interface SpringMavenDao {
	
	SpringMaven findUser(@Param("username")String username,@Param("password")String password);
}
