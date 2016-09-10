package com.matax.financehome.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class MainController {

	@RequestMapping("main")
	public ModelAndView main()throws Exception{
		
		ModelAndView mav = new ModelAndView();
		
		mav.setViewName("main");
		mav.addObject("mensaje", "chupala");
		
		return mav;
	}
}
