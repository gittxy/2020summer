package com.example.bx_web.service;

import com.example.bx_web.pojo.Store;

import java.util.List;

public interface StoreService {
    void add(Store store);
    void delete(Long store_id);
    List<Store> getAllStore();
    int edit(Store store);
}
