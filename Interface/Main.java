import br.univille.log.Level;
import br.univille.log.LoggerFactory;

public class Main {
    public static void main(String[] args) {
        LoggerFactory.onConsole().log(Level.DEBUG, "Debug");
        LoggerFactory.onConsole().log(Level.WARNING, "Aviso");
        LoggerFactory.onConsole().log(Level.ERROR, "Erro");

        LoggerFactory.onFile().log(Level.DEBUG, "Debug");
        LoggerFactory.onFile().log(Level.WARNING, "Aviso");
        LoggerFactory.onFile().log(Level.ERROR, "Erro");
    }
}