package com.popular.cloud.inteface;

import org.springframework.cloud.openfeign.FeignClient;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(value = "cloud-payment-service")
public interface Testfeign {

    @GetMapping("/taobao/{id}")
    String get(@PathVariable(value = "id") Integer id);

    @GetMapping("/taobao/timeout")
    String getTimeOut();
}
