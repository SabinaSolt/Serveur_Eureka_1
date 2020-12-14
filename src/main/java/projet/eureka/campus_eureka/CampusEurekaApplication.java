package projet.eureka.campus_eureka;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class CampusEurekaApplication {

	public static void main(String[] args) {
		SpringApplication.run(CampusEurekaApplication.class, args);
	}

}
