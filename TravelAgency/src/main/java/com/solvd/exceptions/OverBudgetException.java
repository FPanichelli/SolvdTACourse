package com.solvd.exceptions;

public class OverBudgetException extends RuntimeException {
    public OverBudgetException(String messageOverBudget) {
        super(messageOverBudget);
    }
}
