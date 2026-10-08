package lab2;

public class Resumo {
    /** Representação de um resumo qualquer que tem
     * um tema e um conteúdo associado.
     */
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
    public String toString() {
        return tema + ": " + conteudo;
    }
}

