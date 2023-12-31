package com.dslist.DsList.DTO;

import com.dslist.DsList.entities.Game;

public class GameMinDTO {
	private String title;
	private Integer year;
	private String imgUrl;
	private String shortDescription;
	private Long id;
	public Long getId() {
		return id;
	}

	public String getTitle() {
		return title;
	}

	public Integer getYear() {
		return year;
	}

	public String getImgUrl() {
		return imgUrl;
	}

	public String getShortDescription() {
		return shortDescription;
	}

	
	public GameMinDTO(Game entity) {
		super();
		this.id = entity.getId();
		this.title = entity.getTitle();
		this.year = entity.getYear();
		this.imgUrl = entity.getImgUrl();
		this.shortDescription = entity.getShortDescription();
	}
	
	public GameMinDTO() {
		
	}
}
