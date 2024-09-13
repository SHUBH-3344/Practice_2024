package sb.grow.SB001_SpringBootApp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class Sb001SpringBootAppApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(Sb001SpringBootAppApplication.class, args);
	System.out.println(context.getClass().getName());
	}

}
