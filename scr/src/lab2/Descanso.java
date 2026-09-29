package lab2;

public class Descanso {
    public int horasDeDescanso;
    public int numeroDeSemanas;

    public void defineHorasDescanso(int valor) {
        horasDeDescanso = valor;
    }
    public void defineNumeroSemanas(int valor) {
        numeroDeSemanas = valor;
    }
    public String getStatusGeral() {
        if (horasDeDescanso / numeroDeSemanas >= 26) {
            return "descansado";
        } else {
            return "cansado";
        }

    }
}
