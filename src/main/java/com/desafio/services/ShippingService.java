package com.desafio.services;


import org.springframework.stereotype.Service;

import com.desafio.entities.Order;

@Service
public class ShippingService {
	
	public double shipment(Order order) {
		double frete = 0.0;
		
		if (order.getBasicValue() < 100.0) {
			frete = 20.0;
		}
		else if (order.getBasicValue() < 200.0) {
			frete = 12.0;
		}
		
		return frete;
	}

}
