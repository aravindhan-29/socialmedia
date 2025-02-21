package com.social.request;

import lombok.Data;

@Data
public class SingleChatRequest {
	
	private Integer userId;

	public Integer getUserId() {
		return userId;
	}

	public void setUserId(Integer userId) {
		this.userId = userId;
	}


}
