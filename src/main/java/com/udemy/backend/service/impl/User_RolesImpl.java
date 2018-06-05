package com.udemy.backend.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.udemy.backend.entity.User;
import com.udemy.backend.entity.UserRole;
import com.udemy.backend.repository.UserRoleRepository;
import com.udemy.backend.service.User_RolesService;

@Service("user_RolesImpl")
public class User_RolesImpl implements User_RolesService {

	@Autowired
	@Qualifier("userRoleRepository")
	private UserRoleRepository user_RolesRepository;

	@Override
	public List<UserRole> findPrivilegeByUser(User user) {
		return user_RolesRepository.findPrivilegeByUser(user);
	}

	@Override
	public UserRole addNewUserRole(UserRole userRole) {
		return user_RolesRepository.save(userRole);
	}

	@Override
	public void deletePrivilegesByUser(List<UserRole> lista) {
		for(UserRole x: lista)
			user_RolesRepository.delete(x);
	}

}
