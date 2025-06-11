package sisop_trab_2;

import java.util.Arrays;

public class TabelaDePaginas {
    public int[] tabela;

    public TabelaDePaginas(int tamanho) {
        tabela = new int[tamanho];
        Arrays.fill(tabela, -1); // inicializa com valores livres
    }

    public void mapear(int pagina, int moldura) {
        tabela[pagina] = moldura;
    }

    public int consultar(int pagina) {
        return tabela[pagina];
    }

    public String estadoAtual() {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < tabela.length; i++) {
            sb.append("Página ").append(i).append(": ").append(tabela[i]).append("\n");
        }
        return sb.toString();
    }
}

