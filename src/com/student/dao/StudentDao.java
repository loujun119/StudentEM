package com.student.dao;

import java.util.ArrayList;
import java.util.List;

import org.springframework.jdbc.core.JdbcTemplate;

import com.student.bean.Student;
import com.student.mapper.StudentMapper;

public class StudentDao {

	private  JdbcTemplate jdbcTemplate;

	/**
	 * @param jdbcTemplate
	 *            セットする jdbcTemplate
	 */
	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}

	public List<Student> queryAll() {
		String sql = "SELECT id,name,birthday,age,score,classid,address FROM student";
		List<Student> studentList = new ArrayList<>();
		studentList = jdbcTemplate.query(sql, new StudentMapper());

		return studentList;
	}

	public List<Student> queryById(int stuId) {
		String sql = "SELECT id,name,birthday,age,score,classid,address FROM student WHERE id =" + stuId + "";
		List<Student> studentList = new ArrayList<>();
		studentList = jdbcTemplate.query(sql, new StudentMapper());
		return studentList;

	}

	public List<Student> queryByName(String name) {
		String sql = "SELECT id,name,birthday,age,score,classid,address FROM student WHERE name =" + name + "";
		List<Student> studentList = new ArrayList<>();
		studentList = jdbcTemplate.query(sql, new StudentMapper());
		return studentList;
	}

	public boolean addStudent(Student student) {
		String sql = "INSERT INTO student(id,name,birthday,age,score,classid) VALUES(0,?,?,?,?,?)";
		return jdbcTemplate.update(sql, student.getName(), student.getBirthday(), student.getAge(), student.getScore(),
				student.getClassId()) == 1;
	}

	public boolean checkStudentName(String studentName) {
		String sql = "SELECT id,name,birthday,age,score,classid,address FROM student WHERE name = '"+studentName+"'";
		List<Student> studentList =jdbcTemplate.query(sql, new StudentMapper());
		if(studentList.size()>0) {
			return true;
		}else {
			return false;
		}
	}

	public boolean delStudent(int stuid) {
		String sql = "DELETE FROM student WHERE id=?";
		return jdbcTemplate.update(sql, stuid) == 1;
	}

	public boolean upStudent(Student student) {
		String sql = "UPDATE student SET name=?,birthday=?,age=?,score =? ,classid =?  where id =?";

		return jdbcTemplate.update(sql, student.getName(), student.getBirthday(), student.getAge(), student.getScore(),
				student.getClassId(), student.getId())==1;
	}

	public boolean addAddress(String address,int stuId) {
		String sql ="UPDATE student SET address=? WHERE id=?";
		return jdbcTemplate.update(sql, address,stuId) == 1;
	}
}
