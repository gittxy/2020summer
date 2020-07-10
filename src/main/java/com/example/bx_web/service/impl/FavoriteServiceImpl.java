package com.example.bx_web.service.impl;

import com.example.bx_web.mapper.FavoriteMapper;
import com.example.bx_web.pojo.Favorite;
import com.example.bx_web.service.FavoriteService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;
@Service("favoriteService")
public class FavoriteServiceImpl implements FavoriteService {
    @Resource
    private FavoriteMapper favoriteMapper;
    @Override
    public void add(Favorite favorite) {
        this.favoriteMapper.add(favorite);
    }

    @Override
    public void delete(int favorite_id) {
        this.favoriteMapper.delete(favorite_id);
    }

    @Override
    public List<Favorite> findList(int user_id) {
        return this.favoriteMapper.findList(user_id);
    }
}
