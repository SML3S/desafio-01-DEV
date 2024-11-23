package com.cursoprofissional.desafio;

import java.util.Scanner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

import com.cursoprofissional.desafio.entities.Order;
import com.cursoprofissional.desafio.service.OrderService;

@SpringBootApplication
@ComponentScan({"com.cursoprofissional"})
public class DesafioApplication implements CommandLineRunner {

	@Autowired
	private OrderService orderSerevice ;
	
	
	
	public static void main(String[] args) {
		SpringApplication.run(DesafioApplication.class, args);
		
		
	
	}
	
	@Override
	public void run(String... args) throws Exception {
		
		Scanner sc = new Scanner(System.in);
		
		
		Order order = new Order(0,0.0,0);
		
		System.out.println("Codigo:");
		order.setCode(sc.nextInt());
		System.out.println("Valor basico:");
		order.setBasic(sc.nextDouble());
		System.out.println("Desconto:");
		order.setDoscount(sc.nextDouble());
		
		System.out.print("Pedido código " );
		System.out.println(order.getCode());
		System.out.println();
		System.out.printf("Valor total: %.2f%n",orderSerevice.total(order));
		
		
	}
		
}
