package com.jaycabasag.adoptpetph.user;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "/users")
public class UserController {
    @GetMapping()
    public ResponseEntity<String> hello(){
        return ResponseEntity.ok("Hi from Adopt a pet PH API");
    }
}
