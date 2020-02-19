package it.solving.talk;

import lombok.extern.apachecommons.CommonsLog;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@CommonsLog
@SpringBootApplication
public class TalkApplication implements CommandLineRunner {

    @Autowired
    ItemList itemList;

    public static void main(String[] args) {
        SpringApplication.run(TalkApplication.class, args);

        log.info(">>>>>>>>>>>>  APP IS READY !  <<<<<<<<<<<<<<");
    }

    @Override
    public void run(String... args) throws Exception {

        itemList.pickRandomList();

    }

}
