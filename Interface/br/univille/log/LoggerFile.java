package br.univille.log;

public class LoggerFile implements Logger {
    @Override
    public void log(Level level, String message) {
        System.out.println("FILE");
    }
}
