package works.hop.couponservice;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class CouponServiceApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(CouponServiceApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		System.out.println(CouponServiceApplication.class.getName() + " has successfully started");
	}
}
