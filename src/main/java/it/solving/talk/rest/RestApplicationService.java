package it.solving.talk.rest;

import lombok.SneakyThrows;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.net.InetAddress;

@RestController
@RequestMapping("/talk")
public class RestApplicationService {

    @SneakyThrows
    @GetMapping
    public ResponseEntity sayHello() {
        return ResponseEntity.ok("This Host is:" + InetAddress.getLocalHost().getHostName());
    }
}
