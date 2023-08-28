package src.home_work.LEC25.files;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;

class FileManager {
    private final String path;

    public FileManager(String path) {
        this.path = path;
    }

    public void saveDataToFile(String content) {
        try {
            Files.writeString(Path.of(path), content);
            System.out.println("String saved successfully.");
        } catch (IOException e) {
            System.err.println("An error occurred while saving: " + e.getMessage());
        }
    }

    public String readDataFromFile() {
        List<String> content = null;
        try {
            content = Files.readAllLines(Path.of(path));
        } catch (IOException e) {
            System.err.println("An error occurred while reading file: " + e.getMessage());
        }
        assert content != null;
        return content.toString();
    }
}