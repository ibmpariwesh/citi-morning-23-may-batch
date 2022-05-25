package com.example.demo.controller;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.when;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import com.example.demo.service.OrderService;
import com.example.demo.vo.OrderVO;

@ExtendWith(MockitoExtension.class)
class OrderControllerTest {
	@InjectMocks
	OrderController controller;
	@Mock
	OrderService service;

	@Test
	void testCreateOrder() {
		OrderVO order = new OrderVO();
		order.setEmail("ram@gmail.com");
		when(service.saveOrder(order)).thenReturn(1);
		Integer response = controller.createOrder(order);
		assertEquals(1, response);
	}

	@Test
	void testCreateOrderWithBlankEmail() {
		OrderVO order = new OrderVO();
		order.setEmail("");
		assertThrows(IllegalArgumentException.class, () -> {
			controller.createOrder(order);
		});
	}

	@Test
	void testGetOrders() {
		fail("Not yet implemented");
	}

	@Test
	void testHandleException() {
		fail("Not yet implemented");
	}

}
