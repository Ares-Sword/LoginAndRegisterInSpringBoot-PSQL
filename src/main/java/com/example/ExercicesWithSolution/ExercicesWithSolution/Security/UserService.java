package com.example.ExercicesWithSolution.ExercicesWithSolution.Security;

import com.example.ExercicesWithSolution.ExercicesWithSolution.Repository.UserRepository;
import com.example.ExercicesWithSolution.ExercicesWithSolution.Repository.Users;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;



@Service
public class UserService implements UserDetailsService
{
    @Autowired
 UserRepository userRepository;

    @Override
    public UserDetails loadUserByUsername(String email) throws UsernameNotFoundException {
        Users users=userRepository.findByEmail(email);
        return new UserPrincipal(users);
    }



    }

