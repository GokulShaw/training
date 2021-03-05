package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.Food;
import com.example.demo.repository.FoodRepository;

@Service
    
public class FoodService {

	@Autowired
	private FoodRepository repository;
	
	
	//*****post-method for ONE
	
	public Food saveFood(Food food){
		return repository.save(food);
	}
	
	//post-method for LIST
	
	public List<Food> saveFoods(List<Food> foods){
		return repository.saveAll(foods);
	}
	
	//*****get-method for ONE
	
	public Food getFood(int foodId){
		return repository.findById(foodId).orElse(null);
	}
	
	//get-method for LIST
	
	public List<Food> getFoods(){
		return repository.findAll();
	} 
	
	//get-method for LIST for different variables
	
	//public List<Food> getFoodName(List<String> foodName){
	//	return repository.findAll(foodName);
	//}
	
	//delete-method
	
	
	public String deleteFoo(int foodId){
		repository.deleteById(foodId);
		return "Food removed<<>>" + foodId;
	}
	
	//put-method
	
	public Food updateFood(Food food){
		Food existingItems = repository.findById(food.getFoodId()).orElse(null);
		existingItems.setFoodName(food.getFoodName());
		existingItems.setFoodQty(food.getFoodQty());
		existingItems.setPrice(food.getPrice());
		return repository.save(existingItems);
		
	}
	
	
	

	
}
