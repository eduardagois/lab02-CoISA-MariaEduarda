package lab2;

import java.sql.Ref;

public class RegistroResumos {
    private Resumo[] resumos;
    private int indice;
    private int cont;

    public class Resumo {
        private String tema;
        private String conteudo;

        public Resumo(String tema, String conteudo) {
            this.tema = tema;
            this.conteudo = conteudo;
        }
    }

    public RegistroResumos(int numeroDeResumos) {
        this.resumos = new Resumo[numeroDeResumos];
    }

    public void adiciona(String tema, String conteudo) {
        Resumo resumoObj = new Resumo(tema, conteudo);
        this.resumos[indice] = resumoObj;
        if (indice < 100) {
            indice += 1;
            cont += 1;
        } else {
            indice = 0;
        }
    }

    public String[] pegaResumos() {
        String[] arrayResumos = new String[resumos.length];
        for (int i = 0; i < this.cont; i++) {
            arrayResumos[i] = this.resumos[i].tema + ": " + this.resumos[i].conteudo;
        }
        return arrayResumos;
    }

    public int conta() {
        return this.cont;
    }

    public String imprimeResumos() {
        System.out.println("- " + this.cont + " resumo(s) cadastrado(s)");
        String resumosImpressos = "";
        for (int i = 0; i < this.cont; i++) {
            if (i % 2 == 0) {
                resumosImpressos += this.resumos[i].tema + " ";
            } else {
                resumosImpressos += "| " + this.resumos[i].tema + " ";
            }
        }
        return resumosImpressos;
    }
    public boolean temResumo(String tema) {
        for (int i = 0; i < this.cont; i++) {
            if (tema.equals(this.resumos[i].tema)) {
                return true;
            }
        }
        return false;
    }
}