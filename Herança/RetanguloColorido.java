public class RetanguloColorido extends Retangulo {

    private String cor;

    public RetanguloColorido(int altura, int largura, String cor) {
        this.altura = altura;
        this.largura = largura;
        this.cor = cor;
    }

    public void desenhar() {
        String quadrado = "";
        for (int i = 0; i < altura; i++) {
            if (i == 0){
                String linha = "┌";
                for (int j = 0; j < largura; j++) {
                    linha += "──";
                }
                quadrado = quadrado + linha + "┐" + "\n";

            }
            else if (i == altura - 1) {
                String linha = "└";
                for (int j = 0; j < largura; j++) {
                    linha += "──";
                }
                quadrado = quadrado + linha + "┘";

            }
            else {
                String linha = "│";
                for (int j = 0; j < largura; j++) {
                    linha += "  ";
                }
                quadrado = quadrado + linha + "│" + "\n";
            }
        }

        System.out.println(cor + quadrado + cor);
    };

}
