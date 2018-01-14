package com.juniormiqueletti.jaxwslab.exception;

import java.util.List;

public class ItemValidatorException extends RuntimeException {

	private static final long serialVersionUID = 1L;

	public ItemValidatorException(List<String> erros) {
		super(erros.toString());
	}
	
}
