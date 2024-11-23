package com.cursoprofissional.desafio.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cursoprofissional.desafio.entities.Order;

@Service
public class OrderService {
	
	@Autowired
	private ShippingService shippingService;
	
	
	public double total(Order order) {
		
		order.setBasic(order.getBasic() -(order.getBasic()*order.getDoscount()/100));
		return shippingService.shipment(order);
	}

}
