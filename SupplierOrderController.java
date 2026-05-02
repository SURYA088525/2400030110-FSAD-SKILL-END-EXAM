package com.klef.fsad.exam.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import com.klef.fsad.exam.model.SupplierOrder;
import com.klef.fsad.exam.service.SupplierOrderService;

@RestController
@RequestMapping("/orders")
public class SupplierOrderController {

    @Autowired
    SupplierOrderService service;

    @PostMapping("/add")
    public SupplierOrder add(@RequestBody SupplierOrder s){
        return service.add(s);
    }
}