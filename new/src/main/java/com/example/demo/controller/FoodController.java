package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.Food;
import com.example.demo.service.FoodService;

@RestController

public class FoodController {

	
	@Autowired
	private FoodService service;
	
	
	
	@PostMapping("/addfood")
	public Food addFood(@RequestBody Food food){
		return service.saveFood(food);
	}
	
	@PostMapping("/addfoods")
	public List<Food> addFoods(@RequestBody List<Food> foods){
		return service.saveFoods(foods);
	}
	
	
	@GetMapping("/showfood/{foodId}")
	public Food showFood(@PathVariable int foodId){
		return service.getFood(foodId);
	}
	
	@GetMapping("/showfoods")
	public List<Food> showFoods(){
		return service.getFoods();
	} 
	
	
	//@GetMapping("/showfoodnames/{foodName}")
	//public List<Food> showFoodName(@PathVariable List<String> foodName){
	//	return service.getFoodName(foodName);
	//}
	
	@PutMapping("/change")
	public Food changeFood(Food food){
		return service.updateFood(food);
	}	
	
	@DeleteMapping("/delete/{foodId}")
	public String delete(@PathVariable int foodId){
		return service.deleteFoo(foodId);
	}
	
}
