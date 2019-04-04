package com.student.dao;

import java.util.List;

import org.springframework.jdbc.core.JdbcTemplate;

import com.student.bean.Student;
import com.student.mapper.StudentMapper;

public class StudentPageDao {
	private JdbcTemplate jdbcTemplate;

	/**
	 * @param jdbcTemplate
	 *            セットする jdbcTemplate
	 */
	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}

	/**
	 * 获取student数据表的总记录数
	 *
	 * @return
	 */
	public int StudentTableNumber() {
		String sql = "SELECT id,name,birthday,age,score,classid,address FROM student";
		List<Student> studentList = jdbcTemplate.query(sql, new StudentMapper());
		int stuTableNum = studentList.size();
		return stuTableNum;
	}

	/**
	 * 第一次查询student表
	 *
	 * @param first
	 * @param pageSize
	 * @return
	 */
	public List<Student> getStudentPage(int first, int pageSize) {
		String sql = "SELECT id,name,birthday,age,score,classid,address FROM student LIMIT " + first + "," + pageSize + "";
		List<Student> studentList = jdbcTemplate.query(sql, new StudentMapper());
		return studentList;
	}














}
