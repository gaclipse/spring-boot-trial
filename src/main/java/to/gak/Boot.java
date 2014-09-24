package to.gak;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;

@EnableAutoConfiguration
@ComponentScan(basePackages = "to.gak")
public class Boot {
	public static void main(String... args) throws Exception {
		SpringApplication.run(Boot.class, args);
	}
}