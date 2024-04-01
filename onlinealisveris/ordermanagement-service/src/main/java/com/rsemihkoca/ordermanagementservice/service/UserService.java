package com.rsemihkoca.ordermanagementservice.service;

import com.rsemihkoca.userservicemain.model.User;
import com.rsemihkoca.userservicemain.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class UserService {

    private UserRepository userRepository;

    @Autowired
    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public User createUser(User user) {
        return userRepository.save(user);
    }


    public List<User> getAll() {
        return userRepository.getAll();
    }
}
