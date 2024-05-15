package com.example.demo.Entity;

import com.fasterxml.jackson.annotation.JsonFormat;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.annotations.JavaType;

import java.util.Date;

@Entity
@Table(name = "text_table")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class TextEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "text_id")
    private Integer textId;

    @Column(name = "text_category")
    private String textCategory;

    @Column(name = "text_name")
    private String textName;

    @Column(name = "text_summary")
    private String textSummary;

    @Column(name = "text_full")
    private String textFull;

    @Column(name = "user_id")
    private Integer userId;

    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "dd/MM/yyyy")
    @Column(name="created_date")
    private Date createdDate;


}
