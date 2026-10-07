package lab2;

/** Representação da rotina de Descanso de um aluno, o que o auxilia a acompanhar sua própria rotina de descanso.
 *
 */
public class Descanso {
    // Atributo que armazena as horas de descanso de um aluno durante um período de n semanas.
    private int horasDeDescanso;
    // Atributo que diz respeito ao número de semanas do período em que foi computado as horas de descanso do aluno.
    private int numeroDeSemanas;

    /** Metodo sem retorno com função de definir o as horas de descanso do aluno.
     *
     * @param valor
     */
    public void defineHorasDescanso(int valor) {
        this.horasDeDescanso = valor;
    }

    /** Metodo sem retorno com função de definir o período de semanas que as horas foram computadas.
     *
     * @param valor
     */
    public void defineNumeroSemanas(int valor) {
        this.numeroDeSemanas = valor;
    }

    /** Retorna a String que representa o estado de descanso do aluno. Sendo calculada
     * pela divisão entre horas de descanso e numero de semanas, a qual deve ser maior
     * ou igual a 26 para representar um descanso suficiente.
     * @return o estado de descanso do aluno: "cansado" ou "descansado".
     */
    public String getStatusGeral() {
        if (numeroDeSemanas > 0 && horasDeDescanso / numeroDeSemanas >= 26) {
            return "descansado";
        } else {
            return "cansado";
        }

    }
}
