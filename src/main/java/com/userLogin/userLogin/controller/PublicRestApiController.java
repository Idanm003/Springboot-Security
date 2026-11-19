package com.userLogin.userLogin.controller;

import com.userLogin.userLogin.model.TestResponse;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "/api/public")
public class PublicRestApiController {

    @GetMapping(value = "/test1")
    @CrossOrigin
    public ResponseEntity<?> test1() {
        return ResponseEntity.ok(new TestResponse("API Test1"));
    }

    @GetMapping(value = "/test2")
    @CrossOrigin
    public ResponseEntity<?> test2() {
        return ResponseEntity.ok(new TestResponse("API Test2"));
    }

    @GetMapping(value = "/test3")
    @CrossOrigin
    public ResponseEntity<?> test3() {
        return ResponseEntity.ok(new TestResponse("API Test3"));
    }
}
