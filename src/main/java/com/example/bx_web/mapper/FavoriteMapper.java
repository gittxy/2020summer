package com.example.bx_web.mapper;



import com.example.bx_web.pojo.Favorite;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;
@Mapper
public interface FavoriteMapper {
    void add(Favorite favorite);
    void delete(int favorite_id);
    List<Favorite> findList(int user_id);
}
