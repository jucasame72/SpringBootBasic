package hello;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@EnableAutoConfiguration
public class Example {
//
	@RequestMapping("/hello")
	String hello()
	{
		return "Hello World";
	}
	
	@RequestMapping("/bye")
	String bye(){
		return "Bye World!";
	}
	
	@RequestMapping("/LetsGo")
	String LetsGo()
	{
		return "Lets Go";
	}
	
	public static void main(String[] args) {
		SpringApplication.run(Example.class, args);

	}

}
