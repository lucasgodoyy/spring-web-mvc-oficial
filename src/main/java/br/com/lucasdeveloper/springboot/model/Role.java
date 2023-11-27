package br.com.lucasdeveloper.springboot.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import org.springframework.security.core.GrantedAuthority;

@Entity
public class Role implements GrantedAuthority {
	
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	
	private String nomeRole;
	
	@Override
	public String getAuthority() { // ROLE_ADMIN, ROLE_GERENTE ...		
		return nomeRole;
	}

	public String getRole() {
		return nomeRole;
	}

	public void setRole(String nomeRole) {
		this.nomeRole = nomeRole;
	}	
	
	public Long getId() {
		return id;
	}
	
	public void setId(Long id) {
		this.id = id;
	}

}
