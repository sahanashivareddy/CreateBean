package createbean;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class mainclass {
public static void main(String[] args) {
	ApplicationContext context=new AnnotationConfigApplicationContext(config.class);
    Laptop lp = context.getBean(Laptop.class);
    System.out.println(lp.brand);
    System.out.println(lp.price);
	
}
}
