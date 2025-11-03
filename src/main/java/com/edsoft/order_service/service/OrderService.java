package com.edsoft.order_service.service;

import com.edsoft.order_service.model.Order;
import com.edsoft.order_service.model.OrderItem;
import com.edsoft.order_service.model.Product;
import com.edsoft.order_service.repository.OrderRepository;
import com.edsoft.order_service.repository.ProductRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.time.Instant;
import java.util.List;

@Service
public class OrderService {
    @Autowired
    public OrderRepository orderRepository;

    @Autowired
    public ProductRepository productRepository;

    public Order createOrder(String username, List<OrderItem> items) {
        if (username == null || username.isBlank()) {
            throw new ResponseStatusException(HttpStatus.BAD_REQUEST, "username is required");
        }
        if (items == null) {
            throw new ResponseStatusException(HttpStatus.BAD_REQUEST, "items list cannot be null");
        }
        System.out.println("createOrder: username=" + username + ", items.size=" + items.size());
        if (items.isEmpty()) {
            throw new ResponseStatusException(HttpStatus.BAD_REQUEST, "items list is empty");
        }

        for (int i = 0; i < items.size(); i++) {
            OrderItem item = items.get(i);
            System.out.println("Loop index: " + i + ", item = " + item);
            if (item == null) {
                System.out.println(" -> item is null");
                continue;
            }
            if (item.getProduct() == null || item.getProduct().getId() == null) {
                throw new ResponseStatusException(HttpStatus.BAD_REQUEST, "each item must contain product.id");
            }
            Product p = productRepository.findById(item.getProduct().getId())
                    .orElseThrow(() -> new ResponseStatusException(HttpStatus.BAD_REQUEST, "Product not found: " + item.getProduct().getId()));
            item.setProduct(p);
            item.setUnitPrice(p.getPrice());
        }

        Order o = new Order(null, username, items, "CREATED", Instant.now());
        return orderRepository.save(o);
    }


    public List<Order> listOrdersForUser(String username) { return orderRepository.findByCustomerUsername(username); }

    public List<Order> listAllOrders() { return orderRepository.findAll(); }

    public Order markDelivered(Long orderId) {
        Order o = orderRepository.findById(orderId).orElseThrow();
        o.setStatus("DELIVERED");
        return orderRepository.save(o);
    }
}