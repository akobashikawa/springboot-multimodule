package com.example.multimodule.applicationdos;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.multimodule.service.MyService;

@RestController
@RequestMapping("/applicationdos")
public class DemoController {

	private final MyService myService;

	public DemoController(MyService myService) {
		this.myService = myService;
	}

	@GetMapping("/home")
	public String home() {
		String message = myService.message();
		return message;
	}
}
