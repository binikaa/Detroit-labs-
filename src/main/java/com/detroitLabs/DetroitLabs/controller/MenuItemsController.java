package com.detroitLabs.DetroitLabs.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.detroitLabs.DetroitLabs.dao.MenuItemsDao;




@Controller
public class MenuItemsController {
	@Autowired
    MenuItemsDao menuItemsDao;
	
	@RequestMapping("/")
	public ModelAndView showMenuItems() {
		
			
			ModelAndView mv= new ModelAndView("index");
			
	       mv.addObject("items",menuItemsDao.findAll());
			return mv;
	}

}
