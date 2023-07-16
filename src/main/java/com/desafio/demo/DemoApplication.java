package com.desafio.demo;

import java.util.Locale;
import java.util.Scanner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

import com.desafio.entities.Order;
import com.desafio.services.OrderService;

@SpringBootApplication
@ComponentScan({"com.desafio"})
public class DemoApplication implements CommandLineRunner {
	
	@Autowired
	private OrderService orderService;
	
	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("código: ");
		int code = sc.nextInt();
		
		System.out.print("Valor básico: ");
		double basicValue = sc.nextDouble();
		
		System.out.print("porcentagem de desconto: ");
		double discount = sc.nextDouble();
		
		
		Order order = new Order(code, basicValue, discount);
		
		System.out.println();
		System.out.println("Pedido código " + order.getCode());
		System.out.println("Valor total: R$ " + String.format("%.2f", orderService.total(order)));
		
		sc.close();
	}

}
