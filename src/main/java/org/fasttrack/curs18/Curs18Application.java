package org.fasttrack.curs18;

import org.fasttrack.curs18.carshop.Car;
import org.fasttrack.curs18.carshop.Engine;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@SpringBootApplication
@Configuration
public class Curs18Application {

	public static void main(String[] args) {
		SpringApplication.run(Curs18Application.class, args);
		ApplicationContext context = new AnnotationConfigApplicationContext(Curs18Application.class);
		Car car = context.getBean(Car.class);
		System.out.println(car.getEngine().getNume());
//		System.out.println(myCar.getEngine().getNume());
	}

	@Bean
	public Engine getDieselEngine() {
		return new Engine("diesel");
	}

	@Bean
	public Engine getBenzinaEngine() {
		return new Engine("benzina");
	}

}
