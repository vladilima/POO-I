public class ProgressaoFibonacci extends Progressao {

    private int anterior;

    public ProgressaoFibonacci() {
        this.anterior = 1;
        this.atual = 1;
    }

    public int proximo() {
        int i = anterior;
        anterior = atual;
        atual = atual + i;

        return atual;
    }

}
