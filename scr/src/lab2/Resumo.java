package lab2;

/** Representação de um resumo qualquer que tem
 * um tema e um conteúdo associado.
 *
 * @author Maria Eduarda
 */
public class Resumo {
    // Atributo que guarda o tema do resumo.
    private String tema;
    // Atributo que guarda o conteúdo do resumo.
    private String conteudo;

    /** Constrói o resumo através de um tema
     * e um conteúdo associados.
     * @param tema
     * @param conteudo
     */
    public Resumo(String tema, String conteudo) {
        this.tema = tema;
        this.conteudo = conteudo;
    }

    public String getConteudo() {
        return this.conteudo;
    }

    public String getTema() {
        return this.tema;
    }

    /** Representação textual de um resumo com base no seu
     * tema e conteúdo.
     *
     * @return String
     */
    public String toString() {
        return tema + ": " + conteudo;
    }
}

