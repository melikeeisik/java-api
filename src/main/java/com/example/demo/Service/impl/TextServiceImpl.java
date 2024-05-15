package com.example.demo.Service.impl;

import com.example.demo.Entity.TextEntity;
import com.example.demo.Repository.TextRespository;
import com.example.demo.Service.TextService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class TextServiceImpl implements TextService {
    private TextRespository textRespository;

    @Override
    public List<TextEntity> getAllText() {
        return textRespository.findAll();
    }

    @Override
    public TextEntity saveText(TextEntity textEntity){
        return textRespository.save(textEntity);
    }
}
