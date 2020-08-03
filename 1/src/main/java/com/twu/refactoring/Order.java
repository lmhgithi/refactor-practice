package com.twu.refactoring;

import java.util.List;

public class Order {
    private final String customerName;
    private final String customerAddress;
    private final List<LineItem> lineItems;

    public Order(String customerName, String addr, List<LineItem> li) {
        this.customerName = customerName;
        this.customerAddress = addr;
        this.lineItems = li;
    }

    public String getCustomerName() {
        return customerName;
    }

    public String getCustomerAddress() {
        return customerAddress;
    }

    public List<LineItem> getLineItems() {
        return lineItems;
    }
}
