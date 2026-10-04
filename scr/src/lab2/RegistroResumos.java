package lab2;

public class RegistroResumos {
    private String[] resumos;
    private int indice;

    private class Resumo {
        private String tema;
        private String conteudo;

        public Resumo(String temaNovo, String conteudoNovo) {
            this.tema = temaNovo;
            this.conteudo = conteudoNovo;
        }

        }

    public RegistroResumos(int numeroDeResumos) {
        this.resumos = new String[numeroDeResumos];
    }
    public void adiciona(String temaNovo, String conteudoNovo) {
        Resumo resumo = new Resumo(temaNovo, conteudoNovo);
        indice += 1;

    }
    public int contaResumos() {
        return this.indice;
    }
    public String[] pegaResumos() {

}
