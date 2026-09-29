package lab2;

public class RegistroTempoOnline {
    private String nomeDisciplina;
    private int tempoInvestidoOnline;
    private int tempoOnlineEsperado;

    public RegistroTempoOnline(String nomeDisciplina) {
        nomeDisciplina = nomeDisciplina;
    }
    public RegistroTempoOnline(String nomeDisciplina, int tempoOnlineEsperado) {
        nomeDisciplina = nomeDisciplina;
        tempoOnlineEsperado = tempoOnlineEsperado;
    }
    public void adicionaTempoOnline(int tempo) {
        tempoInvestidoOnline += tempo;
    }
    public boolean atingiuMetaTempoOnline() {
        if (tempoInvestidoOnline >= tempoOnlineEsperado) {
            return true;
        } else {
            return false;
        }
    }

}
