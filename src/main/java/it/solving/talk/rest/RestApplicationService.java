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
    public ResponseEntity<StringDto> whoareyou() {
        log.info("Call to WHOAREYOU");
        return ResponseEntity.ok(new StringDto("Hostname:" + InetAddress.getLocalHost().getHostName()));
    }

    @SneakyThrows
    @GetMapping("/shutdown")
    public ResponseEntity<StringDto> shutdown() {
        counter++;
        if (counter > 3) {
            System.exit(0);
        }

        return ResponseEntity.ok(new StringDto("Shutdown tra " + (4-counter)));
    }

    @GetMapping("/list")
    public ResponseEntity<List<String>> getList() {
        return ResponseEntity.ok(itemList.pickRandomList());
    }


}
