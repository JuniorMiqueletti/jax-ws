package com.juniormiqueletti.jaxwslab.ws;

import java.util.ArrayList;
import java.util.List;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;

import com.juniormiqueletti.jaxwslab.dao.ItemDAO;
import com.juniormiqueletti.jaxwslab.domain.Filter;
import com.juniormiqueletti.jaxwslab.domain.Filters;
import com.juniormiqueletti.jaxwslab.domain.Item;
import com.juniormiqueletti.jaxwslab.domain.ItemList;

@WebService
public class StockWS {

	private ItemDAO dao = new ItemDAO();
	
	@WebMethod(operationName = "allItens")
	@WebResult(name="items")
	public ItemList findAll(@WebParam(name="filters") Filters filters){
		System.out.println("findAll");
		
		List<Filter> list = filters.getList();
		ArrayList<Item> allItemsListed = dao.allItems(list);
		
		return new ItemList(allItemsListed);
	}
}
