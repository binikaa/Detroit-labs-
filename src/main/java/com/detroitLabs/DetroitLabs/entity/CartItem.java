package com.detroitLabs.DetroitLabs.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;




	@Entity
	
	public class CartItem {
		
		@Id @GeneratedValue(strategy=GenerationType.IDENTITY)
		private Long id;
		//private Long menu_itid;
		private Integer quantity;
		
		@ManyToOne
		private MenuItems menuItem;
		public CartItem() {
			super();
		}
		
		public CartItem(Long id, Integer quantity, MenuItems menuItem) {
			super();
			this.id = id;
			this.quantity = quantity;
			this.menuItem = menuItem;
		}

		public Long getId() {
			return id;
		}
		public void setId(Long id) {
			this.id = id;
		}
		
		public Integer getQuantity() {
			return quantity;
		}
		public void setQuantity(Integer quantity) {
			this.quantity = quantity;
		}

		public MenuItems getMenuItem() {
			return menuItem;
		}

		public void setMenuItem(MenuItems menuItem) {
			this.menuItem = menuItem;
		}
		
		
		
		
	}

