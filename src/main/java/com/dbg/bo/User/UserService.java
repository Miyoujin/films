package com.dbg.bo.User;

import java.util.List;

import com.dbg.dto.UserDTO;
import com.dbg.exceptions.UserNotFoundException;
import com.dbg.model.user.User;

public interface UserService {

	UserDTO transform(User u);
	
	User transform(UserDTO u);
	
	public List<UserDTO> findAll();
	
	public UserDTO findUserById(Integer id) throws UserNotFoundException;
	
	public UserDTO create(UserDTO u);
	
	public void delete(Integer id);
	
	public UserDTO update(Integer id, UserDTO u);
}
