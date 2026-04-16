package com.example;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/orders")
public class OrderController {

    @Autowired
    private OrderService orderService;

    @GetMapping("/process")
    public String placeOrder(@RequestParam int qty, @RequestParam int stock) {
        boolean success = orderService.processOrder(qty, stock);
        return success ? "Order Placed Successfully!" : "Order Failed: Insufficient Stock.";
    }
}
