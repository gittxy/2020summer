package com.example.bx_web.mapper;

import com.example.bx_web.pojo.Store;

import java.util.List;

public interface StoreMapper {
    void add(Store store);
    void delete(Long store_id);
    int edit(Store store);
    List<Store> getAllStore();
}
