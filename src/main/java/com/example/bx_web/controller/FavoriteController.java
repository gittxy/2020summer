package com.example.bx_web.controller;

import com.example.bx_web.pojo.Cart;
import com.example.bx_web.pojo.Favorite;
import com.example.bx_web.service.FavoriteService;
import com.example.bx_web.utils.JsonUtils;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import org.json.JSONException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.lang.reflect.Type;
import java.util.List;

@RestController
public class FavoriteController {
    @Autowired
    public FavoriteService favoriteService;

    @RequestMapping(value = "/favorite")
    public String Favorite(String jsonStr) throws JSONException {
        Gson gson = new Gson();
        Favorite favorite = gson.fromJson(jsonStr, Favorite.class);
        List<Favorite> favoriter=favoriteService.findList(favorite.getUser_id());
//        List<Favorite> favoriter=favoriteService.findList(2);
        System.out.println(JsonUtils.putJson(favoriter));
        return JsonUtils.putJson(favoriter);
    }

    @RequestMapping(value = "/addfavorite")
    public void AddFavorite(String jsonStr) throws JSONException {
        Gson gson = new Gson();
        Favorite favorite = gson.fromJson(jsonStr, Favorite.class);
        favoriteService.add(favorite);
    }

    @RequestMapping(value = "/deletefavorite")
    public void DeleteFavorite(String jsonStr) throws JSONException {
        Gson gson=new Gson();
        Type type = new TypeToken<List<Favorite>>(){}.getType();
        List<Favorite> list = gson.fromJson(jsonStr, type);
        for (int i = 0; i < list.size(); i++) {
            favoriteService.delete(list.get(i).getFavorite_id());
        }
    }
}
