package br.edu.atitus.pooavancado.atitusound.repositories;

import java.util.Optional;
import java.util.UUID;

import org.springframework.stereotype.Repository;

import br.edu.atitus.pooavancado.atitusound.entities.UserEntity;

@Repository
public interface UserRepository extends GenericRepository<UserEntity> {

	public boolean existsByUsername(String username);
	
	public boolean existsByUsernameAndUuidNot(String username, UUID uuid);
	
	Optional<UserEntity> findByUsername(String username);
	
}