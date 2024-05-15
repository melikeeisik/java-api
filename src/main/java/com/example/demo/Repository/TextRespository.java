package com.example.demo.Repository;

import com.example.demo.Entity.TextEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TextRespository extends JpaRepository<TextEntity, Long> {
}
