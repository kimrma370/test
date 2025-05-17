package com.example.service;

import com.example.ottplatform.entity.User;
import com.example.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class UserService {
    private final UserRepository userRepository;

    public void registerUser(String uid, String upw, String role) {
        User user = new User();
        user.setUid(uid);
        user.setUpw(upw);
        user.setRole(role);
        userRepository.save(user);
    }
}
