package com.social.dto1.mapper;

import java.util.ArrayList;
import java.util.List;

import com.social.model.Post;
import com.social.model.User;
import com.social.utils.PostUtils;
import com.social.dto1.CommentDto;
import com.social.dto1.PostDto;
import com.social.dto1.UserDto;

public class PostDtoMapper {
	
	public static PostDto toPostDto(Post post,User user) {
		
		UserDto userDto=UserDtoMapper.userDTO(post.getUser());
		List<User> likedUsers=new ArrayList<>(post.getLiked());
		List<UserDto> userDtos=UserDtoMapper.userDTOS(likedUsers);
		List<CommentDto> comments=CommentDtoMapper.toCommentDtos(post.getComments());
		
		PostDto postDto=new PostDto();
		postDto.setCaption(post.getCaption());
		postDto.setCreatedAt(post.getCreatedAt());
		postDto.setId(post.getId());
		postDto.setImage(post.getImage());
		postDto.setUser(userDto);
		postDto.setLiked(userDtos);
		postDto.setComments(comments);
		postDto.setLikedByRequser(PostUtils.isLikedByReqUser(post, user));
		postDto.setSavedByRequser(PostUtils.isSaved(post, user));
		
		return postDto;
		
	}
	
	public static List<PostDto> toPostDtos(List<Post> posts, User user){
		List<PostDto> postDtos=new ArrayList<>();
		
		for(Post post:posts) {
			PostDto postDto=toPostDto(post,user);
			postDtos.add(postDto);
		}
		return postDtos;
	}

}
