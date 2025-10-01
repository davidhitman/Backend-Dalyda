package com.example.backenddalyda.repositories;

import com.example.backenddalyda.entities.Users;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.Optional;
import java.util.UUID;

@Repository
// User repository that connects to the User table in the Database
public interface UserRepository extends JpaRepository<Users, UUID> {
    @Query("SELECT s FROM Users s WHERE s.email = :email")
    Optional<Users> findByEmail(@Param("email") String email);
}
