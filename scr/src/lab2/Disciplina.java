package lab2;

import java.util.Arrays;

public class Disciplina {
    private String nomeDisciplina;
    private int horas;
    private double[] notas;
    private double valorMedia;
    private static final int QNT_NOTAS = 4;
    private static final double MEDIA = 7.0;

    public Disciplina(String nomeDisciplinaNovo) {
        nomeDisciplina = nomeDisciplinaNovo;
    }

    public void cadastraHoras(int horas) {
        this.horas = horas;
    }

    public void cadastraNota(int nota, double valorNota) {
        this.notas[nota] = valorNota;
    }

    public double media(double[] notas) {
        double soma = Arrays.stream(notas).sum();
        return soma / QNT_NOTAS;
    }

    public boolean aprovado() {
        valorMedia = media(this.notas);
        if (valorMedia >= MEDIA) {
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
        return nomeDisciplina + " " + valorMedia + " " + formaArray(notas);
    }
}

