package com.juniormiqueletti.jaxwslab.ws;

import java.util.ArrayList;
import java.util.List;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.jws.soap.SOAPBinding.ParameterStyle;
import javax.jws.soap.SOAPBinding.Style;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;

import com.juniormiqueletti.jaxwslab.dao.ItemDAO;
import com.juniormiqueletti.jaxwslab.dao.TokenDAO;
import com.juniormiqueletti.jaxwslab.domain.Filter;
import com.juniormiqueletti.jaxwslab.domain.Filters;
import com.juniormiqueletti.jaxwslab.domain.Item;
import com.juniormiqueletti.jaxwslab.domain.ItemList;
import com.juniormiqueletti.jaxwslab.domain.token.UserToken;
import com.juniormiqueletti.jaxwslab.exception.AuthorizationException;
import com.juniormiqueletti.jaxwslab.service.ItemValidatorServiceImpl;

@WebService
@SOAPBinding(style=Style.DOCUMENT, parameterStyle=ParameterStyle.BARE)
public class StockWS {

	private ItemDAO dao = new ItemDAO();

	private TokenDAO tokenDAO = new TokenDAO();
	
	@WebMethod(operationName = "allItems")
	@WebResult(name="items")
	@RequestWrapper(localName = "listItems")
	@ResponseWrapper(localName = "itemsResponse")
	public ItemList findAll(@WebParam(name="filters") Filters filters){
		System.out.println("findAll");
		
		List<Filter> list = filters.getList();
		ArrayList<Item> allItemsListed = dao.allItems(list);
		
		return new ItemList(allItemsListed);
	}
	
	@WebMethod(operationName="registerItem") 
	@WebResult(name="item")
	public Item cadastrarItem(@WebParam(name="tokenUsuario", header=true) UserToken userToken, @WebParam(name="item") Item item) throws AuthorizationException {
	  System.out.println("Registering" + item + ", " + userToken);
	  
	  if(!tokenDAO.isValid(userToken)){
		  throw new AuthorizationException("Authorization failed");
	  };
	  
	  new ItemValidatorServiceImpl(item).validate();
	  
	  dao.register(item);
	  return item;
	}
}
