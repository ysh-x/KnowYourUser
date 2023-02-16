package com.ysh;

import com.ysh.model.*;
import com.ysh.dao.UserDAO;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class InsertController {

	@RequestMapping("/insert")
	public ModelAndView insert(HttpServletRequest request, HttpServletResponse response) throws ClassNotFoundException {
		
		UserDAO db = new UserDAO();
		String name = request.getParameter("name");	
		String email = request.getParameter("email");
		String country = request.getParameter("country");
		User user = new User(0,name,email,country);
		db.insertUser(user);
		
		ModelAndView MV = new ModelAndView();
		List<User> answer = db.selectAllUsers();
		MV.setViewName("Display.jsp");
		MV.addObject("view", answer);
		
		return MV;
	}

}
