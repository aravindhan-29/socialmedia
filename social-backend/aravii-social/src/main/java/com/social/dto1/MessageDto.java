package com.social.dto1;

import java.time.LocalDateTime;

import lombok.Data;

@Data
public class MessageDto {

	private String content;
	private String image;
	private Integer id;
	private LocalDateTime timeStamp;
	private Boolean is_read;
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public String getImage() {
		return image;
	}
	public void setImage(String image) {
		this.image = image;
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public LocalDateTime getTimeStamp() {
		return timeStamp;
	}
	public void setTimeStamp(LocalDateTime timeStamp) {
		this.timeStamp = timeStamp;
	}
	public Boolean getIs_read() {
		return is_read;
	}
	public void setIs_read(Boolean is_read) {
		this.is_read = is_read;
	}
	public UserDto getUser() {
		return user;
	}
	public void setUser(UserDto user) {
		this.user = user;
	}
	public ChatDto getChat() {
		return chat;
	}
	public void setChat(ChatDto chat) {
		this.chat = chat;
	}
	private UserDto user;
	private ChatDto chat;
	
	
	
	
	
}
