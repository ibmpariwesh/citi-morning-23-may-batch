package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.service.OrderService;
import com.example.demo.vo.OrderVO;

@RestController
public class OrderController {
	@Autowired
	OrderService service;
	
	@PostMapping("/order")
	void createOrder(@RequestBody OrderVO order) {
		System.out.println(order.getItem());
		service.saveOrder(order);
	}
}
