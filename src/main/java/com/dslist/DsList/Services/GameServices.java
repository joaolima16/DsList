package com.dslist.DsList.Services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dslist.DsList.DTO.GameMinDTO;
import com.dslist.DsList.Repository.GameRepository;
import com.dslist.DsList.entities.Game;

@Service
public class GameServices {
	@Autowired
	private GameRepository gameRepository;
	
	public List <GameMinDTO> findAll(){
	List<Game> result = gameRepository.findAll();
	List<GameMinDTO> dto = result.stream().map(x -> new GameMinDTO(x)).toList();
		return dto;
	}
}
