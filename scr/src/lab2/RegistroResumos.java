package lab2;

import java.util.Arrays;
import java.util.Locale;

/** Representação do armazenamento de resumos
 * sobre temas diversos.
 *
 * @author Maria Eduarda
 */
public class RegistroResumos {
    //Array de resumos que guarda os objetos da classe resumo.
    private Resumo[] resumos;
    // Armazena a posição do próximo resumo a ser colocado no array.
    private int indice;
    // Conta a quantidade de resumos já armazenados.
    private int cont;


    /**
     * Constrói o Array de resumos determinando
     * seu tamanho através de um valor inteiro.
     *
     * @param numeroDeResumos
     */
    public RegistroResumos(int numeroDeResumos) {
        this.resumos = new Resumo[numeroDeResumos];
    }

    /**
     * Metodo que adiciona um resumo no Array de resumos,
     * mesmo se a quantidade já de resumos for igual ao tamanho
     * do array, visto que nesse caso, o índice vira 0.
     *
     * @param tema
     * @param conteudo
     */
    public void adiciona(String tema, String conteudo) {
        Resumo resumoObj = new Resumo(tema, conteudo);
        if (!temResumo(resumoObj.getTema())) {
            if (indice < resumos.length) {
                resumos[indice] = resumoObj;
                indice += 1;
                if (cont < resumos.length) {
                    cont += 1;
                }
            } else {
                indice = 0;
                resumos[indice] = resumoObj;
            }
        }
    }

    /**
     * Metodo que retorna uma representação textual para cada
     * resumo armazenado em um novo array de Strings.
     *
     * @return Array de Strings, onde cada elemento representa um resumo.
     */
    public String[] pegaResumos() {
        String[] arrayResumos = new String[resumos.length];
        for (int i = 0; i < this.cont; i++) {
            arrayResumos[i] = resumos[i].toString();
        }
        return arrayResumos;
    }

    /**
     * Conta quantos resumos já foram adicionados
     * até o momento.
     *
     * @return Inteiro que representa a quantidade de resumos.
     */
    public int conta() {
        return this.cont;
    }

    /**
     * Imprime os resumos cadastrados.
     *
     * @return Uma String que mostra cada tema de resumo armazenado.
     *
     */
    public String imprimeResumos() {
        System.out.println("- " + cont + " resumo(s) cadastrado(s)");
        String resumosImpressos = "";
        for (int i = 0; i < cont; i++) {
            if (i == 0) {
                resumosImpressos += resumos[i].getTema() + " ";
            } else {
                resumosImpressos += "| " + resumos[i].getTema() + " ";
            }
        }
        return resumosImpressos;
    }

    /**
     * Verifica se um determinado tema já existe no array de resumos.
     *
     * @param tema
     * @return Booleano que mostra se o resumo já existe no array ou não.
     */
    public boolean temResumo(String tema) {
        for (int i = 0; i < cont; i++) {
            if (tema.equals(resumos[i].getTema())) {
                return true;
            }
        }
        return false;
    }

    /** Metodo que retorna os temas que contenham a
     * palavra chave de busca, utilizada como parâmetro, em seu conteúdo.
     *
     * @param chaveDeBusca
     * @return Array de Strings que representam o tema de cada resumo encontrado.
     */
    public String[] busca(String chaveDeBusca) {
        String[] arrayBuscas = new String[cont];
        int contaTemasBuscados = 0;
        for (int i = 0; i < cont; i++) {
            if (resumos[i].getConteudo().toLowerCase(Locale.ROOT).contains(chaveDeBusca.toLowerCase(Locale.ROOT))) {
                arrayBuscas[i] = resumos[i].getTema();
                contaTemasBuscados += 1;
            }
        }
        String[] arrayBuscasFinal = new String[contaTemasBuscados];
        for (int i = 0; i < arrayBuscasFinal.length; i++) {
            arrayBuscasFinal[i] = arrayBuscas[i];
        }
        Arrays.sort(arrayBuscasFinal);
        return arrayBuscasFinal;
    }
}