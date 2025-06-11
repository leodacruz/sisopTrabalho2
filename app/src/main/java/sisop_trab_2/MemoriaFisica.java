package sisop_trab_2;

import java.util.Arrays;

public class MemoriaFisica {
    public int[] molduras;

    public MemoriaFisica(int tamanho) {
        molduras = new int[tamanho];
        Arrays.fill(molduras, -1); // todas livres inicialmente
    }

    public int alocarPagina(int numeroPagina) {
        for (int i = 0; i < molduras.length; i++) {
            if (molduras[i] == -1) {
                molduras[i] = numeroPagina;
                return i;
            }
        }
        return -1; // sem espaço
    }

    public String estadoAtual() {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < molduras.length; i++) {
            sb.append("Moldura ").append(i).append(": ").append(molduras[i]).append("\n");
        }
        return sb.toString();
    }
}
