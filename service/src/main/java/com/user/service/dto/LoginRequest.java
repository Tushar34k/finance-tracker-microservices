package com.user.service.dto;

import lombok.Data;

@Data
public class LoginRequest {
    String email;
    String password;
}
