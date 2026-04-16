package com.example;

import org.springframework.stereotype.Service;

@Service
public class OrderService {
    // Simple logic: If stock is enough, deduct and return true
    public boolean processOrder(int requestedQty, int currentStock) {
        if (requestedQty <= 0 || requestedQty > currentStock) {
            return false;
        }
        // In a real app, you'd update the DB here
        return true;
    }
}
