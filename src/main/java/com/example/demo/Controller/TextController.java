package com.example.demo.Controller;

import com.example.demo.Entity.TextEntity;
import com.example.demo.Service.TextService;
import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.http.HttpStatus;

import java.util.List;


@CrossOrigin
@RestController
@RequestMapping("/textInfo")
@AllArgsConstructor
public class TextController {
    private final TextService textService;

    @GetMapping("/textAll")
    public ResponseEntity<List<TextEntity>> getAllMessages() {
        List<TextEntity> textAll = textService.getAllText();
        return ResponseEntity.ok(textAll);
    }

    @PostMapping
    public ResponseEntity<TextEntity> saveText(@RequestBody TextEntity textEntity) {
        TextEntity saveText = textService.saveText(textEntity);
        return ResponseEntity.status(HttpStatus.CREATED).body(textEntity);
    }

}


