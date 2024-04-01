package com.rsemihkoca.ordermanagementservice.repository;

import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class UserRepository {

    private final List<User> userList = new ArrayList<>();

    public User save(User user) {
        userList.add(user);
        return user;
    }

    public List<User> getAll() {
        return userList;
    }
}
