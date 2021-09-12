package com.havruyk.springsecurityc2.Services;

import com.havruyk.springsecurityc2.Entities.User;
import com.havruyk.springsecurityc2.Repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;

import java.util.Optional;

public class JPAUserDetailsService implements UserDetailsService {
    @Autowired
    private UserRepository userRepository;

    @Override
    public UserDetails loadUserByUsername(String userName) throws UsernameNotFoundException {
        Optional<User> user = userRepository.findUserByUsername(userName);
        User u = user.orElseThrow(() -> new UsernameNotFoundException("No user found by username!"));
        return new SecurityUser(u);
    }
}
