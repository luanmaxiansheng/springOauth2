package com.example.demo.config;

import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Component;

import java.util.Arrays;

@Component
public class CustomerUser implements UserDetailsService {
    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        return new User("xiong","$2a$10$2da4L5Gt7dsJXzWwxlggUO6VPnLYVXBl6qITwTdjLmSoaQo5aeEYW",
                Arrays.asList(new SimpleGrantedAuthority("ROLE_USER")));
    }
}