public abstract class Progressao {
    int atual;

    public int proximo() {
        atual = atual + 1;
        return atual;
    }
}
