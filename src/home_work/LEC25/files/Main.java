package src.home_work.LEC25.files;

    // Створити класс з 2 функціями. Перша зберігає отриману строку у файл.
    // Друга - зчитує дані з файлу та повертає його користувачу

public class Main {
    public static void main(String[] args) {
        FileManager fileManager = new FileManager("src/home_work/LEC25/files/MyFiles/data.txt");

        // Write
        String dataToSave = "Save me in the file.";
        fileManager.saveDataToFile(dataToSave);

        // Read
        String dataRead = fileManager.readDataFromFile();
        System.out.println("Content read from the file:\n" + dataRead);
    }
}
