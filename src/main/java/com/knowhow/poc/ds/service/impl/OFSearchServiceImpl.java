package com.knowhow.poc.ds.service.impl;

import com.knowhow.poc.ds.service.SearchService;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Service;

@Service("OF")
@Order(1)
public class OFSearchServiceImpl implements SearchService {

    @Override
    public String findAddress() {
        return "find address using OF Database";
    }
}
