package com.dslist.DsList.Controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.dslist.DsList.DTO.GameMinDTO;
import com.dslist.DsList.Services.GameServices;
import com.dslist.DsList.entities.Game;

@RestController
@RequestMapping(value = "/games")
public class gameController {
	
	
	@Autowired
	private GameServices gameServices;
	
	@GetMapping
	public List<GameMinDTO> findAll(){
		List<GameMinDTO> result = gameServices.findAll();
		return result;
		
	}
}
