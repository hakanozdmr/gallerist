package com.hakanozdemir.service;

import com.hakanozdemir.dto.AuthRequest;
import com.hakanozdemir.dto.DtoUser;

public interface AuthenticationService {
    public DtoUser register(AuthRequest authRequest);
}
