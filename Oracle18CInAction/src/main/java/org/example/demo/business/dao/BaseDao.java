package org.example.demo.business.dao;

import org.example.demo.business.model.BaseEntity;

public interface BaseDao<T extends BaseEntity, PK> {

	public void insertEntity(T entity);

	public T findEntityId(PK id);

	public void updateEntity(T entity);

	public void deleteEntityById(PK id);

}
