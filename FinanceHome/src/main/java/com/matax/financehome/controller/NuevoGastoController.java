package com.matax.financehome.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class NuevoGastoController {

	@RequestMapping("nuevoGasto")
	public ModelAndView agregarGasto()throws Exception{
		
		ModelAndView mav = new ModelAndView();
		mav.setViewName("nuevoGasto");
		return mav;
	}
	
	@RequestMapping("guardarGasto")
	public String guardarGasto(@RequestParam("gasto")Gasto gasto)throws Exception{
		return "main.htm";
	}
}
