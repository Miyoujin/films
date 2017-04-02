package com.dbg.exceptions;

public class UserNotFoundException extends NotFoundException {

	private static final long serialVersionUID = 448011860959099653L;

	private static final String MSG="Usuario no encontrado";
	
	public UserNotFoundException() {
		super(MSG);
	}
}
