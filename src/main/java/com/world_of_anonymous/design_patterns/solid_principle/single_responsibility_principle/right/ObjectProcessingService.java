package com.world_of_anonymous.design_patterns.solid_principle.single_responsibility_principle.right;

import com.world_of_anonymous.design_patterns.solid_principle.single_responsibility_principle.User;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class ObjectProcessingService {

    public static List<User> convertStringToObject(List<String> fileData) throws IOException {
        List<User> users = new ArrayList<>();
        for (String str : fileData) {
            String[] userData = str.split(";");
            User user = new User();
            user.setUserId(Integer.parseInt(userData[0]));
            user.setName(userData[1]);
            user.setDepartment(userData[2]);
            users.add(user);
        }
        return users;
    }

}
