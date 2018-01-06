package com.juniormiqueletti.jaxwslab;

import javax.xml.ws.Endpoint;

import com.juniormiqueletti.jaxwslab.ws.StockWS;

public class Application {

	public void start() {
		StockWS stockWS = new StockWS();
		String URL = "http://localhost:8080/stockws";
		Endpoint.publish(URL, stockWS);
		System.out.println("StockWS Running: " + URL);
	}

	public static void main(String[] args) {
		Application application = new Application();
		application.start();

	}
}
