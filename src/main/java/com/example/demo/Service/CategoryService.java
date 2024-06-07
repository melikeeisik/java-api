package com.example.demo.Service;

import com.example.demo.Entity.CategoryEntity;


import java.util.List;

public interface CategoryService {
    List<CategoryEntity> getAllCategories();
    CategoryEntity saveCategory(CategoryEntity categoryEntity);
}
