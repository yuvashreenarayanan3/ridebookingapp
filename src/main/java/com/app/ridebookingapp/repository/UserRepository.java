package com.app.ridebookingapp.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.app.ridebookingapp.model.User;

@Repository
public interface UserRepository extends JpaRepository<User, String>{
	User findByuserEmail(String userEmail);

}
