package com.juniormiqueletti.jaxwslab.ws;

import java.util.List;

import javax.jws.WebService;

import com.juniormiqueletti.jaxwslab.dao.ItemDAO;
import com.juniormiqueletti.jaxwslab.domain.Item;

@WebService
public class StockWS {

	private ItemDAO dao = new ItemDAO();
	
	public List<Item> findAll(){
		List<Item> itens = dao.findAll();
		return itens;
	}
}
