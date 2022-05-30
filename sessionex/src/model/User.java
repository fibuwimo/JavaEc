package model;

import java.io.Serializable;

public class User implements Serializable{
	private String mail;
	private String name;
	private String mess;

	public User() {}
	public User(String name,String mail,String mess) {
		this.mail=mail;
		this.name=name;
		this.mess=mess;
	}
	public String getMail() {
		return mail;
	}
	public String getName() {
		return name;
	}
	public String getMess() {
		return mess;
	}

}
