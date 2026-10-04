package lab2;

public class RegistroTempoOnline {
    private String nomeDisciplina;
    private int tempoInvestidoOnline;
    private int tempoOnlineEsperado = 120;

    public RegistroTempoOnline(String nomeDisciplinanovo) {
        nomeDisciplina = nomeDisciplinanovo;
    }

    public RegistroTempoOnline(String nomeDisciplinaNovo, int tempoOnlineEsperadoNovo) {
        nomeDisciplina = nomeDisciplinaNovo;
        tempoOnlineEsperado = tempoOnlineEsperadoNovo;

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
    public String toString() {
        return nomeDisciplina + " " + tempoInvestidoOnline + "/" + tempoOnlineEsperado;
    }

}
