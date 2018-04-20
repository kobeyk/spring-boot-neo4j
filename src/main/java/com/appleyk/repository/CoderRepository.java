package com.appleyk.repository;


import org.springframework.data.neo4j.repository.GraphRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.appleyk.node.Coder;


/**
 * Coder 节点增删改
 * @author yukun24@126.com
 * @blob   http://blog.csdn.net/appleyk
 * @date   2018年4月20日13:13:36
 */

@Repository
public interface CoderRepository extends GraphRepository<Coder>{

	/*
	 CoderRepositiory 继承 GraphRepository类，实现增删查改
	   实现自己的接口:通过名字查询Coder(可以是单个Coder，也可以是一个List集合)，
	 spring-data-neo4j 支持方法命名约定查询 findBy{Coder的属性名}，
	 findBy后面的属性名一定要Coder类里存在，否则会报错 
	 */
	
	 Coder findByName(@Param("name") String name);

	 
}
