package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.OrderRepository;
import com.example.demo.vo.OrderVO;

@Service
public class OrderService {
	@Autowired
	OrderRepository repository;
	public void saveOrder(OrderVO order) {
		repository.save(order);
	}

	
}
