package com.student.mapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.student.bean.Account;

public class AccountMapper implements RowMapper<Account>{

	@Override
	public Account mapRow(ResultSet rs, int num) throws SQLException {
		Account account = new Account();
		account.setName(rs.getString("name"));
		account.setPassWord(rs.getString("password"));

		return account;
	}

}
