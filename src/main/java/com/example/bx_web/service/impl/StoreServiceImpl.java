package com.example.bx_web.service.impl;

import com.example.bx_web.mapper.StoreMapper;
import com.example.bx_web.pojo.Store;
import com.example.bx_web.service.StoreService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service("storeService")
public class StoreServiceImpl implements StoreService {
    @Resource
    private StoreMapper storeMapper;

    @Override
    public void add(Store store) {
        storeMapper.add(store);
    }

    @Override
    public void delete(Long store_id) {
        storeMapper.delete(store_id);
    }

    @Override
    public List<Store> getAllStore() {
        return storeMapper.getAllStore();
    }

    @Override
    public int edit(Store store) {
        return storeMapper.edit(store);
    }

}
