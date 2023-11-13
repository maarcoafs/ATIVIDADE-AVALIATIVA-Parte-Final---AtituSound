package br.edu.atitus.pooavancado.atitusound.services;

import java.util.Optional;
import java.util.UUID;

import org.springframework.security.core.userdetails.UserDetailsService;

import br.edu.atitus.pooavancado.atitusound.entities.UserEntity;

public interface UserService extends GenericService<UserEntity>, UserDetailsService{
	
	boolean existsByUsername(String username);
	
	boolean existsByUsernameAndUuidNot(String username, UUID uuid);
	
	Optional<UserEntity> findByUsername(String username);	

}