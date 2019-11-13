package cn.xdl.bean;

import java.io.Serializable;

public class SpringMaven implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String username;
	private String password;
	private int state;
	public SpringMaven() {
		super();
	}
	public SpringMaven(String username, String password, int state) {
		super();
		this.username = username;
		this.password = password;
		this.state = state;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public int getState() {
		return state;
	}
	public void setState(int state) {
		this.state = state;
	}
	@Override
	public String toString() {
		return "Spring_MavenDao [username=" + username + ", password=" + password + ", state=" + state + "]";
	}
	
	
}
