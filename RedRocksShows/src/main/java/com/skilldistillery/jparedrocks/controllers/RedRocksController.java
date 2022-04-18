package com.skilldistillery.jparedrocks.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.skilldistillery.jparedrocks.data.RedRocksDAO;
import com.skilldistillery.jparedrocks.entities.RedRocks;

@Controller
public class RedRocksController {
	
	@Autowired
	private RedRocksDAO dao;
	
	@RequestMapping(path= {"/","home.do"})
	public String home(Model model) {
		model.addAttribute("DEBUG", dao.findByID(1));
		return "home";
	}
	@RequestMapping(path = "searchId.do", method = RequestMethod.POST)
	public ModelAndView findById(int redRocksId) {
		ModelAndView mv = new ModelAndView();
		RedRocks redRocks = dao.findByID(redRocksId);
		mv.addObject("RedRocks", redRocks);
		mv.setViewName("WEB-INF/show.jsp");
		return mv;
	}

	@RequestMapping(path = "searchKeyword.do", method = RequestMethod.GET)
	public ModelAndView getFilmByKeyword(String keyword) {
		ModelAndView mv = new ModelAndView();
		List<Film> film = dao.findFilmByKeyword(keyword);
		mv.addObject("film", film);
		mv.setViewName("WEB-INF/searchByKeyword.jsp");
		return mv;
	}
//	@RequestMapping(path = "searchId.do", method = RequestMethod.GET)
//	public ModelAndView get
	
	
	

