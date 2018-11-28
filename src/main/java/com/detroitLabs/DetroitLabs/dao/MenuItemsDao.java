package com.detroitLabs.DetroitLabs.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;

import com.detroitLabs.DetroitLabs.entity.MenuItems;




	@Repository
	@Transactional
	public class MenuItemsDao {
		
	@PersistenceContext
	private EntityManager em;

	public List<MenuItems>findAll()
	{

	    return em.createQuery("From MenuItems",MenuItems.class).getResultList();
	}

	public MenuItems findById(Long id) {
		return em.find(MenuItems.class, id);
	}
	public void create(MenuItems menu_item) {
		em.persist(menu_item);
	}

	public void update(MenuItems menu_item) {
		
		em.merge(menu_item);
	}
	public void delete(Long id) {
		// Deleting with Hibernate entity manager requires fetching a reference first.
		MenuItems menu_item = em.getReference(MenuItems.class, id);
		em.remove(menu_item);
	}
	

	
}
