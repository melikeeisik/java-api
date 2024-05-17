package com.example.demo.Controller;

import com.example.demo.Entity.TextEntity;
import com.example.demo.Repository.TextRespository;
import com.example.demo.Service.TextService;
import lombok.AllArgsConstructor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.http.HttpStatus;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

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

    @Configuration
    public class WebConfig {

        @Bean
        public WebMvcConfigurer corsConfigurer() {
            return new WebMvcConfigurer() {
                @Override
                public void addCorsMappings(CorsRegistry registry) {
                    registry.addMapping("/**")
                            .allowedOrigins("http://localhost:3000", "https://main--sparkling-brioche-f38c68.netlify.app")
                            .allowedMethods("GET", "POST", "PUT", "DELETE", "OPTIONS")
                            .allowedHeaders("*")
                            .allowCredentials(true);
                }
            };
        }
    }

}
