package com.deportivosshop.controller;

import com.deportivosshop.dto.LoginRequestDto;
import com.deportivosshop.dto.LoginResponseDto;
import com.deportivosshop.dto.UserResponseDto;
import com.deportivosshop.model.User;
import com.deportivosshop.service.AuthService;
import com.deportivosshop.utils.JwtUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/users")
public class AuthController {

    @Autowired
    private AuthService authService;

    @Autowired
    private JwtUtil jwtUtil;

    @PostMapping("/login")
    public ResponseEntity<LoginResponseDto> login(@RequestBody LoginRequestDto dto) {
        User user = authService.login(dto);
        String token = jwtUtil.generateToken(user.getEmail());
        return ResponseEntity.ok()
                .header("Authorization", "Bearer " + token)
                .body(new LoginResponseDto(UserResponseDto.from(user)));
    }
}
