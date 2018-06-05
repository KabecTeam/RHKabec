package com.udemy.backend.repository;

import java.io.Serializable;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.udemy.backend.entity.User;
import com.udemy.backend.entity.UserRole;

@Repository("userRoleRepository")
public interface UserRoleRepository extends JpaRepository<UserRole, Serializable> {

	public abstract List<UserRole> findPrivilegeByUser(User user);

	
}
