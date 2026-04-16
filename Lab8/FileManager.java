import java.io.*;

public class FileManager {
    private String fileName;

    public FileManager(String fileName) {
        this.fileName = fileName;
    }

    public void createFileIfNotExists() {
        File file = new File(fileName);

        try {
            if (!file.exists()) {
                if (file.createNewFile()) {
                    System.out.println("Файл створено: " + fileName);
                }
            } else {
                System.out.println("Файл вже існує.");
            }
        } catch (IOException e) {
            System.out.println("Помилка створення файлу!");
        }
    }

    public void writeToFile(int[] numbers) {
        try (FileWriter writer = new FileWriter(fileName)) {
            for (int num : numbers) {
                writer.write(num + " ");
            }
            System.out.println("Запис у файл завершено.");
        } catch (IOException e) {
            System.out.println("Помилка запису!");
        }
    }

    public void readFromFile() {
        try (FileReader reader = new FileReader(fileName)) {
            int ch;
            while ((ch = reader.read()) != -1) {
                System.out.print((char) ch);
            }
            System.out.println("\nЧитання завершено.");
        } catch (IOException e) {
            System.out.println("Помилка читання!");
        }
    }
}