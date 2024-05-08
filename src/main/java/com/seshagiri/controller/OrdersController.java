package com.seshagiri.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController()
@RequestMapping("/orders")
public class OrdersController {

	@GetMapping()
	public String getAll() {
		System.out.println("Called getALL Request ...");
		return "Hello Bits Jenkins sessions ...... Webhook Hai";
	}
	
	@GetMapping("/{id}")
	public String getById(@PathVariable("id") Integer id) {
		System.out.println("Called getALL Request ...web hook");
		return "Hai-->" + id;
	}
}
