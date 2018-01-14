package com.juniormiqueletti.jaxwslab.exception;

import java.util.Date;

import javax.xml.ws.WebFault;

@WebFault(name = "AuthorizatioFault", messageName = "AuthorizatioFault")
public class AuthorizationException extends Exception {

	private static final long serialVersionUID = 1L;

	public AuthorizationException() {
		super();
	}

	public AuthorizationException(String message) {
		super(message);
	}

	public InfoFault getFaultInfo() {
		return new InfoFault("Invalid Token", new Date());
	}
}
