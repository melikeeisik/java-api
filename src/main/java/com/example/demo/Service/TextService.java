package com.example.demo.Service;

import com.example.demo.Entity.TextEntity;

import java.util.List;

public interface TextService {
    List<TextEntity> getAllText();
    TextEntity saveText(TextEntity textEntity);
}
