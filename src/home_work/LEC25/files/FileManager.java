package src.home_work.LEC25.files;

import java.io.IOException;
import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;

class FileManager {
    private final String filename;

    public FileManager(String filename) {
        this.filename = filename;
    }

    public void saveDataToFile(String content) {
        try (BufferedWriter writer = Files.newBufferedWriter(Path.of(filename))) {
            writer.write(content);
            System.out.println("String saved successfully.");
        } catch (IOException e) {
            System.err.println("An error occurred while saving: " + e.getMessage());
        }
    }

    public String readDataFromFile() {
        StringBuilder content = new StringBuilder();
        try (BufferedReader reader = Files.newBufferedReader(Path.of(filename))) {
            String line;
            while ((line = reader.readLine()) != null) {
                content.append(line).append("\n");
            }
        } catch (IOException e) {
            System.err.println("An error occurred while reading file: " + e.getMessage());
        }
        return content.toString();
    }
}