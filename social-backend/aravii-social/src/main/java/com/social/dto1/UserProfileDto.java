package com.social.dto1;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import com.social.model.User;

import lombok.Data;

@Data
public class UserProfileDto {

	private Integer id;
	private String username;
	private String email;
	private String firstName;
	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getMobile() {
		return mobile;
	}

	public void setMobile(String mobile) {
		this.mobile = mobile;
	}

	public String getWebsite() {
		return website;
	}

	public void setWebsite(String website) {
		this.website = website;
	}

	public String getBio() {
		return bio;
	}

	public void setBio(String bio) {
		this.bio = bio;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getImage() {
		return image;
	}

	public void setImage(String image) {
		this.image = image;
	}

	public List<UserDto> getFollower() {
		return follower;
	}

	public void setFollower(List<UserDto> follower) {
		this.follower = follower;
	}

	public List<User> getFollowing() {
		return following;
	}

	public void setFollowing(List<User> following) {
		this.following = following;
	}

	public List<StoryDto> getStories() {
		return stories;
	}

	public void setStories(List<StoryDto> stories) {
		this.stories = stories;
	}

	public List<ReelsDto> getReels() {
		return reels;
	}

	public void setReels(List<ReelsDto> reels) {
		this.reels = reels;
	}

	public List<PostDto> getSavedPosts() {
		return savedPosts;
	}

	public void setSavedPosts(List<PostDto> savedPosts) {
		this.savedPosts = savedPosts;
	}

	public List<PostDto> getReposts() {
		return reposts;
	}

	public void setReposts(List<PostDto> reposts) {
		this.reposts = reposts;
	}

	private String lastName;
	private String mobile;
	private String website;
	private String bio;
	private String gender;
	private String image;
	
	private List<UserDto> follower = new ArrayList<>();
	
	private List<User> following = new ArrayList<>();

	private List<StoryDto> stories = new ArrayList<>();
	
	private List<ReelsDto> reels=new ArrayList<>();

	private List<PostDto> savedPosts = new ArrayList<>();
	
	private List<PostDto> reposts = new ArrayList<>();
	

}
