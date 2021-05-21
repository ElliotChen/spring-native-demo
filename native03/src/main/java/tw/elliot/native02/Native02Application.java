package tw.elliot.native02;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(proxyBeanMethods = false)
public class Native02Application {

	public static void main(String[] args) {
		SpringApplication.run(Native02Application.class, args);
	}

}
