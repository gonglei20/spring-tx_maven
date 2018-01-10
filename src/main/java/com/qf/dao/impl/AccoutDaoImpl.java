package com.qf.dao.impl;

import org.springframework.jdbc.core.support.JdbcDaoSupport;

import com.qf.dao.IAccoutDao;

public class AccoutDaoImpl extends JdbcDaoSupport implements IAccoutDao {

	@Override
	public void addMoney(Integer id, Double money) {
		String sql="update t_accout set money=money+? where id=?";
		getJdbcTemplate().update(sql,money,id);

	}

	@Override
	public void deMoney(Integer id, Double money) {
		String sql="update t_accout set money=money-? where id=?";
		getJdbcTemplate().update(sql,money,id);

	}

}
