package com.juniormiqueletti.jaxwslab.domain;

public class User {

	private String name;
	private String login;
	private String password;

	public User(String name, String login, String password) {
		super();
		this.name = name;
		this.login = login;
		this.password = password;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getLogin() {
		return login;
	}

	public void setLogin(String login) {
		this.login = login;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public static class Builder {

		private String name;
		private String login;
		private String password;

		public Builder name(String name) {
			this.name = name;
			return this;
		}

		public Builder login(String login) {
			this.login = login;
			return this;
		}

		public Builder password(String password) {
			this.password = password;
			return this;
		}

		public User build() {
			return new User(name, login, password);
		}
	}

}
