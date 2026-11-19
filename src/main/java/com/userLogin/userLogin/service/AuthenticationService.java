package com.userLogin.userLogin.service;

import com.userLogin.userLogin.security.model.AuthenticationRequest;
import com.userLogin.userLogin.security.model.AuthenticationResponse;
import org.springframework.security.core.Authentication;

public interface AuthenticationService {
    AuthenticationResponse createAuthenticationToken(AuthenticationRequest authenticationRequest) throws Exception;

}
