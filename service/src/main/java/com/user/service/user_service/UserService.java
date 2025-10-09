package com.user.service.user_service;

import com.user.service.dto.LoginRequest;
import com.user.service.dto.RegisterRequest;
import com.user.service.modal.User;
import com.user.service.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;


@Service
@RequiredArgsConstructor
public class UserService {

    private final UserRepository userRepository;
    private final BCryptPasswordEncoder passwordEncoder = new BCryptPasswordEncoder();


    public String register(RegisterRequest registerRequest)
    {
          if(userRepository.existsByEmail(registerRequest.getEmail()))
          {
              return "Email already registered!";
          }

          User user= new User();
          user.setEmail(registerRequest.getEmail());
          user.setUsername(registerRequest.getUserName());
          user.setPassword(registerRequest.getPassword());
          user.setRole(registerRequest.getRole());

          userRepository.save(user);
        return "User registered successfully!";
    }

    public String login(LoginRequest request) {
        User user = userRepository.findByEmail(request.getEmail())
                .orElse(null);

        if (user == null) {
            return "User not found!";
        }

        if (!passwordEncoder.matches(request.getPassword(), user.getPassword())) {
            return "Invalid credentials!";
        }

        return "Login successful!";
    }
    }


