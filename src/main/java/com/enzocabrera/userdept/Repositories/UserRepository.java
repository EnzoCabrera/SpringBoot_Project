package com.enzocabrera.userdept.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.enzocabrera.userdept.entities.User;

public interface UserRepository extends JpaRepository<User, Long>{

	
}
