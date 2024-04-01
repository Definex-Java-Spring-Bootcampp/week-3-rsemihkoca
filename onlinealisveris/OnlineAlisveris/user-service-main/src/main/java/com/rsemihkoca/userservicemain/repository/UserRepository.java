package com.rsemihkoca.userservicemain.repository;

import com.rsemihkoca.userservicemain.model.*;
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
