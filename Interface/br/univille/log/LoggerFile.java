package br.univille.log;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class LoggerFile implements Logger {
    @Override
    public void log(Level level, String message) {
        String filename = "log.txt";

        String timestamp = LocalDateTime.now().format(DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss"));
        String text = "[" + timestamp + "]: " + level + " - " + message + "\n";

        try {
            if (Files.exists(Paths.get(filename))) {
                Files.write(Paths.get(filename), text.getBytes(), StandardOpenOption.APPEND);
            }
            else {
                Files.write(Paths.get(filename), text.getBytes());
            }
        }
        catch (IOException e) {
            System.out.println("Erro ao salvar arquivo");
            e.printStackTrace();
        }
    }
}
