package com.hakanozdemir.service.impl;

import com.hakanozdemir.dto.AuthRequest;
import com.hakanozdemir.dto.DtoUser;
import com.hakanozdemir.exception.BaseException;
import com.hakanozdemir.exception.ErrorMessage;
import com.hakanozdemir.exception.MessageType;
import com.hakanozdemir.model.User;
import com.hakanozdemir.repository.UserRepository;
import com.hakanozdemir.service.AuthenticationService;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.Date;

@Service

public class AuthenticationServiceImpl  implements AuthenticationService {
    @Autowired
    private UserRepository userRepository;
    @Autowired
    private BCryptPasswordEncoder bCryptPasswordEncoder;

    private User createUser(AuthRequest authRequest) {
        User user = new User();
        user.setCreatedTime(new Date());
        user.setUsername(authRequest.getUsername());
        user.setPassword(bCryptPasswordEncoder.encode(authRequest.getPassword()));
        return user;
    }

    @Override
    public DtoUser register(AuthRequest authRequest) {
        DtoUser dtoUser = new DtoUser();
        User savedUser = userRepository.save(createUser(authRequest));
        BeanUtils.copyProperties(savedUser, dtoUser);
        return dtoUser;
    }

}
