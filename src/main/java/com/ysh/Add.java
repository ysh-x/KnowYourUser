package com.ysh;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class Add {
	
	@RequestMapping("/add")
	public ModelAndView add(HttpServletRequest request, HttpServletResponse response) {
		int i = Integer.parseInt((String)request.getParameter("t1"));
		int j = Integer.parseInt((String)request.getParameter("t2"));
		int k = i + j;
		
		List <Integer> values =  new ArrayList<Integer>();
		values.add(12);
		values.add(45);
		values.add(12);
		values.add(45);
		
		List<List<Integer>> table = new ArrayList<List<Integer>>();
		table.add(values);
		table.add(values);
		table.add(values);
	
		values.add(12);
		values.add(45);
		table.add(values);
		
		ModelAndView space = new ModelAndView();
		space.setViewName("Display.jsp");
		space.addObject("numberOne", i);
		space.addObject("numberTwo", j);
		space.addObject("result", k);
		space.addObject("values", table);
		return space;
	}

}
