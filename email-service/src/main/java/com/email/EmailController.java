package com.email;

import javax.websocket.server.PathParam;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EmailController {
	@GetMapping("/email")
	String sendEmail(@PathParam("address") String address) {
		System.out.println(address);
		return "sent mail successfully";
	}
}
