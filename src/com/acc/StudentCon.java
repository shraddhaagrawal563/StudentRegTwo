package com.acc;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.validation.Validator;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class StudentCon {
	
	@Autowired
	private EmpValidator val;
	
	@RequestMapping("/register.htm")
	public ModelAndView getValue() {
		ModelAndView mv = new ModelAndView();
		Student stu = new Student();
		mv.addObject("stu",stu);
		mv.setViewName("fillform.jsp");
		return mv;
	}

	@RequestMapping("/registered.htm")
	public ModelAndView registerUser(@ModelAttribute("stu") Student stu ,BindingResult errors) {
		val.validate(stu,errors);
		ModelAndView mv = new ModelAndView();
		if(errors.hasErrors()) {
			mv.addObject("stu",stu);
			mv.setViewName("fillform.jsp");
			return mv;
		}else {
		
		mv.addObject("stu",stu);
		mv.setViewName("display.jsp");
		return mv;
	}
	}
	
}
