package com.devsuperior.services;

import com.devsuperior.entities.Order;
public class ShippingService {
    private Double freight;
    public double shipment(Order order) {

        if(order.getBase()>0 && order.getBase()<100.00)
            freight=20.00;
        if(order.getBase()>=100.00 && order.getBase()<200.00)
            freight=12.00;
        if(order.getBase()>=200.00)
            freight =0.00;

        return freight;
    }

}