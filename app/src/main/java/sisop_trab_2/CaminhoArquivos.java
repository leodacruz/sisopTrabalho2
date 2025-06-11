package sisop_trab_2;

import java.io.File;

public class CaminhoArquivos {

    private static String caminhoPadrao() {
        String caminho = System.getProperty("user.dir");
        if (!caminho.contains("app")) {
            caminho += File.separator + "app";
        }
        caminho += File.separator + "src"
                + File.separator + "main"
                + File.separator + "resources";
        return caminho;
    }

    public static String caminhoArquivoEntrada() {
        return caminhoPadrao() + File.separator + "arquivo_entrada";
    }

    public static String caminhoArquivoEntrada(String nomeArquivo) {
        return caminhoPadrao() + File.separator + nomeArquivo ;
    }

    public static String caminhoArquivoSaida() {
        return caminhoPadrao() + File.separator + "saida.txt";
    }

}
