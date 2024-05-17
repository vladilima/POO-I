public class Main {
    public static void main(String[] args) {
        ProgressaoAritmetica progArit = new ProgressaoAritmetica(0, 4);
        ProgressaoGeometrica progGeo = new ProgressaoGeometrica(2, 2);
        ProgressaoFibonacci progFibo = new ProgressaoFibonacci();

        RetanguloDuplo retDup = new RetanguloDuplo(5,5);
        RetanguloColorido retCor = new RetanguloColorido(5, 5, "\u001B[34m");

        retCor.desenhar();
    }
}