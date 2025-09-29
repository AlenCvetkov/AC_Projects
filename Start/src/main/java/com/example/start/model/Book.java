package com.example.start.model;

import jakarta.persistence.*;
import lombok.*;
import org.hibernate.type.internal.UserTypeSqlTypeAdapter;
import org.springframework.web.service.annotation.GetExchange;

@Entity
@Table(name="Books")
@Getter
@Setter
@ToString
@AllArgsConstructor
@NoArgsConstructor
public class Book {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String title;

    private String color;

    public Book(String title, String color){
        this.title=title;
        this.color=color;
    }

}
