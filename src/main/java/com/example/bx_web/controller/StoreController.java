package com.example.bx_web.controller;


import com.example.bx_web.pojo.Store;
import com.example.bx_web.service.StoreService;
import com.example.bx_web.utils.JsonUtils;
import com.google.gson.Gson;
import org.json.JSONException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class StoreController {
    @Autowired
    public StoreService storeService;

    @RequestMapping(value = "/addStore")
    public void AddStore(String jsonStr) throws JSONException {
        Gson gson = new Gson();
        Store store = gson.fromJson(jsonStr, Store.class);
        storeService.add(store);
    }

    @RequestMapping(value = "/deleteStore")
    public void DeleteStore(String jsonStr) throws JSONException {
        Gson gson=new Gson();
        Store store = gson.fromJson(jsonStr, Store.class);
        storeService.delete(store.getStore_id());
    }

    @RequestMapping(value = "/editStore")
    public void EditStore(String jsonStr) throws JSONException {
        Gson gson = new Gson();
        Store store = gson.fromJson(jsonStr, Store.class);
        storeService.edit(store);
    }

    @RequestMapping(value = "/getTotalStore")
    public String GetTotalStore() throws JSONException {
        List<Store> list = storeService.getAllStore();

        return JsonUtils.putJson(list);
    }
}
