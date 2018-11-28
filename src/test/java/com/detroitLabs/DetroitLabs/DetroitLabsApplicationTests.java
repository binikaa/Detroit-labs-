package com.detroitLabs.DetroitLabs;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.detroitLabs.DetroitLabs.dao.MenuItemsDao;

import com.detroitLabs.DetroitLabs.entity.MenuItems;
@RunWith(SpringRunner.class)
@SpringBootTest
public class DetroitLabsApplicationTests {

	@Autowired
	MenuItemsDao menuItemsDao;
	
	@Test
	public void findAllReturnsResults() {
		List<MenuItems> results = menuItemsDao.findAll();
		
		assertFalse(results.isEmpty());
		assertEquals(MenuItems.class, results.get(0).getClass());
		
	}
	@Test
	public void findByIdReturnsResult() {
		MenuItems result = menuItemsDao.findById(1L);
		assertNotNull(result);
		assertEquals("Veggie Taco",result.getDescription());
		//assertEquals("2.50",result.getPrice());
		
	}

}
;