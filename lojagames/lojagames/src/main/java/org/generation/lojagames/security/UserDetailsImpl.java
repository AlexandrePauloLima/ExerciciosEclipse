package org.generation.lojagames.security;

import java.util.Collection;
import java.util.List;

import org.generation.lojagames.model.Usuario;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

public class UserDetailsImpl implements UserDetails {
	
	private static final long serialVersionUID = 1L;
	
	private String userName;
	private String password;
	private List<GrantedAuthority> authorities;

	public UserDetailsImpl(Usuario usuario) {
		this.userName = usuario.getUsuario();
		this.password = usuario .getSenha();
	}
	
	public UserDetailsImpl() {          }

	//Chamar override
	
}