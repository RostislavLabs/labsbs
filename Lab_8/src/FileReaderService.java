import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class FileReaderService {
    public String readFile(File file) throws IOException {
        if (!FileHelper.fileExists(file)) {
            throw new IOException("Файл не знайдено: " + file.getPath());
        }

        StringBuilder result = new StringBuilder();

        try (FileReader reader = new FileReader(file)) {
            char[] buffer = new char[256];
            int symbolsCount;

            while ((symbolsCount = reader.read(buffer)) != -1) {
                result.append(buffer, 0, symbolsCount);
            }
        }

        return result.toString();
    }
}
