package com.example.demo.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity


public class Food {
	@Id
	@GeneratedValue
		private int foodId;
		private String foodName;
		private int foodQty;
		private float price; 
	
	
	public int getFoodId() {
		return foodId;
	}
	
	public void setFoodId(int foodId) {
		this.foodId = foodId;
	}
	
	public String getFoodName() {
		return foodName;
	}
	
	public void setFoodName(String foodName) {
		this.foodName = foodName;
	}
	
	public int getFoodQty() {
		return foodQty;
	}
	
	public void setFoodQty(int foodQty) {
		this.foodQty = foodQty;
	}
	
	public float getPrice() {
		return price;
	}
	
	public void setPrice(float price) {
		this.price = price;
	}
		
}
