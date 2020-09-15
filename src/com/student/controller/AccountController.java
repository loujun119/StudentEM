package com.student.controller;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.student.bean.Account;
import com.student.dao.AccountDao;

@Controller
public class AccountController {

　　//Test
	private static AccountDao getAccountDao() {
		ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		AccountDao getAccDao = (AccountDao) context.getBean("AccDao");
		return getAccDao;
	}

	@RequestMapping(value = "/sinkikaiin")
	public String addUserAccount(String username, String userpass, Model model) {
		AccountDao dao = getAccountDao();
		String name = username.trim();
		String nameOk = "よこそ:" + name;
		String password = userpass.trim();
		boolean result = dao.newAccount(name, password);
		if (result) {
			System.out.println("更新完了");
		} else {
			System.out.println("更新できませんでした");
		}
		model.addAttribute("user", nameOk);
		// model.addAttribute("session", session.getId());
		return "welcome";
	}

	@RequestMapping(value = "/gotouserpage")
	public String getUserAccount(String username, String userpass, Model model) {
		AccountDao dao = getAccountDao();
		String name = username.trim();
		String nameOk = "よこそ:" + name;
		String nameNg = "すみません," + name + "は存在しません";
		String password = userpass.trim();
		List<Account> userList = dao.checkAccountUser(name,password);
		if (userList.size() == 1 ) {
			model.addAttribute("user", nameOk);
			return "welcome";
		} else {
			model.addAttribute("user", nameNg);
			return "nameNG";
		}
	}


}
