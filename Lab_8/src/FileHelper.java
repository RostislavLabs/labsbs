import java.io.File;
import java.io.IOException;

public class FileHelper {
    private static final String FILES_DIRECTORY = "files";

    public static File getFile(String fileName) {
        String preparedName = prepareFileName(fileName);
        File file = new File(preparedName);

        if (file.isAbsolute()) {
            return file;
        }

        return new File(FILES_DIRECTORY, preparedName);
    }

    private static String prepareFileName(String fileName) {
        String trimmedName = fileName.trim();

        if (trimmedName.toLowerCase().endsWith(".txt")) {
            return trimmedName;
        }

        return trimmedName + ".txt";
    }

    public static void createFileIfNotExists(File file) throws IOException {
        File parentDirectory = file.getParentFile();

        if (parentDirectory != null && !parentDirectory.exists()) {
            parentDirectory.mkdirs();
        }

        if (!file.exists()) {
            boolean isCreated = file.createNewFile();

            if (isCreated) {
                System.out.println("Файл не існував, тому його створено: " + file.getPath());
            }
        } else {
            System.out.println("Файл уже існує: " + file.getPath());
        }
    }

    public static boolean fileExists(File file) {
        return file.exists() && file.isFile();
    }
}
