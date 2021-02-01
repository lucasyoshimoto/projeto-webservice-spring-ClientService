package com.lucas.client;

import com.lucas.CustomerPort;
import com.lucas.CustomerPortService;
import com.lucas.GetCustomerDetailRequest;
import com.lucas.GetCustomerDetailResponse;

public class ClientTest {
	
	public static void main(String[] args) {
		
		CustomerPortService service = new CustomerPortService();
		
		HeaderHandlerResolver handlerResolver = new HeaderHandlerResolver();
		service.setHandlerResolver(handlerResolver);
		
		
		CustomerPort port = service.getCustomerPortSoap11();
		
		GetCustomerDetailRequest customerDetailRequest = new GetCustomerDetailRequest();
		customerDetailRequest.setId(4);
		
		GetCustomerDetailResponse customerDetailResponse = port.getCustomerDetail(customerDetailRequest);
		
		System.out.println("Id -> "+ customerDetailResponse.getCustomerDetail().getId());
		System.out.println("Nome -> "+ customerDetailResponse.getCustomerDetail().getName());
		System.out.println("Email -> "+ customerDetailResponse.getCustomerDetail().getEmail());
		System.out.println("Phone -> "+ customerDetailResponse.getCustomerDetail().getPhone());
	}
	
}
