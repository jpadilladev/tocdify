package es.webstilos.tocdify.app.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import es.webstilos.tocdify.web.MainController;

@Configuration
@ComponentScan(basePackageClasses = MainController.class)
public class WebConfig {

}
