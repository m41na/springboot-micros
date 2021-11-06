package works.hop.gatewayservice;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class GatewayServiceApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(GatewayServiceApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		System.out.println(GatewayServiceApplication.class.getName() + " has successfully started");
	}
}
