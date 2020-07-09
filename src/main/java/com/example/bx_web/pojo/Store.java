package com.example.bx_web.pojo;

import java.util.Date;

public class Store {
    private Long store_id;
    private Long store_manager_id;
    private String store_phone_num;
    private String store_telephone;
    private String store_name;
    private String store_position;
    private Date created;
    private Date updated;

    public Long getStore_id(){return store_id;}
    public void setStore_id(Long store_id){this.store_id=store_id;}

    public Long getStore_manager_id(){return store_manager_id;}
    public void setStore_manager_id(Long store_manager_id){this.store_manager_id=store_manager_id;}

    public String getStore_phone_num(){return store_phone_num;}
    public void setStore_phone_num(String store_phone_num){this.store_phone_num=store_phone_num;}

    public String getStore_telephone(){return store_telephone;}
    public void setStore_telephone(String store_telephone){this.store_telephone=store_telephone;}

    public String getStore_name(){return store_name;}
    public void setStore_name(String store_name){this.store_name=store_name;}

    public String getStore_position(){return store_position;}
    public void setStore_position(String store_position){this.store_position=store_position;}

    public Date getCreated(){return created;}
    public void setCreated(Date created){this.created=created;}

    public Date getUpdated(){return updated;}
    public void setUpdated(Date updated){this.updated=updated;}
}
