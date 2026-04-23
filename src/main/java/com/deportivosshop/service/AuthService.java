package com.deportivosshop.service;

import com.deportivosshop.dto.LoginRequestDto;
import com.deportivosshop.model.User;

public interface AuthService {
    User login(LoginRequestDto dto);
}
