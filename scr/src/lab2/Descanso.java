package lab2;

public class Descanso {
    public int horasDeDescanso;
    public int numeroDeSemanas;

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
