package works.hop.eurekaservice;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class EurekaServiceApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(EurekaServiceApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		System.out.println(EurekaServiceApplication.class.getName() + " has successfully started");
	}
}
