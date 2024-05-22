package createbean;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("createbean")
public class config {
@Bean
public Laptop laptop()
{
	return new Laptop("DELL",40000.00);
}
}
