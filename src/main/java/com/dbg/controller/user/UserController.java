package com.dbg.controller.user;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.dbg.bo.User.UserService;
import com.dbg.dto.UserDTO;
import com.dbg.exceptions.UserNotFoundException;

@RestController
@RequestMapping(value="/user")
public class UserController {

	@Autowired
	private UserService service;
	
	@RequestMapping(method=RequestMethod.GET)
	public List<UserDTO> findAll(){
		return service.findAll();
	}
	
	@RequestMapping(value="/{id}", method= RequestMethod.GET)
	public UserDTO findById(@PathVariable("id") Integer id) throws UserNotFoundException{
		return service.findUserById(id);
	}
	
	
	@RequestMapping(method=RequestMethod.POST)
	public UserDTO create(@RequestBody UserDTO u){
		return service.create(u);
	}
	
	@RequestMapping(value="/{id}",method=RequestMethod.PUT)
	public UserDTO update(@PathVariable("id") Integer id,@RequestBody UserDTO u){
		return service.update(id,u);
	}
	
	@RequestMapping(value="/{id}", method= RequestMethod.DELETE)
	public void delete(@PathVariable("id") Integer id){
		service.delete(id);
	}
	
}
