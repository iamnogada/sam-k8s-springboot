package io.noganova.samk8sspringboot;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.core.env.Environment;

@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
		String workingDir = System.getProperty("user.dir");
		System.out.println("Current working directory : " + workingDir);
	}

	@Autowired
	Environment env;

	@Bean
	public CommandLineRunner commandLineRunner(ApplicationContext ctx) {
		return args -> {
			// String[] beanNames = ctx.getBeanDefinitionNames();
			// Arrays.sort(beanNames);
			// for (String name : beanNames) {
			// System.out.println(name);
			// }
			String[] profiles = env.getActiveProfiles();
			for (String name : profiles) {
				System.out.println(name);
			}
		};
	}
}
