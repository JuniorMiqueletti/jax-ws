package com.juniormiqueletti.jaxwslab.exception;

import java.util.Date;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;

@XmlAccessorType(XmlAccessType.FIELD)
public class InfoFault {

	private Date errorDate;
	private String message;

	public InfoFault(String message, Date errorDate) {
		this.errorDate = errorDate;
		this.message = message;
	}

	public InfoFault() {
	}
}
