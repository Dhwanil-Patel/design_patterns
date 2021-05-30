package com.world_of_anonymous.design_patterns.solid_principle.single_responsibility_principle.wrong;

import com.opencsv.exceptions.CsvException;
import com.world_of_anonymous.design_patterns.solid_principle.single_responsibility_principle.User;

import java.io.IOException;
import java.net.URISyntaxException;
import java.nio.file.*;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;

public class FileOperation {

    private static List<String> readData(String path) throws IOException, URISyntaxException, CsvException {
        Path filePath = Paths.get(path);
        List<String> lines = Files.readAllLines(filePath);
        return lines;
    }

    private static List<User> convertStringToObject(List<String> fileData) throws IOException {
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

    private static List<User> addUser(List<User> users) throws IOException {
        Optional<User> highestId = users.stream().max(Comparator.comparing(User::getUserId));
        if (!highestId.isPresent()) {
            throw new RuntimeException("Id not found...!!!");
        }
        User user = new User(highestId.get().getUserId() + 1, "Sanjay", "HR");
        users.add(user);
        return users;
    }

    private static void updateFile(String path, List<User> users) throws IOException {
        Path filePath = Paths.get(path);
        StringBuilder sb = new StringBuilder();
        String delimiter = ";";
        for (User user : users) {
            sb.append(user.getUserId().toString()).append(delimiter).append(user.getName()).append(delimiter).append(user.getDepartment()).append(delimiter).append("\n");
        }
        sb.toString();
        Files.writeString(filePath, sb);
//        URI uri = FileOperation.class.getClassLoader().getResource(path).toURI();
//        Path filePath = Paths.get(uri);
//        String str = user.getUserId() + ";" + user.getName() + ";" + user.getDepartment() + ";";
//        ByteArrayInputStream strInputStream = new ByteArrayInputStream(str.getBytes(StandardCharsets.UTF_8));
//        Files.copy(strInputStream, filePath, StandardCopyOption.COPY_ATTRIBUTES);
//        Files.writeString(filePath, new StringBuilder(str));
//        Files.write(filePath, SerializationUtils.serialize(user));
    }

    public static void main(String[] args) throws IOException, URISyntaxException, CsvException {
        String path = "static/user_data.csv";
        List<String> fileData = readData(path);
        List<User> users = convertStringToObject(fileData);
        List<User> user = addUser(users);
        updateFile(path, user);
    }
}
