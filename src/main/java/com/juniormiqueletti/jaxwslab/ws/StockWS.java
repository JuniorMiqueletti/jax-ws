package com.juniormiqueletti.jaxwslab.ws;

import java.util.List;

import javax.jws.WebMethod;
import javax.jws.WebResult;
import javax.jws.WebService;

import com.juniormiqueletti.jaxwslab.dao.ItemDAO;
import com.juniormiqueletti.jaxwslab.domain.Item;
import com.juniormiqueletti.jaxwslab.domain.ItemList;

@WebService
public class StockWS {

	private ItemDAO dao = new ItemDAO();
	
	@WebMethod(operationName = "allItens")
	@WebResult(name="items")
	public ItemList findAll(){
		System.out.println("findAll");
		List<Item> items = dao.findAll();
		return new ItemList(items);
	}
}
