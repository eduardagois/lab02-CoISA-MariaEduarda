package lab2;

/** Representação do tempo de registro online ideal da
 * quantidade de horas dedicadas por um aluno a uma
 * determinada disciplina. Por padrão, caso não seja definido
 * o tempo online esperado, o aluno deve dedicar 120 horas
 * online para uma disciplina de 60 horas de carga horária.
 */
public class RegistroTempoOnline {
    // Guarda o nome de uma disciplina.
    private String nomeDisciplina;
    // Armazena o tempo investido online de um aluno, em horas.
    private int tempoInvestidoOnline;
    // Armazena o tempo online esperado de um aluno para uma disciplina, em horas.
    private int tempoOnlineEsperado;

    /** Constrói o registro de tempo online com base no
     * nome da disciplina e no tempo online esperado padrão
     * @param nomeDisciplinanovo
     */
    public RegistroTempoOnline(String nomeDisciplinanovo) {
        this.nomeDisciplina = nomeDisciplinanovo;
        this.tempoOnlineEsperado = 120;
    }

    /** Constrói o registro de tempo online com base
     * no nome da disciplina e no tempo online esperado
     * que pode ser definido pelo aluno.
     * @param nomeDisciplinaNovo
     * @param tempoOnlineEsperadoNovo
     */
    public RegistroTempoOnline(String nomeDisciplinaNovo, int tempoOnlineEsperadoNovo) {
        this.nomeDisciplina = nomeDisciplinaNovo;
        this.tempoOnlineEsperado = tempoOnlineEsperadoNovo;

    }

    /** Adiciona tempo online na quantidade de horas já armazenada.
     *
     * @param tempo
     */
    public void adicionaTempoOnline(int tempo) {
        tempoInvestidoOnline += tempo;
    }

    /** Verifica se o aluno atingiu a meta de tempo online caso o
     * tempo investido seja maior ou igual ao tempo esperado.
     *
     * @return Um valor booleano que indica se o aluno atingiu a meta ou não.
     */
    public boolean atingiuMetaTempoOnline() {
        if (tempoInvestidoOnline >= tempoOnlineEsperado) {
            return true;
        } else {
            return false;
        }
    }

    /** Retorna a String que representa a disciplina com
     * a relação entre horas investidas e horas esperadas.
     *
     * @return A String que representa a relação tempo investido/esperado.
     */
    public String toString() {
        return nomeDisciplina + " " + tempoInvestidoOnline + "/" + tempoOnlineEsperado;
    }

}
