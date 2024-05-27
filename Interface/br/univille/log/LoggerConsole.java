package br.univille.log;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class LoggerConsole implements Logger {
    String color;
    @Override
    public void log(Level level, String message) {
        switch (level) {
            case DEBUG:
                color = "\u001B[32m";
                break;
            case WARNING:
                color = "\u001B[33m";
                break;
            case ERROR:
                color = "\u001B[31m";
                break;
        }
        String timestamp = LocalDateTime.now().format(DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss"));
        System.out.println(color + "[" + timestamp + "]: " + level + " - " + message + color);
    }
}
