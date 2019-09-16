package com.knowhow.poc.ds.service.impl;

import com.knowhow.poc.ds.service.AddressService;
import com.knowhow.poc.ds.service.SearchService;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Service;

@Service
@Order(2)
public class AddressServiceImpl implements AddressService {

    private SearchService searchService;

    AddressServiceImpl(@Qualifier("searchServiceType") SearchService searchService) {
        this.searchService = searchService;
    }

    @Override
    public String getAddress() {
        return searchService.findAddress();
    }
}
