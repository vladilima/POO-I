import br.univille.log.Level;
import br.univille.log.LoggerFactory;

public class Main {
    public void main(String[] args) {
        LoggerFactory.onConsole().log(Level.DEBUG, "AAA");
    }
}