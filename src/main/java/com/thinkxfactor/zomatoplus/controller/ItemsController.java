package com.thinkxfactor.zomatoplus.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.thinkxfactor.zomatoplus.models.Items;
import com.thinkxfactor.zomatoplus.repository.ItemsRepository;
import java.util.*;


@RestController
@RequestMapping("/Items")
public class ItemsController {
	

	

	
	@Autowired
	private ItemsRepository ItemsRepository;
	
	
	@GetMapping("/getAll")
	public List<Items> getAll() {
		List <Items> listofItemss=ItemsRepository.findAll();
		return listofItemss;
	}
	
	@PostMapping("/add")
	public Items addItems(@RequestBody Items Items) {
		Items persistedItems=ItemsRepository.save(Items);
		return persistedItems;
	}
	
}