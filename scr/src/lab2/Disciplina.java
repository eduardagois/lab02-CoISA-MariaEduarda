package lab2;

public class Disciplina {
    private String nomeDisciplina;
    private int horas;
    private double[] arrayNotas;
    private static final int QNT_NOTAS = 4;
    private static final double MEDIA = 7.0;


    public Disciplina(String nomeDisciplina) {
        this.nomeDisciplina = nomeDisciplina;
        this.arrayNotas = new double[QNT_NOTAS];

    }

    public void cadastraHoras(int horas) {
        this.horas = horas;
    }

    public void cadastraNota(int nota, double valorNota) {
        this.arrayNotas[nota-1] = valorNota;
    }

    public double media(double[] notas) {
        double soma = 0;
        for (int i = 0; i < this.QNT_NOTAS; i++) {
            soma += notas[i];
        }
        return soma / QNT_NOTAS;
    }


    public boolean aprovado() {
        double mediaValor = media(this.arrayNotas);
        if (mediaValor >= MEDIA) {
            return true;
        }
        return false;
    }

    private String formaArray(double[] notas) {
        String impressao = "[";
        for (int i = 0; i < QNT_NOTAS; i++) {
            impressao += notas[i];
            if (i != 3) {
                impressao += " ,";

            }
        }
        impressao += "]";
        return impressao;
    }

    public String toString() {
        return nomeDisciplina + " " + media(this.arrayNotas) + " " + formaArray(arrayNotas);
    }
}

