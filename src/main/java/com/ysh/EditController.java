package com.ysh;

import com.ysh.dao.*;
import com.ysh.model.User;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@Controller
public class EditController {

		@RequestMapping("/edit")
		public ModelAndView edit(HttpServletRequest request, HttpServletResponse response) throws ClassNotFoundException {
			int ID = Integer.parseInt(request.getParameter("selectStudent").toString());
			UserDAO db = new UserDAO();
			User user = db.selectUser(ID);
			
			ModelAndView mv = new ModelAndView();
			mv.setViewName("EditFinal.jsp");
			mv.addObject("user", user);
			mv.addObject("trial","trial");
			return mv;
		}
}
