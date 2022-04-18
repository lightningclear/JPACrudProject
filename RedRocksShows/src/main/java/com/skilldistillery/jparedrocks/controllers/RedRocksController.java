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
		model.addAttribute("RedRocks", dao.findByID(1));
		return "home";
	}
	@RequestMapping(path = "search.do", method = RequestMethod.POST)
	public ModelAndView findByID(int redRocksId) {
		ModelAndView mv = new ModelAndView();
		RedRocks redRocks = dao.findByID(redRocksId);
		mv.addObject("RedRocks", redRocks);
		mv.setViewName("show");
		return mv;
	}
	
	@RequestMapping(path = "searchByKeyword.do", method = RequestMethod.POST)
	public ModelAndView findShowByKeyword(String keyword) {
		ModelAndView mv = new ModelAndView();
		RedRocks redRocks = dao.findShowByKeyword(keyword);
		mv.addObject("RedRocks", redRocks);
		mv.setViewName("show");
		return mv;
	}
	
	@RequestMapping(path = "create.do", method = RequestMethod.POST)
	public ModelAndView createDate(RedRocks show) {
		ModelAndView mv = new ModelAndView();
		RedRocks redRocks = dao.createDate(show);
		mv.addObject("RedRocks", redRocks);
		mv.setViewName("show");
		return mv;
	}
	
	@RequestMapping(path = "update.do", method = RequestMethod.GET)
	public ModelAndView createDate(RedRocks show,int id) {
		ModelAndView mv = new ModelAndView();
		RedRocks redRocks = dao.createDate(show);
		mv.addObject("RedRocks", redRocks);
		mv.setViewName("show");
		return mv;
	}
	
	@RequestMapping(path = "update.do", method = RequestMethod.POST)
	public ModelAndView createDate(RedRocks show,int id) {
		ModelAndView mv = new ModelAndView();
		RedRocks redRocks = dao.createDate(show);
		mv.addObject("RedRocks", redRocks);
		mv.setViewName("show");
		return mv;
	}
	
//	@RequestMapping(path = "save.do", method = RequestMethod.POST)
//	public ModelAndView saveDate(RedRocks show) {
//		ModelAndView mv = new ModelAndView();
//		RedRocks redRocks = dao.(show);
//		mv.addObject("RedRocks", redRocks);
//		mv.setViewName("show");
//		return mv;
//	}
	
	@RequestMapping(path = "delete.do", method = RequestMethod.POST)
	public ModelAndView deleteDate(RedRocks show, int id) {
		ModelAndView mv = new ModelAndView();
		 dao.deleteDate(show,id);
		mv.addObject("RedRocks", show);
		mv.setViewName("show");
		return mv;
	}
}
	
	

