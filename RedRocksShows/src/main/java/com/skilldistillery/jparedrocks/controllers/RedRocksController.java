package com.skilldistillery.jparedrocks.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.skilldistillery.jparedrocks.data.RedRocksDAO;

@Controller
public class RedRocksController {
	
	@Autowired
	private RedRocksDAO dao;
	
	@RequestMapping(path= {"/","home.do"})
	public String home(Model model) {
		model.addAttribute("DEBUG", dao.findByID(1));
		return "home";
	}

}
