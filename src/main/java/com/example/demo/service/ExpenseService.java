package com.example.demo.service;

import com.example.demo.entity.Expense;
import com.example.demo.repository.ExpenseRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class ExpenseService {
    private final ExpenseRepository expenseRepository;

    public List<Expense> getExpensesByUserId(String userId){
        return expenseRepository.findByUserId(userId);
    }

    public Expense addExpense(Expense expense){
        return expenseRepository.save(expense);
    }
    public void deleteExpense(String expenseId){
        expenseRepository.deleteById(expenseId);
    }
}
