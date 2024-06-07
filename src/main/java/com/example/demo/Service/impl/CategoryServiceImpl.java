package com.example.demo.Service.impl;

import com.example.demo.Entity.CategoryEntity;
import com.example.demo.Repository.CategoryRepository;
import com.example.demo.Service.CategoryService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class CategoryServiceImpl implements CategoryService {
    private final CategoryRepository categoryRepository;

    @Override
    public List<CategoryEntity> getAllCategories() {
        return categoryRepository.findAll();
    }

    @Override
    public CategoryEntity saveCategory(CategoryEntity categoryEntity) {
        return categoryRepository.findByCateggoryName(categoryEntity.getCateggoryName())
                .map(existingCategory -> {
                    existingCategory.setNumberOfContent(existingCategory.getNumberOfContent() + 1);
                    return categoryRepository.save(existingCategory);
                })
                .orElseGet(() -> {
                    categoryEntity.setNumberOfContent(1); // Yeni kategori için adedi 1 olarak ayarla
                    return categoryRepository.save(categoryEntity);
                });
    }
}
