package com.deportivosshop.service.impl;

import com.deportivosshop.configuration.exception.UnauthorizedException;
import com.deportivosshop.dto.LoginRequestDto;
import com.deportivosshop.model.User;
import com.deportivosshop.repository.UserRepository;
import com.deportivosshop.service.AuthService;
import com.deportivosshop.utils.PasswordUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AuthServiceImpl implements AuthService {

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private PasswordUtil passwordUtil;

    @Override
    public User login(LoginRequestDto dto) {
        User user = userRepository.findByEmail(dto.getEmail())
                .orElseThrow(() -> new UnauthorizedException("Invalid credentials"));

        if (!passwordUtil.matches(dto.getPassword(), user.getPassword())) {
            throw new UnauthorizedException("Invalid credentials");
        }

        return user;
    }
}
