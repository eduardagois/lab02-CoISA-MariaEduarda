package lab2;

public class RegistroResumos {
    private String[] resumos;
    private int indice;
    private int cont;

    private class Resumo {
        private String tema;
        private String conteudo;

        public Resumo(String temaNovo, String conteudoNovo) {
            this.tema = temaNovo;
            this.conteudo = conteudoNovo;
        }

        public String getTema() {
            return this.tema;
        }

        public String toString() {
            return this.tema + ": " + this.conteudo + ".";
        }
    }

    public RegistroResumos(int numeroDeResumos) {
        this.resumos = new String[numeroDeResumos];
    }
    public void adiciona(String temaNovo, String conteudoNovo) {
        Resumo resumoObj = new Resumo(temaNovo, conteudoNovo);
        if (this.indice < this.resumos.length) {
            this.temas[this.indice] = resumoObj.tema;
            this.conteudos[this.indice] = resumoObj.conteudo;
            this.indice += 1;
            this.cont = indice;
        } else {
            this.cont = indice;
            indice = 0;
        }
    }
    public int conta() {
        return this.cont;
        }

    public String[] pegaResumos() {
        return this.resumos;
    }

    public boolean temResumo(String tema) {
        String[] resumos = pegaResumos();
        for (int i = 0; i < resumos.length; i++) {
            if (tema.equals(resumos[i])) {
                return true;
        } }
        return false;
            }
    }



