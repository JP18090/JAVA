package br.JP.acervo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.orm.jpa.EntityScan;

@SpringBootApplication
@EntityScan(basePackages = "br.JP.acervo.entidade")  // Garantir que o Spring Boot escaneie as entidades
public class AcervoApplication {
    
    public static void main(String[] args) {
        SpringApplication.run(AcervoApplication.class, args);
    }
}
