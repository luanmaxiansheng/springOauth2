package com.example.demo.config;

import com.alibaba.druid.pool.DruidDataSource;
import com.example.demo.dao.UserXMapper;
import com.example.demo.domain.UserX;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.oauth2.provider.ClientDetailsService;
import org.springframework.security.oauth2.provider.client.ClientDetailsUserDetailsService;
import org.springframework.stereotype.Component;

import java.util.Arrays;

@Component
public class CustomerUser extends ClientDetailsUserDetailsService {

    public CustomerUser(ClientDetailsService clientDetailsService) {
        super(clientDetailsService);
    }

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        UserX userX = userXMapper.selectByUser(username);
        if(!(userX.getName().equals(username))){
            throw new UsernameNotFoundException("用户不存在");
        }
        return new User(username,new BCryptPasswordEncoder().encode(userX.getSecret()),
                Arrays.asList(new SimpleGrantedAuthority(userX.getAuthority())));
    }

    @Autowired
    private UserXMapper userXMapper;

    @ConfigurationProperties(prefix = "spring.datasource")
    @Bean
    public DruidDataSource druidDataSource(){
        return new DruidDataSource();
    }
}
