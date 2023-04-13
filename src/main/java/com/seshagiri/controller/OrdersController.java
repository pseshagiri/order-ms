package com.seshagiri.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController()
@RequestMapping("/orders")
public class OrdersController {

	@GetMapping()
	public String getAll() {
		System.out.println("Called getALL Request ...");
		return "Hai";
	}
}
