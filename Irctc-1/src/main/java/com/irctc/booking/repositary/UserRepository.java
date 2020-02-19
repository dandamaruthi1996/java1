package com.irctc.booking.repositary;

import org.springframework.data.jpa.repository.JpaRepository;

import com.irctc.booking.model.User;

public interface UserRepository extends JpaRepository<User, Long>{

}
