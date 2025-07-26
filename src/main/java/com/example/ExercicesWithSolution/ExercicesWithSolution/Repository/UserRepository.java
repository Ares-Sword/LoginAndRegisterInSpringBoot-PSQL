package com.example.ExercicesWithSolution.ExercicesWithSolution.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;
@Repository
public interface UserRepository extends CrudRepository<Users,Long> {
    Users findByEmail(String email);

}
