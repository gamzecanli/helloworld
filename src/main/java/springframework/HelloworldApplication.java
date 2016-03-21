package springframework;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class HelloworldApplication {

	public static void main(String[] args) {
		SpringApplication.run(HelloworldApplication.class, args);

		ApplicationContext ctx = SpringApplication.run(HelloworldApplication.class, args);
		HelloBean helloBean = ctx.getBean(HelloBean.class);

		System.out.println(helloBean.sayHello());
	}


}
