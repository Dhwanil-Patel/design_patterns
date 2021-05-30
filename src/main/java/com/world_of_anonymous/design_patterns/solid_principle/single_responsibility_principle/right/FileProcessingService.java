package com.world_of_anonymous.design_patterns.solid_principle.single_responsibility_principle.right;

import com.opencsv.exceptions.CsvException;
import com.world_of_anonymous.design_patterns.solid_principle.single_responsibility_principle.User;

import java.io.IOException;
import java.net.URISyntaxException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

class FileProcessingService {

    public static List<String> readData(String path) throws IOException, URISyntaxException, CsvException {
        Path filePath = Paths.get(path);
        List<String> lines = Files.readAllLines(filePath);
        return lines;
    }

    public static void updateFile(String path, List<User> users) throws IOException {
        Path filePath = Paths.get(path);
        StringBuilder sb = new StringBuilder();
        String delimiter = ";";
        for (User user : users) {
            sb.append(user.getUserId().toString()).append(delimiter).append(user.getName()).append(delimiter).append(user.getDepartment()).append(delimiter).append("\n");
        }
        sb.toString();
        Files.writeString(filePath, sb);
    }
}
