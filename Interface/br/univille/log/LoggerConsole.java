package br.univille.log;

public class LoggerConsole implements Logger {
    @Override
    public void log(Level level, String message) {
        System.out.println("CONSOLE");
    }
}
