package com.knowhow.poc.ds.rest;

import com.knowhow.poc.ds.service.AddressService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class AddressController {

    private final AddressService addressService;

    @GetMapping("/address")
    public String getAddress() {
        return addressService.getAddress();
    }
}
