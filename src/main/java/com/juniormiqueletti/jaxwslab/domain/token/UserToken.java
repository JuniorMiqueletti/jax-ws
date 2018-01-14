package com.juniormiqueletti.jaxwslab.domain.token;

import java.util.Date;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

import com.juniormiqueletti.jaxwslab.adapter.DateAdapter;

@XmlAccessorType(XmlAccessType.FIELD)
public class UserToken {

	@XmlElement(required=true)
	private String token;

	@XmlJavaTypeAdapter(DateAdapter.class)
	@XmlElement(required=true)
	private Date expirationDate;

	UserToken() {
	}

	public UserToken(String token, Date expirationDate) {
		this.token = token;
		this.expirationDate = expirationDate;
	}

	public String getToken() {
		return token;
	}

	public void setToken(String token) {
		this.token = token;
	}

	public Date getExpirationDate() {
		return expirationDate;
	}

	public void setExpirationDate(Date expirationDate) {
		this.expirationDate = expirationDate;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((token == null) ? 0 : token.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		UserToken other = (UserToken) obj;
		if (token == null) {
			if (other.token != null)
				return false;
		} else if (!token.equals(other.token))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "UserToken [token=" + token + ", expirationDate=" + expirationDate + "]";
	}

}
