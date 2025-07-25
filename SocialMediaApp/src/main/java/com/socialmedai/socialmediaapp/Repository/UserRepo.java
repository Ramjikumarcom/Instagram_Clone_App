package com.socialmedai.socialmediaapp.Repository;

import com.socialmedai.socialmediaapp.Models.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UserRepo extends JpaRepository<User, Integer> {
    User findByEmail(String email);

    @Query("SELECT u FROM User u  WHERE u.firstName LIKE %:query% OR u.lastName LIKE %:query% or u.email like %:query%")
    List<User> SearchUser(@Param("query") String query);
    
    // Method to find users by first name or last name (case insensitive)
    List<User> findByFirstNameContainingIgnoreCaseOrLastNameContainingIgnoreCase(String firstName, String lastName);
}
