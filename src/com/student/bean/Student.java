package com.student.bean;

public class Student {
	private int id;
	private String name;
	private String birthday;
	private int age;
	private double score;
	private int classId;
	private String address;

	/**
	 * @return address
	 */
	public String getAddress() {
		return address;
	}

	/**
	 * @param address
	 *            セットする address
	 */
	public void setAddress(String address) {
		this.address = address;
	}

	/**
	 * @return id
	 */
	public int getId() {
		return id;
	}

	/**
	 * @param id
	 *            セットする id
	 */
	public void setId(int id) {
		this.id = id;
	}

	/**
	 * @return name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name
	 *            セットする name
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * @return birthday
	 */
	public String getBirthday() {
		return birthday;
	}

	/**
	 * @param birthday
	 *            セットする birthday
	 */
	public void setBirthday(String birthday) {
		this.birthday = birthday;
	}

	/**
	 * @return age
	 */
	public int getAge() {
		return age;
	}

	/**
	 * @param age
	 *            セットする age
	 */
	public void setAge(int age) {
		this.age = age;
	}

	/**
	 * @return score
	 */
	public double getScore() {
		return score;
	}

	/**
	 * @param score
	 *            セットする score
	 */
	public void setScore(double score) {
		this.score = score;
	}

	/**
	 * @return classId
	 */
	public int getClassId() {
		return classId;
	}

	/**
	 * @param classId
	 *            セットする classId
	 */
	public void setClassId(int classId) {
		this.classId = classId;
	}

	/* (非 Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", birthday=" + birthday + ", age=" + age + ", score=" + score
				+ ", classId=" + classId + ", address=" + address + "]";
	}

}
