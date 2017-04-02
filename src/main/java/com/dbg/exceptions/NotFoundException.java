package com.dbg.exceptions;

public class NotFoundException extends Exception{

	private static final long serialVersionUID = 4313423847570665050L;

	private static final String MSG="La entidad buscada no existe";
	
	public NotFoundException(String msg){
		super(msg);
	}
	
	public NotFoundException(){
		super(MSG);
	}
}
