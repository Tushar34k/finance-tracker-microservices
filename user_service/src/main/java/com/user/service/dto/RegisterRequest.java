package com.user.service.dto;

import com.user.service.enums.Role;
import lombok.Data;

@Data
public class RegisterRequest {
    String userName;
    String email;
    String password;
    Role role;
}
