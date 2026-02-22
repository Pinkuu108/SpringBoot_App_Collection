package com.lb.client;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

import com.lb.user.User;

@FeignClient(name = "todoClient", url = "https://jsonplaceholder.typicode.com")
public interface TodoClient {

    @GetMapping("/todos/1")
    User getTodo();
}