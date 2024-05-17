package com.example.demo.Controller;

import com.example.demo.Entity.UserEntity;
import com.example.demo.Service.UserService;
import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.http.HttpStatus;
import java.util.List;


@CrossOrigin
@RestController
@RequestMapping("/userInfo")
@AllArgsConstructor
public class UserController {
    private final UserService userService;

    @GetMapping("/userAll")
    public ResponseEntity<List<UserEntity>> getAllUser() {
        List<UserEntity> userAll = userService.getAllUser();
        return ResponseEntity.ok(userAll);
    }

    @PostMapping
    public ResponseEntity<UserEntity> saveUser(@RequestBody UserEntity userEntity) {
        UserEntity saveUser = userService.saveUser(userEntity);
        return ResponseEntity.status(HttpStatus.CREATED).body(userEntity);
    }

}
