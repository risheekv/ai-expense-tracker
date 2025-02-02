package com.example.demo.controller;

import com.example.demo.entity.Expense;
import com.example.demo.service.ExpenseService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("api/expenses")
public class ExpenseController {

    private final ExpenseService expenseService;

    @GetMapping("/user/{userId}")
    public ResponseEntity<List<Expense>> getAllExpenses(@PathVariable String userId){
        return ResponseEntity.ok(expenseService.getExpensesByUserId(userId));
    }

    @PostMapping("/add")
    public ResponseEntity<Expense> addExpense(@RequestBody Expense expense){
        return ResponseEntity.ok(expenseService.addExpense(expense));
    }

    @DeleteMapping("/{expenseId}")
    public ResponseEntity<String> deleteExpense(@PathVariable String expenseId){
        expenseService.deleteExpense(expenseId);
        return ResponseEntity.ok("Expense deleted successfully");
    }
}
