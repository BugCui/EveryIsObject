package com.coinker.eio.api;

import com.alibaba.cola.dto.MultiResponse;
import com.alibaba.cola.dto.Response;
import com.coinker.eio.dto.CustomerAddCmd;
import com.coinker.eio.dto.CustomerListByNameQry;
import com.coinker.eio.dto.data.CustomerDTO;

public interface CustomerServiceI {

    public Response addCustomer(CustomerAddCmd customerAddCmd);

    public MultiResponse<CustomerDTO> listByName(CustomerListByNameQry customerListByNameQry);
}
