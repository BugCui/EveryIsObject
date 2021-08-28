package com.coinker.eio.domain.customer.gateway;

import com.coinker.eio.domain.customer.Customer;
import com.coinker.eio.domain.customer.Credit;

//Assume that the credit info is in antoher distributed Service
public interface CreditGateway {
    public Credit getCredit(String customerId);
}
