package br.univille.log;

public class LoggerFactory {
    public static Logger onConsole(){
        Logger logger = new LoggerConsole();
        return logger;
    };

    public static Logger onFile(){
        Logger logger = new LoggerFile();
        return logger;
    };
}
