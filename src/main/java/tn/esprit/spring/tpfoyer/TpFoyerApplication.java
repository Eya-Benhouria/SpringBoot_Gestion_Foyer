package tn.esprit.spring.tpfoyer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;

@SpringBootApplication
@ComponentScan(basePackages = {"tn.esprit.spring.service","tn.esprit.spring.controller","tn.esprit.spring.repositories"})
@EntityScan(basePackages = {"tn.esprit.spring.Entities"})
@EnableJpaRepositories(basePackages = "tn.esprit.spring.repositories")


public class TpFoyerApplication {

    public static void main(String[] args) {
        SpringApplication.run(TpFoyerApplication.class, args);
    }

}
