package it.solving.talk.rest;

import it.solving.talk.ItemList;
import it.solving.talk.StringDto;
import lombok.SneakyThrows;
import lombok.extern.apachecommons.CommonsLog;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.net.InetAddress;
import java.util.List;


@CommonsLog
@RestController
@RequestMapping("/talk")
public class RestApplicationService {

    @Autowired
    ItemList itemList;

    private int counter;

    @SneakyThrows
    @GetMapping
    public ResponseEntity root() {
        String result = "Hostname : " + InetAddress.getLocalHost().getHostName();
        log.info("Call to ROOT -> " + result);
        return ResponseEntity.ok(new StringDto(result));
    }

    @SneakyThrows
    @GetMapping("/whoareyou")
    public ResponseEntity<StringDto> whoareyou() {
        String result = "Hostname:" + InetAddress.getLocalHost().getHostName();
        log.info("Call to WHOAREYOU -> " + result);
        return ResponseEntity.ok(new StringDto(result));
    }

    @SneakyThrows
    @GetMapping("/shutdown")
    public ResponseEntity<StringDto> shutdown() {
        counter++;
        String result = "Shutdown tra " + (4-counter);

        if (counter > 3) {
            log.info("Call to SHUTDOWN -> Shutdown !!");
            System.exit(0);
        }

        log.info("Call to SHUTDOWN -> " + result);

        return ResponseEntity.ok(new StringDto(result));
    }

    @GetMapping("/list")
    public ResponseEntity<List<String>> getList() {
        return ResponseEntity.ok(itemList.pickRandomList());
    }


}
