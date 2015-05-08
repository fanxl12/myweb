/*******************************************************************************
 * Copyright (c) 2005, 2014 springside.github.io
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 *******************************************************************************/
package com.fanxl.myweb.repository;

import java.util.List;

import com.fanxl.myweb.entity.Task;

@MyBatisRepository
public interface TaskDao {

	List<Task> findAll();

	Task findOne(long id);
	
	void updateTask(Task task);

	void save(Task task);

	void delete(Long id);
}
