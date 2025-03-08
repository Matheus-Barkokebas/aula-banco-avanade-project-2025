package me.dio.avanade.domain.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import me.dio.avanade.domain.model.User;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {

	boolean existsByAccountNumber(String accountNumber);
}
