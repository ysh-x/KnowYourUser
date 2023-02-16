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
public class DisplayController {

		@RequestMapping("/display")
		public ModelAndView displayUser(HttpServletRequest request, HttpServletResponse response) throws ClassNotFoundException {
			
			UserDAO db = new UserDAO();
			ModelAndView MV = new ModelAndView();
			List<User> answer = db.selectAllUsers();
			MV.setViewName("DisplaySpecial.jsp");
			MV.addObject("view", answer);
			
			return MV;
		}
}
