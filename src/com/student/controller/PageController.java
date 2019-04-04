package com.student.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.student.bean.Student;
import com.student.bean.StudentPage;
import com.student.dao.StudentPageDao;

@Controller
public class PageController {


	private static StudentPageDao getStudentPageDao() {
		ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		StudentPageDao getPageDao = (StudentPageDao) context.getBean("PageDao");
		return getPageDao;
	}

	/**
	 * 人工初始化分页显示第一页
	 *
	 * @param model
	 * @return
	 */
	@RequestMapping(value = "goToStuPage")
	public String getStudentAll(Model model) {
		StudentPageDao dao = getStudentPageDao();

		StudentPage page = new StudentPage();
		page.setStudentTableNum(dao.StudentTableNumber());
		page.setNowPageNum(1);
		page.getTotalPages();
		int first = 0;
		int pageSize = page.getPageSize();
		List<Student> studentList = dao.getStudentPage(first, pageSize);
		model.addAttribute("studentList", studentList);
		model.addAttribute("totalPages", page.getTotalPages());
		model.addAttribute("nowPageNum", page.getNowPageNum());
		return "student";
	}

	/**
	 * 根据页面获得的当前页信息，自动计算，获取上一页数据
	 *
	 * @param request
	 * @param model
	 * @return
	 */
	@RequestMapping(value = "/getPrefPage")
	public String getPrefPage(HttpServletRequest request, Model model) {
		String pageNo = request.getParameter("prefpage");
		StudentPageDao dao = getStudentPageDao();
		StudentPage page = new StudentPage();
		page.setNowPageNum(Integer.valueOf(pageNo));
		page.setStudentTableNum(dao.StudentTableNumber());
		page.getTotalPages();
		int first = (page.getPrefPage() - 1) * page.getPageSize();
		int pageSize = page.getPageSize();
		List<Student> studentList = dao.getStudentPage(first, pageSize);
		model.addAttribute("studentList", studentList);
		model.addAttribute("totalPages", page.getTotalPages());
		model.addAttribute("nowPageNum", page.getPrefPage());
		return "student";
	}

	/**
	 * 根据页面获得的当前页信息，自动计算，获取下一页数据
	 *
	 * @param request
	 * @param model
	 * @return
	 * @throws IOException
	 */
	@RequestMapping(value = "/getNextPage")
	public String getNextPage(HttpServletRequest request, Model model) {
		String pageNo = request.getParameter("nextpage");
		StudentPageDao dao = getStudentPageDao();
		StudentPage page = new StudentPage();
		page.setNowPageNum(Integer.valueOf(pageNo));
		page.setStudentTableNum(dao.StudentTableNumber());
		page.getTotalPages();
		int first = (page.getNextPage() - 1) * page.getPageSize();
		int pageSize = page.getPageSize();
		List<Student> studentList = dao.getStudentPage(first, pageSize);
		model.addAttribute("studentList", studentList);
		model.addAttribute("totalPages", page.getTotalPages());
		model.addAttribute("nowPageNum", page.getNextPage());
		return "student";
	}

	@RequestMapping(value = "/goToLastPage")
	public String getLastPage(Model model) {
		StudentPageDao dao = getStudentPageDao();
		StudentPage page = new StudentPage();
		page.setStudentTableNum(dao.StudentTableNumber());
		int first = (page.getTotalPages() - 1) * page.getPageSize();
		int pageSize = page.getPageSize();
		List<Student> studentList = dao.getStudentPage(first, pageSize);
		model.addAttribute("studentList", studentList);
		model.addAttribute("totalPages", page.getTotalPages());
		model.addAttribute("nowPageNum", page.getTotalPages());
		return "student";
	}

	@RequestMapping(value = "/goToFindPage")
	public String getFindPage(String pageNO, Model model) {
		StudentPageDao dao = getStudentPageDao();
		StudentPage page = new StudentPage();
		page.setStudentTableNum(dao.StudentTableNumber());
		int first = (Integer.valueOf(pageNO.trim()) - 1) * page.getPageSize();
		int pageSize = page.getPageSize();
		List<Student> studentList = dao.getStudentPage(first, pageSize);
		model.addAttribute("studentList", studentList);
		model.addAttribute("totalPages", page.getTotalPages());
		model.addAttribute("nowPageNum", pageNO);
		return "student";
	}

}
