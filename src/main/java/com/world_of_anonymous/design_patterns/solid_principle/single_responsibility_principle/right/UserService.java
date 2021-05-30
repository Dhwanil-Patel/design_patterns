package com.world_of_anonymous.design_patterns.solid_principle.single_responsibility_principle.right;

import com.world_of_anonymous.design_patterns.solid_principle.single_responsibility_principle.User;

import java.io.IOException;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;

public class UserService {
    public static List<User> addUser(List<User> users) throws IOException {
        Optional<User> highestId = users.stream().max(Comparator.comparing(User::getUserId));
        if (!highestId.isPresent()) {
            throw new RuntimeException("Id not found...!!!");
        }
        User user = new User(highestId.get().getUserId() + 1, "Sanjay", "HR");
        users.add(user);
        return users;
    }
}

