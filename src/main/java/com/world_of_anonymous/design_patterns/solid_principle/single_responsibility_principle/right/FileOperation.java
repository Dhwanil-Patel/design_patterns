package com.world_of_anonymous.design_patterns.solid_principle.single_responsibility_principle.right;

import com.opencsv.exceptions.CsvException;
import com.world_of_anonymous.design_patterns.solid_principle.single_responsibility_principle.User;

import java.io.IOException;
import java.net.URISyntaxException;
import java.util.List;

public class FileOperation {
    public static void main(String[] args) throws CsvException, IOException, URISyntaxException {
        String path = "static/user_data.csv";
        List<String> fileData = FileProcessingService.readData(path);
        List<User> users = ObjectProcessingService.convertStringToObject(fileData);
        List<User> user = UserService.addUser(users);
        FileProcessingService.updateFile(path, user);
    }
}
