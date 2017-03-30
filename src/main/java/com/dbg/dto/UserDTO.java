package com.dbg.dto;

import java.io.Serializable;

public class UserDTO implements Serializable{

	private static final long serialVersionUID = 3972880580911555045L;
	private String name;

	public UserDTO() {
		super();
	}
	public UserDTO(String name) {
		super();
		this.name=name;
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}
