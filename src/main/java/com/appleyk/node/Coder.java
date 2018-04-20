package com.appleyk.node;

import org.neo4j.ogm.annotation.NodeEntity;

/**
 * Neo4j的节点实体类：Coder
 * 
 * @author yukun24@126.com
 * @blob http://blog.csdn.net/appleyk
 * @date 2018年4月20日13:09:22
 */

@NodeEntity
public class Coder extends BaseEntity {

	private String sex;
	private String hobby;

	public Coder() {

	}

	public String getSex() {
		return sex;
	}

	public void setSex(String sex) {
		this.sex = sex;
	}

	public String getHobby() {
		return hobby;
	}

	public void setHobby(String hobby) {
		this.hobby = hobby;
	}

}
