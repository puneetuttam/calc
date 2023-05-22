package com.calc;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.servlet.ModelAndView;

@Controller
public class DivController {
	
	@RequestMapping("/divide")
	public ModelAndView add(HttpServletRequest request, HttpServletResponse response) {
		double i= Double.parseDouble(request.getParameter("txtnum1"));
		double j= Double.parseDouble(request.getParameter("txtnum2"));
		double k =i/j;
		ModelAndView mv = new ModelAndView();
		mv.setViewName("display.jsp");
		mv.addObject("result" , k);
		return mv;
	}
}

