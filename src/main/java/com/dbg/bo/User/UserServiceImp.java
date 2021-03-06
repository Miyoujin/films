package com.dbg.bo.User;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dbg.dao.user.UserDao;
import com.dbg.dto.UserDTO;
import com.dbg.exceptions.UserNotFoundException;
import com.dbg.model.user.User;

@Service
public class UserServiceImp implements UserService {

	//private static final Logger log = LoggerFactory.getLogger(UserService.class);
	
	@Autowired
	private UserDao userDao;
	
	@Override
	public UserDTO transform(User u) {
		return new UserDTO(u.getName());
	}

	@Override
	public User transform(UserDTO u) {
		final User user=new User();
		user.setName(u.getName());
		return user;
	}

	@Override
	public List<UserDTO> findAll() { 
		List<UserDTO> allU = new ArrayList<UserDTO>();
		userDao.findAll().forEach(u -> allU.add(transform(u)));
		return allU;
	}

	@Override
	public UserDTO findUserById(Integer id) throws UserNotFoundException {
		final User u=userDao.findOne(id);
		if(u !=null)
			return transform(u);
		else
			throw new UserNotFoundException();
	}

	@Override
	public UserDTO create(UserDTO u) {
		return transform(userDao.save(transform(u)));
		
	}

	@Override
	public void delete(Integer id) {
		userDao.delete(id);
		
	}

	@Override
	public UserDTO update(Integer id, UserDTO u) {
		final User user= transform(u);
		user.setId(id);
		
		return transform(userDao.save(user));
	}

}
