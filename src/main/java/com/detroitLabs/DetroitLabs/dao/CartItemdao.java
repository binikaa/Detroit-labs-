package com.detroitLabs.DetroitLabs.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;

import com.detroitLabs.DetroitLabs.entity.CartItem;

@Repository
@Transactional

	
	public class CartItemdao {

		@PersistenceContext
		private EntityManager em;
		
		
		public List<CartItem> findAll() {
			return em.createQuery("FROM CartItem",CartItem.class).getResultList();
		}
		
	    public CartItem findById(Long id) {
			
			return em.find(CartItem.class,id);
		}
	    public void create(CartItem cartitem) {
			em.persist(cartitem);
			
		}
	    public void update(CartItem cartitem) {
			em.merge(cartitem);
			
		}
	       public void delete(Long id) {
			
	    	   CartItem cartitem = em.getReference(CartItem.class, id);
			em.remove(cartitem);
			
		}
	    
			
		

	}

