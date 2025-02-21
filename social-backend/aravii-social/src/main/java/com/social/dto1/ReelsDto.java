package com.social.dto1;

import com.social.model.User;

import jakarta.persistence.ManyToOne;
import lombok.Data;

@Data
public class ReelsDto {
	
	private Long id;
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getVideo() {
		return video;
	}

	public void setVideo(String video) {
		this.video = video;
	}

	public UserDto getUser() {
		return user;
	}

	public void setUser(UserDto user) {
		this.user = user;
	}

	private String title;
	private String video;
	
	private UserDto user;

}
