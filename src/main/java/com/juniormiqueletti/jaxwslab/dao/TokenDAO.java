package com.juniormiqueletti.jaxwslab.dao;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.LinkedHashMap;
import java.util.Map;

import com.juniormiqueletti.jaxwslab.domain.User;
import com.juniormiqueletti.jaxwslab.domain.token.UserToken;

public class TokenDAO {

	private static Map<UserToken, User> USERS = new LinkedHashMap<>();

	public TokenDAO() {
		popularUsuariosNoMapa();
	}

	public boolean isValid(UserToken user) {
		return USERS.containsKey(user);
	}

	private void popularUsuariosNoMapa() {
		USERS.put(new UserToken("AAA", parseDate("31/12/2015")),
				new User.Builder().name("Nico").login("nico").password("pass").build());

		USERS.put(new UserToken("BBB", parseDate("31/12/2015")),
				new User.Builder().name("Flavio").login("flavio").password("pass").build());

		USERS.put(new UserToken("CCC", parseDate("31/12/2015")),
				new User.Builder().name("Fabio").login("fabio").password("pass").build());

		USERS.put(new UserToken("DDD", parseDate("31/12/2015")),
				new User.Builder().name("Romulo").login("Romulo").password("pass").build());
	}

	private Date parseDate(String dataComoString) {
		try {
			return new SimpleDateFormat("dd/MM/yyyy").parse(dataComoString);
		} catch (ParseException e) {
			throw new RuntimeException(e);
		}
	}
}
