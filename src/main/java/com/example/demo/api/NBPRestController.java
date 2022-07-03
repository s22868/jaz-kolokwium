package com.example.demo.api;

import com.example.demo.models.DbResponse;
import com.example.demo.service.NBPService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class NBPRestController {
    private final NBPService nbpService;

    public NBPRestController(NBPService nbpService) {
        this.nbpService = nbpService;
    }

    @GetMapping("/{avg}")
    public ResponseEntity<DbResponse> testAdd(@PathVariable Double avg, @RequestParam(defaultValue = "2012-01-01") String from, @RequestParam(defaultValue = "2012-01-31") String to){
        return ResponseEntity.ok(nbpService.midExchange(avg, from, to));
    }

    @GetMapping("/test")
    public ResponseEntity<String> test(){
        return ResponseEntity.ok("test");
    }
}
