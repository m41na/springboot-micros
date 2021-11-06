package works.hop.configservice;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@SpringBootApplication
@EnableConfigServer
public class ConfigServiceApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(ConfigServiceApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		System.out.println(ConfigServiceApplication.class.getName() + " has successfully started");
	}
}
