package com.example.demo.Controller;

import com.example.demo.Entity.CategoryEntity;
import com.example.demo.Repository.CategoryRepository;
import com.example.demo.Service.CategoryService;
import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.http.HttpStatus;

import java.util.List;

@CrossOrigin
@RestController
@RequestMapping("/categoryInfo")
@AllArgsConstructor
public class CategoryController {
    private final CategoryService categoryService;

    @GetMapping("/categories")
    public ResponseEntity<List<CategoryEntity>> getAllMessages() {
        List<CategoryEntity> categories = categoryService.getAllCategories();
        return ResponseEntity.ok(categories);
    }

    @PostMapping
    public ResponseEntity<CategoryEntity> saveCategory(@RequestBody CategoryEntity categoryEntity) {
        CategoryEntity saveCategory = categoryService.saveCategory(categoryEntity);
        return ResponseEntity.status(HttpStatus.CREATED).body(saveCategory);
    }
}
