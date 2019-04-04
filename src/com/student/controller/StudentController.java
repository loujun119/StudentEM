package com.student.controller;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.ArrayList;
import java.util.Enumeration;
import java.util.List;

import javax.servlet.ServletContext;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import javax.servlet.http.HttpSessionContext;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.student.bean.Account;
import com.student.bean.Student;
import com.student.bean.StudentPage;
import com.student.dao.AccountDao;
import com.student.dao.StudentDao;
import com.student.dao.StudentPageDao;

@Controller
public class StudentController {

	private static StudentDao getStudentDao() {
		ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		StudentDao getStuDao = (StudentDao) context.getBean("StuDao");
		return getStuDao;
	}


	@RequestMapping(value="/goToHomePage")
	public String goToSystemPage() {
		return "welcome";
	}

	@RequestMapping(value = "goToSelPage")
	public String getSelPage(Model model) {
		StudentDao dao = getStudentDao();
		model.addAttribute("studentList", dao.queryAll());
		return "select";
	}

	@RequestMapping(value = "goToAddPage")
	public String getAddPage(Model model) {
		StudentDao dao = getStudentDao();
		model.addAttribute("studentList", dao.queryAll());
		return "addstu";
	}

	@RequestMapping(value = "goToDelPage")
	public String getDelPage(Model model) {
		StudentDao dao = getStudentDao();
		model.addAttribute("studentList", dao.queryAll());
		return "delete";
	}

	@RequestMapping(value = "goToUpdatePage")
	public String getUpDatePage(Model model) {
		StudentDao dao = getStudentDao();
		model.addAttribute("studentList", dao.queryAll());
		return "update";
	}

	@RequestMapping(value = "queryId")
	public String getStudentById(String id, Model model) {
		StudentDao dao = getStudentDao();
		int stuId = Integer.valueOf(id.trim());
		List<Student> studentList = dao.queryById(stuId);
		model.addAttribute("studentList", studentList);
		return "select";
	}

	@RequestMapping(value = "queryName")
	public String getStudentByName(String name, Model model) {
		StudentDao dao = getStudentDao();
		List<Student> studentList = dao.queryByName(name.trim());
		model.addAttribute("studentList", studentList);
		return "select";
	}

	@RequestMapping(value = "/addStudent")
	public String addStudent(String name, String birthday, String age, String score, String classid, Model model) {
		Student student = new Student();
		student.setName(name.trim());
		student.setBirthday(birthday.trim());
		student.setAge(Integer.valueOf(age.trim()));
		student.setScore(Double.valueOf(score.trim()));
		student.setClassId(Integer.valueOf(classid.trim()));
		StudentDao dao = getStudentDao();
		boolean result = dao.addStudent(student);
		if (result) {
			System.out.println("更新完了");
		} else {
			System.out.println("更新できませんでした");
		}
		model.addAttribute("studentList", dao.queryAll());
		return "addstu";
	}

	@RequestMapping(value = "/checkStudentName.do")
	protected void checkStudentName(HttpServletRequest request, HttpServletResponse response) throws IOException {
		StudentDao dao = getStudentDao();
		String studentName = request.getParameter("studentName");
		boolean answer = dao.checkStudentName(studentName);
		String result = null;
		if (answer == true) {
			result = "<font color = 'red'>この名前が使えません</font>";
		} else {
			result = "<font color = 'green'>この名前が使えます</font>";
		}
		response.setCharacterEncoding("UTF-8");
		response.setContentType("text/html;charset=UTF-8");
		response.getWriter().print(result);
	}

	@RequestMapping(value = "/delete")
	public String deleteStudent(String id, Model model) {
		int stuid = Integer.valueOf(id.trim());
		StudentDao dao = getStudentDao();
		boolean result = dao.delStudent(stuid);
		if (result) {
			System.out.println("削除完了");
		} else {
			System.out.println("削除できませんでした");
		}
		model.addAttribute("studentList", dao.queryAll());
		return "delete";
	}

	@RequestMapping(value = "/update")
	public String updateStudent(String name, String birthday, String age, String score, String classid, String id,
			Model model) {
		Student student = new Student();
		student.setName(name.trim());
		student.setBirthday(birthday.trim());
		student.setAge(Integer.valueOf(age.trim()));
		student.setScore(Integer.valueOf(score.trim()));
		student.setClassId(Integer.valueOf(classid.trim()));
		student.setId(Integer.valueOf(id.trim()));
		StudentDao dao = getStudentDao();
		boolean result = dao.upStudent(student);
		if (result) {
			System.out.println("更新完了");
		} else {
			System.out.println("更新できませんでした");
		}
		model.addAttribute("studentList", dao.queryAll());
		return "update";
	}

	@RequestMapping(value = "/addaddress")
	public String addStudentAddress(String addr11, String id, Model model) {
		String address = addr11.trim();
		int stuId = Integer.valueOf(id.trim());
		StudentDao dao = getStudentDao();
		boolean result = dao.addAddress(address, stuId);
		if (result) {
			System.out.println("更新完了");
		} else {
			System.out.println("更新できませんでした");
		}
		model.addAttribute("studentList", dao.queryAll());
		return "update";
	}




	/**
	 * 指定文件下载方式
	 *
	 * @return
	 * @throws IOException
	 */
	@RequestMapping(value = "/downloadstudent")
	public static void downLoadStudent(HttpServletRequest request, HttpServletResponse response) throws IOException {
		// 通知浏览器这是一个下载文件的请求
		response.setContentType("application/x-masdownload");

		// 指定要下载的文件名称
		String fileName = "download.xlsx";
		// 通知浏览器，不再由浏览器来自行处理（或打开）要下载的文件，而由用户端来处理（主要应对IE浏览器）
		response.setHeader("Content-Disposition", "attachment;filename=" + URLEncoder.encode(fileName, "UTF-8"));
		// 编写文件输出流
		OutputStream out = response.getOutputStream();
		// 配置要下载的文件路径
		String excelFileName = "C:\\Users\\louyifan\\Desktop\\Java資料\\新学生授業のスケジュール.xlsx";
		// 首先用Java读取要下载的文件
		InputStream in = new FileInputStream(excelFileName);
		// servlet IO 传输步骤
		byte[] buffer = new byte[1024];
		int len = 0;
		while ((len = in.read(buffer)) != -1) {
			out.write(buffer, 0, len);
		}
		// 关闭IN接口
		in.close();
	}

}
