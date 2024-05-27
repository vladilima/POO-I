public class RetanguloDuplo extends Retangulo {

    public RetanguloDuplo(int altura, int largura) {
        this.altura = altura;
        this.largura = largura;
    }

    public void desenhar() {
        String quadrado = "";
        for (int i = 0; i < altura; i++) {
            if (i == 0){
                String linha = "╔";
                for (int j = 0; j < largura; j++) {
                    linha += "══";
                }
                quadrado = quadrado + linha + "╗" + "\n";

            }
            else if (i == altura - 1) {
                String linha = "╚";
                for (int j = 0; j < largura; j++) {
                    linha += "══";
                }
                quadrado = quadrado + linha + "╝";

            }
            else {
                String linha = "║";
                for (int j = 0; j < largura; j++) {
                    linha += "  ";
                }
                quadrado = quadrado + linha + "║" + "\n";
            }
        }

        System.out.println(quadrado);
    };

}
