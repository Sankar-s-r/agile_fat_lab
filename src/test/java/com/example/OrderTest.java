package com.example;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class OrderTest {
    
    private final OrderService orderService = new OrderService();

    @Test
    void testOrderSuccess() {
        assertTrue(orderService.processOrder(5, 10), "Should succeed when stock is enough");
    }

    @Test
    void testOrderFailure() {
        assertFalse(orderService.processOrder(15, 10), "Should fail when stock is low");
    }
}
