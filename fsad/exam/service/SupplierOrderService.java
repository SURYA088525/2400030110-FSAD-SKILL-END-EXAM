package com.klef.fsad.exam.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.klef.fsad.exam.model.SupplierOrder;
import com.klef.fsad.exam.repository.SupplierOrderRepository;

@Service
public class SupplierOrderService {
    @Autowired
    SupplierOrderRepository repo;

    public SupplierOrder add(SupplierOrder s){
        return repo.save(s);
    }
}