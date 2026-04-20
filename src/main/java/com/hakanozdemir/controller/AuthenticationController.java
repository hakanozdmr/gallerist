package com.hakanozdemir.controller;

import com.hakanozdemir.dto.AuthRequest;
import com.hakanozdemir.dto.DtoUser;
import com.hakanozdemir.service.AuthenticationService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.mvc.AbstractController;

@RestController
public class AuthenticationController extends BaseController {

    @Autowired
    private AuthenticationService authenticationService;

    @PostMapping("register")
    public RootEntity<DtoUser> register(@Valid @RequestBody AuthRequest request){
        DtoUser dtoUser = authenticationService.register(request);
        return success(dtoUser);
    }
}
