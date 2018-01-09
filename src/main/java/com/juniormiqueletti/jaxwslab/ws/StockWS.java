package com.juniormiqueletti.jaxwslab.ws;

import java.util.List;

import javax.jws.WebMethod;
import javax.jws.WebResult;
import javax.jws.WebService;

import com.juniormiqueletti.jaxwslab.dao.ItemDAO;
import com.juniormiqueletti.jaxwslab.domain.Item;

@WebService
public class StockWS {

	private ItemDAO dao = new ItemDAO();
	
	@WebMethod(operationName = "allItens")
	@WebResult(name="item")
	public List<Item> findAll(){
		System.out.println("findAll");
		List<Item> itens = dao.findAll();
		return itens;
	}
}
