package lab2;

/** Representação para armazenamento de resumos
 * sobre temas diversos.
 */
public class RegistroResumos {
    //Array de resumos que guarda os objetos da classe resumo.
    private Resumo[] resumos;
    // Armazena a posição do próximo resumo a ser colocado no array.
    private int indice;
    // Conta a quantidade de resumos já armazenados.
    private int cont;

    /** Representação de um resumo qualquer que tem
     * um tema e um conteúdo associado.
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
    }

    /** Constrói o Array de resumos determinando
     * seu tamanho através de um valor inteiro.
     * @param numeroDeResumos
     */
    public RegistroResumos(int numeroDeResumos) {
        this.resumos = new Resumo[numeroDeResumos];
    }

    /** Metodo que adiciona um resumo no Array de resumos,
     * mesmo se a quantidade já de resumos for igual ao tamanho
     * do array, visto que nesse caso, o índice vira 0.
     * @param tema
     * @param conteudo
     */
    public void adiciona(String tema, String conteudo) {
        Resumo resumoObj = new Resumo(tema, conteudo);
        this.resumos[indice] = resumoObj;
        if (indice < 100) {
            indice += 1;
            cont += 1;
        } else {
            indice = 0;
        }
    }

    /** Metodo que retorna uma representação textual para cada
     * resumo armazenado em um novo array de Strings.
     * @return Array de Strings, onde cada elemento representa um resumo.
     */
    public String[] pegaResumos() {
        String[] arrayResumos = new String[resumos.length];
        for (int i = 0; i < this.cont; i++) {
            arrayResumos[i] = this.resumos[i].tema + ": " + this.resumos[i].conteudo;
        }
        return arrayResumos;
    }

    /** Conta quantos resumos já foram adicionados
     * até o momento.
     * @return Inteiro que representa a quantidade de resumos.
     */
    public int conta() {
        return this.cont;
    }

    /** Imprime os resumos cadastrados.
     *
     * @return Uma String montada que mostra cada tema de resumo armazenado.
     * */
    public String imprimeResumos() {
        System.out.println("- " + this.cont + " resumo(s) cadastrado(s)");
        String resumosImpressos = "";
        for (int i = 0; i < this.cont; i++) {
            if (i % 2 == 0) {
                resumosImpressos += this.resumos[i].tema + " ";
            } else {
                resumosImpressos += "| " + this.resumos[i].tema + " ";
            }
        }
        return resumosImpressos;
    }

    /** Verifica se um determinado tema já existe no array de resumos.
     *
     * @param tema
     * @return Booleano que mostra se o resumo já existe no array ou não.
     */
    public boolean temResumo(String tema) {
        for (int i = 0; i < this.cont; i++) {
            if (tema.equals(this.resumos[i].tema)) {
                return true;
            }
        }
        return false;
    }
}