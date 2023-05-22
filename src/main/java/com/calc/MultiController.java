package com.calc;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.servlet.ModelAndView;

@Controller
public class MultiController {
	
	@RequestMapping("/multiply")
	public ModelAndView add(HttpServletRequest request, HttpServletResponse response) {
		int i= Integer.parseInt(request.getParameter("txtnum1"));
		int j= Integer.parseInt(request.getParameter("txtnum2"));
		int k =i*j;
		ModelAndView mv = new ModelAndView();
		mv.setViewName("display.jsp");
		mv.addObject("result" , k);
		return mv;
	}
}

