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
		return "Hello World from JLeon abc";
	}
	
	@RequestMapping("/bye")
	String bye()
	{
		return "Bye Cruel World! :(";
	}
	
	@RequestMapping("/IAmHere")
	String IAmHere()
	{
		return "I am here";
	}
	
	public static void main(String[] args) {
		SpringApplication.run(Example.class, args);

	}

}
