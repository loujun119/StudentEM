package com.student.dao;

import java.util.List;

import org.springframework.jdbc.core.JdbcTemplate;

import com.student.bean.Account;
import com.student.mapper.AccountMapper;

public class AccountDao {
	private  JdbcTemplate jdbcTemplate;

	/**
	 * @param jdbcTemplate
	 *            セットする jdbcTemplate
	 */
	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}

	public boolean newAccount(String name,String password) {
		String sql="INSERT INTO studentaccount VALUE(0,?,?)";
		return jdbcTemplate.update(sql,name,password)==1;
	}

	public List<Account> checkAccountUser(String name,String password) {
		String sql="SELECT name,password FROM studentaccount WHERE name = '"+name+"' AND '"+password+"'";
		 List<Account> accountUser = jdbcTemplate.query(sql, new AccountMapper());
		 return accountUser;
	}


}
