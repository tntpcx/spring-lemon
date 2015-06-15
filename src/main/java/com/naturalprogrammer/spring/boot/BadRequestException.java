package com.naturalprogrammer.spring.boot;


public class BadRequestException extends RuntimeException {

	private static final long serialVersionUID = 6020532846519363456L;
	
	public BadRequestException(String messageKey, Object... args) {
		super(SaUtil.getMessage(messageKey, args));
	}
	
}