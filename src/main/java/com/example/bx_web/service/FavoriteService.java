package com.example.bx_web.service;

import com.example.bx_web.pojo.Favorite;

import java.util.List;

public interface FavoriteService {
    void add(Favorite favorite);
    void delete(int favorite_id);
    List<Favorite> findList(int user_id);
}
