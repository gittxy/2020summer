package com.example.bx_web.pojo;


import java.util.Date;

/**
 * 角色role实体
 * @author txy
 *
 */

public class Role {

	private Long role_id;
	private String name;
	private String code;
	private String description;
	private Date created;
	private Date updated;

	public Long getRole_id() {
		return role_id;
	}
	public void setRole_id(Long role_id) {
		this.role_id = role_id;
	}

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}

	public String getCode(){return code;}
	public void setCode(String code){this.code=code;}

	public String getDescription(){return description;}
	public void setDescription(String description){this.description=description;}

	public Date getCreated(){return created;}
	public void setCreated(Date created){this.created=created;}

	public Date getUpdated(){return updated;}
	public void setUpdated(Date updated){this.updated=updated;}

}
