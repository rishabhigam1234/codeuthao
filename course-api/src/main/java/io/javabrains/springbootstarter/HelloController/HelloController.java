package io.javabrains.springbootstarter.HelloController;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;
@RestController
public class HelloController {
	
	@RequestMapping("/hello")
	public String Hello()
	{
		return "hi";
	}

}
