package com.careerdevs.crudtest.controllers;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/data")
public class CrudController {

    // GET http://localhost:4422/api/data
    @GetMapping()
    public ResponseEntity<?> getData() {
        return ResponseEntity.ok("You got data!");
    }

    // POST http://localhost:4422/api/data
    @PostMapping()
    public ResponseEntity<?> postData() {
        return ResponseEntity.ok("You posted data!");
    }

    // PATCH http://localhost:4422/api/data
    @PatchMapping()
    public ResponseEntity<?> patchData() {
        return ResponseEntity.ok("You patched data!");
    }

    // PUT http://localhost:4422/api/data
    @PutMapping()
    public ResponseEntity<?> putData() {
        return ResponseEntity.ok("You put data!");
    }

    // DELETE http://localhost:4422/api/data
    @DeleteMapping()
    public ResponseEntity<?> deleteData() {
        return ResponseEntity.ok("You deleted data!");
    }

    // http://localhost:4422/api/data/test/{name}
    @GetMapping("/test/{name}")
    public ResponseEntity<?> rmTestPV(@PathVariable String name) {
        return ResponseEntity.ok("How's it hangin, " + name);
    }

    // http://localhost:4422/api/data/test
    @GetMapping("/test")
    public ResponseEntity<?> rmTestRP(@RequestParam String name, @RequestParam(name = "age") String userAge) {
        return ResponseEntity.ok("This is a test: " + name + " is " + userAge + " years old.");
    }

}
