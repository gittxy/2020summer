package com.example.bx_web.pojo;

import org.springframework.stereotype.Component;

import java.util.Date;

/**
 * 权限实体
 * @author txy
 *
 */
@Component
public class Authority {
	private Long priv_id;
	private String name;
	private String code;
	private String url;
	private int parent_id;
	private Date created;
	private Date updated;
	private int is_parent;

	public Long getPriv_id() {
		return priv_id;
	}
	public void setPriv_id(Long priv_id) {
		this.priv_id = priv_id;
	}

	public String getName(){return name;}
	public void setName(String name){this.name=name;}

	public String getCode(){return code;}
	public void setCode(String code){this.code=code;}

	public String getUrl(){return url;}
	public void setUrl(String url){this.url=url;}

	public int getParent_id(){return parent_id;}
	public void setParent_id(int parent_id){this.parent_id=parent_id;}

	public Date getCreated(){return created;}
	public void setCreated(Date created){this.created=created;}

	public Date getUpdated(){return updated;}
	public void setUpdated(Date updated){this.updated=updated;}

	public int getIs_parent(){return is_parent;}
	public void setIs_parent(int is_parent){this.is_parent=is_parent;}

}
