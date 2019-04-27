package org.example.demo.business.dao.impl;

import java.lang.reflect.ParameterizedType;
import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.example.demo.business.dao.BaseDao;
import org.example.demo.business.model.BaseEntity;
import org.springframework.beans.factory.annotation.Autowired;

public class BaseDaoImpl<T extends BaseEntity, PK> implements BaseDao<T, PK> {

	@Autowired
	protected SqlSession sqlSession;

	protected Class<T> entityClass;

	protected static final String INSERT = "insert";

	protected static final String UPDATE_BY_ID = "updateByPrimaryKey";

	protected static final String DELETE_BY_ID = "deleteByPrimaryKey";

	protected static final String GET_BY_ID = "selectByPrimaryKey";

	protected static final String MAPPER_PACKAGE = "org.example.demo.business.mapper.";
	protected static final String DOT = "Mapper.";

	@SuppressWarnings("unchecked")
	public BaseDaoImpl() {
		entityClass = (Class<T>) ((ParameterizedType) this.getClass().getGenericSuperclass())
				.getActualTypeArguments()[0];
	}

	protected String getStatementPrefix() {
		return MAPPER_PACKAGE + entityClass.getSimpleName() + DOT;
	}

	@Override
	public void insertEntity(T entity) {

	}

	@Override
	public T findEntityId(PK id) {
		T entity = null;
		List<T> resultList = this.sqlSession.selectList(this.getStatementPrefix() + GET_BY_ID, id);
		if (!resultList.isEmpty()) {
			entity = resultList.get(0);
		}
		return entity;
	}

	@Override
	public void updateEntity(T entity) {
		// TODO Auto-generated method stub

	}

	@Override
	public void deleteEntityById(PK id) {
		// TODO Auto-generated method stub

	}

}
