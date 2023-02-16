package com.ysh;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.ysh.dao.UserDAO;
import com.ysh.model.User;

@Controller
public class EditFinalController {

	@RequestMapping("/editfinal")
	public ModelAndView editFinal(HttpServletRequest request, HttpServletResponse response) throws ClassNotFoundException {
		System.out.print(request.getParameter("id"));
		int ID = Integer.parseInt(request.getParameter("id").toString());
		String name = request.getParameter("name");
		String email = request.getParameter("email");
		String country = request.getParameter("country");
		User user = new User(ID,name,email,country);
		UserDAO db = new UserDAO();
		db.updateUser(user);
		
		List<User> view =  db.selectAllUsers();
		ModelAndView mv = new ModelAndView();
		mv.setViewName("Display.jsp");
		mv.addObject("view", view);
		return mv;
		
	}
}
