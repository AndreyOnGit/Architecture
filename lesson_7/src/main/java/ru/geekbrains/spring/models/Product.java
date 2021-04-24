package ru.geekbrains.spring.models;

import lombok.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Product {
    private long id;
    private String title;
    private double cost;
}
