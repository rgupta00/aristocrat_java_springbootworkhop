package com.bankapp.config;

import com.bankapp.repo.UserEntity;
import com.bankapp.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@Service
public class DetailService implements UserDetailsService {

    @Autowired
    private UserService userService;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        UserEntity userEntity=userService.findByUsername(username);
        if(userEntity==null){
            throw new UsernameNotFoundException("user not found");
        }
        //i need to convert userEntity to the user that is undersood by spring security
        //i will user userDetails and create a class
        return new SecUser(userEntity);
    }
}
