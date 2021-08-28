package com.coinker.eio.domain.customer.gateway;

import com.coinker.eio.domain.customer.Customer;

public interface CustomerGateway {
    public Customer getByById(String customerId);
}
