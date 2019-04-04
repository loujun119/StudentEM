package com.student.bean;

public class StudentPage {
	//当前页
	private int nowPageNum;
	//总页数
	private int totalPages;
	//数据表总记录数
	private int studentTableNum;
	//每页显示多少条数据
	private int pageSize=5;
	//下一页
	private int nextPage;
	//上一页
	private int prefPage;


	/**
	 * @return nowPageNum
	 */
	public int getNowPageNum() {
		if(nowPageNum < 0) {
			nowPageNum = 1;
		}else if(nowPageNum > totalPages) {
			nowPageNum =totalPages;
		}
		return nowPageNum;
	}
	/**
	 * @param nowPageNum セットする nowPageNum
	 */
	public void setNowPageNum(int nowPageNum) {
		this.nowPageNum = nowPageNum;
	}
	/**
	 * @return totalPages
	 */
	public int getTotalPages() {
		if(studentTableNum % pageSize ==0) {
			totalPages = studentTableNum / pageSize;
		}else {
			totalPages = studentTableNum / pageSize + 1;
		}
		return totalPages;
	}
	/**
	 * @param totalPages セットする totalPages
	 */
	public void setTotalPages(int totalPages) {
		this.totalPages = totalPages;
	}
	/**
	 * @return studentTableNum
	 */
	public int getStudentTableNum() {
		return studentTableNum;
	}
	/**
	 * @param studentTableNum セットする studentTableNum
	 */
	public void setStudentTableNum(int studentTableNum) {
		this.studentTableNum = studentTableNum;
	}
	/**
	 * @return pageSize
	 */
	public int getPageSize() {
		return pageSize;
	}
	/**
	 * @param pageSize セットする pageSize
	 */
	public void setPageSize(int pageSize) {
		this.pageSize = pageSize;
	}
	/**
	 * @return nextPage
	 */
	public int getNextPage() {
		if(nowPageNum < totalPages) {
			nextPage = nowPageNum + 1;
		}else {
			nextPage = nowPageNum;
		}

		return nextPage;
	}
	/**
	 * @param nextPage セットする nextPage
	 */
	public void setNextPage(int nextPage) {
		this.nextPage = nextPage;
	}
	/**
	 * @return prefPage
	 */
	public int getPrefPage() {
		if(nowPageNum > 1) {
			prefPage = nowPageNum - 1;
		}else {
			prefPage = nowPageNum;
		}
		return prefPage;
	}
	/**
	 * @param prefPage セットする prefPage
	 */
	public void setPrefPage(int prefPage) {
		this.prefPage = prefPage;
	}

//
//
//	/**
//	 * @return startNextPage
//	 */
//	public int getStartNextPage() {
//		startNextPage = (nextPage-1) * pageSize;
//
//		return startNextPage;
//	}
//	/**
//	 * @param startNextPage セットする startNextPage
//	 */
//	public void setStartNextPage(int startNextPage) {
//		this.startNextPage = startNextPage;
//	}
//	/**
//	 * @return startPrefPage
//	 */
//	public int getStartPrefPage() {
//		startPrefPage = (startPrefPage-1) *pageSize;
//		return startPrefPage;
//	}
//	/**
//	 * @param startPrefPage セットする startPrefPage
//	 */
//	public void setStartPrefPage(int startPrefPage) {
//		this.startPrefPage = startPrefPage;
//	}
	/* (非 Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "StudentPage [nowPageNum=" + nowPageNum + ", totalPages=" + totalPages + ", studentTableNum="
				+ studentTableNum + ", pageSize=" + pageSize + ", nextPage=" + nextPage + ", prefPage=" + prefPage
				+ "]";
	}


}
