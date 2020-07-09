package com.example.bx_web.pojo;

import java.util.Date;

/**
 * 角色权限实体
 * @author txy
 *
 */

public class RoleAuthority {
    private Long role_id;
    private Long privilege_id;
    private Date created;
    private Date updated;

    public Long getRole_id(){return role_id;}
    public void setRole_id(Long role_id){this.role_id=role_id;}


}
