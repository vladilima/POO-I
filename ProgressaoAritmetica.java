public class ProgressaoAritmetica extends Progressao {

    private static int RAZAO;

    public ProgressaoAritmetica(int primeiroNumero, int RAZAO) {
        this.atual = primeiroNumero;
        this.RAZAO = RAZAO;
    }

    public int proximo() {
        atual = atual + RAZAO;
        return atual;
    }
}
