package com.knowhow.configclient.service.impl;

import com.knowhow.configclient.SearchType;
import com.knowhow.configclient.service.SearchService;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Service;

@Service("EGON")
@Order(1)
public class EGONSearchServiceImpl implements SearchService {
    @Override
    public String findAddress() {

        return "find address using Egon APIs";
    }
}
