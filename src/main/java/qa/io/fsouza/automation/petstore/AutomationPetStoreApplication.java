package qa.io.fsouza.automation.petstore;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = "qa.io.fsouza.automation.petstore")
public class AutomationPetStoreApplication {

	public static void main(String[] args) {
		SpringApplication.run(AutomationPetStoreApplication.class, args);
	}

}
