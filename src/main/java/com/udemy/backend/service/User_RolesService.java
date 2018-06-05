package com.udemy.backend.service;

import com.udemy.backend.entity.UserRole;
import java.util.List;
import com.udemy.backend.entity.User;

public interface User_RolesService {

	public abstract List<UserRole> findPrivilegeByUser(User user);
	
	public abstract UserRole addNewUserRole(UserRole userRole);

	public abstract void deletePrivilegesByUser(List<UserRole> lista);
	
}
