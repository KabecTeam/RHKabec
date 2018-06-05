package com.udemy.backend.service.impl;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.udemy.backend.entity.UserRole;
import com.udemy.backend.repository.UserRepository;

@Service("userService")
public class UserService implements UserDetailsService {

	@Autowired
	@Qualifier("userRepository")
	private UserRepository userRepository;

	/*
	 * Este metodo nos permite devolver los detalles del Usuario para su
	 * autenticacion correcta y segura en el sistema
	 */
	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		com.udemy.backend.entity.User user = userRepository.findByUsername(username);
		List<GrantedAuthority> authorities = buildAutorities(user.getUserRole());
		return buildUser(user, authorities);
	}

	// Construye los detalles del usuario para cargar su autenticacion en el
	// sistema
	private User buildUser(com.udemy.backend.entity.User user, List<GrantedAuthority> authorities) {
		return new User(user.getUsername(), user.getPassword(), user.isEnabled(), true, true, true, authorities);
	}

	// Este metodo carga las autorizaciones del usuario por su Rol
	private List<GrantedAuthority> buildAutorities(Set<UserRole> userRoles) {
		Set<GrantedAuthority> auths = new HashSet<GrantedAuthority>();
		for (UserRole userRole : userRoles) {
			auths.add(new SimpleGrantedAuthority(userRole.getRole()));
		}
		return new ArrayList<GrantedAuthority>(auths);
	}

	// Metodo que no depende de Spring Security como los anteriores
	// Solo devuelve un usuario buscado por su userName
	public com.udemy.backend.entity.User findUser(String username) {
		return userRepository.findByUsername(username);
	}
	
	public com.udemy.backend.entity.User addUser(String userName,String name,String password,boolean enabled){
		BCryptPasswordEncoder pe=new BCryptPasswordEncoder();
		return userRepository.save(new com.udemy.backend.entity.User(userName,name,pe.encode(password),enabled));
	}

}
