package com.detroitLabs.DetroitLabs.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.detroitLabs.DetroitLabs.dao.CartItemdao;
import com.detroitLabs.DetroitLabs.dao.MenuItemsDao;
import com.detroitLabs.DetroitLabs.entity.CartItem;
import com.detroitLabs.DetroitLabs.entity.MenuItems;



@Controller
public class CartItemController {
	@Autowired
	CartItemdao cartItemDao;
	@Autowired
	MenuItemsDao menuItemDao;

private int q=0;
double total=0;

@RequestMapping("/addtocart/{item.id}")
public ModelAndView showcartItems(@PathVariable ("item.id") Long Id) {
	     CartItem cartitem=new CartItem();
	     MenuItems m = menuItemDao.findById(Id);
	      q=q+1;
	     cartitem.setId(Id);
	     cartitem.setMenuItem(m);
	     cartitem.setQuantity(q);
	     cartItemDao.update( cartitem);
	     if(q>=4) {
	    	 total=total-(total*0.20);
	     }
	    total= total+ cartitem.getMenuItem().getPrice();
	    
		ModelAndView mv= new ModelAndView("cart");
		
		mv.addObject("cartitem",cartItemDao.findAll());
		mv.addObject("total",total);
		return mv;


}
}
/*
@RequestMapping("/addtocart")
public ModelAndView addtoCart(@RequestParam("id") Long MenuItemId)
{
	MenuItems m = menuItemDao.findById(MenuItemId);
	com.detroitLabs.DetroitLabs.entity.CartItem cartitem= new com.detroitLabs.DetroitLabs.entity.CartItem();
	cartitem.setQuantity(3);
	cartitem.setMenuItem(m);
	cartItemDao.create(cartitem);
	return new ModelAndView("redirect:/cartitem");
}*/