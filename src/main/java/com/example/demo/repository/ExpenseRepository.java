package com.example.demo.repository;

import com.example.demo.entity.Expense;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;

public interface ExpenseRepository extends MongoRepository<Expense,String> {
    List<Expense> findByUserId(String userId);
}
