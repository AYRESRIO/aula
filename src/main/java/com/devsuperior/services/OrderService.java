package com.devsuperior.services;

import org.springframework.stereotype.Service;
import com.devsuperior.entities.Order;

@Service
public class OrderService extends   ShippingService {

    public double total(Order order){
        return order.getBase()-(order.getBase()*(order.getDiscount() / 100))
                +shipment(order);
    }
}
