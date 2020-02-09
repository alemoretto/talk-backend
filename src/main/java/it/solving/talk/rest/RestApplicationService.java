package it.solving.talk.rest;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/talk")
public class RestApplicationService {

    @GetMapping
    public ResponseEntity sayHello() {
        return ResponseEntity.ok("Hello !");
    }
}
