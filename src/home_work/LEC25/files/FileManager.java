package src.home_work.LEC25.files;
import java.io.*;

class FileManager {
    private final String filename;

    public FileManager(String filename) {
        this.filename = filename;
    }

    public void saveDataToFile(String content) {
        try (FileWriter writer = new FileWriter(filename)) {
            writer.write(content);
            System.out.println("String saved successfully.");
        } catch (IOException e) {
            System.err.println("An error occurred while saving: " + e.getMessage());
        }
    }

    public String readDataFromFile() {
        StringBuilder content = new StringBuilder();
        try (BufferedReader reader = new BufferedReader(new FileReader(filename))) {
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