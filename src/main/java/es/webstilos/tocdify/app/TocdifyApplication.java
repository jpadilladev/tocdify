package es.webstilos.tocdify.app;

import es.webstilos.zkspringboot.config.ZKApplication;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@ZKApplication
@SpringBootApplication
public class TocdifyApplication {

    public static void main(String[] args) {
        SpringApplication.run(TocdifyApplication.class, args);
    }

}
