package lab2;

import java.util.Arrays;

/** Representação de uma disciplina para fins de
 * controle de notas e aprovação do aluno.
 */
public class Disciplina {
    // Nome da disciplina.
    private String nomeDisciplina;
    // Armazena a quantidade de horas dedicadas à disciplina.
    private int horas;
    // Array de notas que armazena as notas do aluno.
    private double[] arrayNotas;
    //Array que contém os pesos de cada nota do aluno.
    private int[] pesosNotas;
    // Constante responsável por determinar o tamanho do array.
    private static final int QNT_NOTAS = 4;
    /** Constante que representa o valor mínimo
     * para aprovação do aluno em alguma disciplina.
     */
    private static final double MEDIA = 7.0;

    /** Constrói a disciplina através de seu nome. Além
     * de definir o tamanho do Array de notas.
     * @param nomeDisciplina
     */
    public Disciplina(String nomeDisciplina) {
        this.nomeDisciplina = nomeDisciplina;
        this.arrayNotas = new double[QNT_NOTAS];

    }
    public Disciplina(String nomeDisciplina, int numDeNotas, int[] pesosNotas) {
        this.nomeDisciplina = nomeDisciplina;
        this.arrayNotas = new double[numDeNotas];
        this.pesosNotas = pesosNotas;
    }

    /** Cadastra as horas dedicadas à disciplina.
     *
     * @param horas
     */
    public void cadastraHoras(int horas) {
        this.horas = horas;
    }

    /** Cadastra as notas do aluno com base no seu
     * valor e na posição.
     * @param nota
     * @param valorNota
     */
    public void cadastraNota(int nota, double valorNota) {
        this.arrayNotas[nota-1] = valorNota;
    }

    /** Retorna o cálculo da média do aluno.
     * @param notas
     * @return Double que representa a média do aluno
     * sendo ponderada ou simples.
     */
    public double media(double[] notas) {
        double soma = 0;
        if (pesosNotas == null) {
            for (int i = 0; i < notas.length; i++) {
                soma += notas[i];
            }
            return soma / QNT_NOTAS;
        } else {
            for (int i = 0; i < notas.length; i++) {
                soma += (notas[i] * pesosNotas[i]);
            }
            return soma / Arrays.stream(pesosNotas).sum();
        }
    }

    /** Verifica se, com base na média, aluno foi
     * aprovado na disciplina.
     * @return valor booleano para representar
     * se o aluno foi aprovado na disciplina, ou não.
     */
    public boolean aprovado() {
        double mediaValor = media(this.arrayNotas);
        if (mediaValor >= MEDIA) {
            return true;
        }
        return false;
    }

    /** Representação textual de uma disciplina com base
     * no seu nome, média e notas.
     * @return String que representa a classe disciplina.
     */
    public String toString() {
        return nomeDisciplina + " " + media(this.arrayNotas) + " " + Arrays.toString(arrayNotas);
    }
}

