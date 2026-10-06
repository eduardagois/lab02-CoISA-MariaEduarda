package lab2;

/** Representação da rotina de Descanso de um aluno, o que o auxilia a acompanhar sua própria rotina de descanso
 *
 */
public class Descanso {
    private int horasDeDescanso;
    private int numeroDeSemanas;

    public void defineHorasDescanso(int valor) {
        this.horasDeDescanso = valor;
    }

    public void defineNumeroSemanas(int valor) {
        this.numeroDeSemanas = valor;
    }
    public String getStatusGeral() {
        if (numeroDeSemanas > 0 && horasDeDescanso / numeroDeSemanas >= 26) {
            return "descansado";
        } else {
            return "cansado";
        }

    }
}
