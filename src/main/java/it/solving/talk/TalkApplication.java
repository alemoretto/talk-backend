package it.solving.talk;

import lombok.extern.apachecommons.CommonsLog;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@CommonsLog
@SpringBootApplication
public class TalkApplication {

    public static void main(String[] args) {
        SpringApplication.run(TalkApplication.class, args);

        log.info(">>>>>>>>>>>>  WELCOME TO THE TALK  <<<<<<<<<<<<<<");
        System.out.println("WELCOME TO THE TALK");
    }

}
