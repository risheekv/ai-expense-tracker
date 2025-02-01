package com.example.demo.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.cglib.core.Local;
import org.springframework.data.mongodb.core.mapping.Document;

import java.time.LocalDate;

@Document(collection = "expenses")
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Expense {
     private String id;
     private String userId;
     private String category;
     private double amount;
     private LocalDate date;
}
