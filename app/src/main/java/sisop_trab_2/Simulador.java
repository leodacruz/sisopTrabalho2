package sisop_trab_2;

import java.io.*;
import java.util.*;

public class Simulador {
    private Config config;
    private MemoriaFisica memoria;
    private TabelaDePaginas tabela;

    public Simulador(Config config) {
        this.config = config;
        this.memoria = new MemoriaFisica(config.numMoldurasFisicas);
        this.tabela = new TabelaDePaginas(config.numPaginasVirtuais);
    }

    public void executar(String arquivoEntrada, String arquivoSaida) throws IOException {
        List<Integer> enderecos = lerEnderecos(arquivoEntrada);
        PrintWriter writer = new PrintWriter(new FileWriter(CaminhoArquivos.caminhoArquivoEntrada(arquivoSaida)));

        for (int endereco : enderecos) {
            EnderecoVirtual ev = new EnderecoVirtual(endereco, config);
            int moldura = tabela.consultar(ev.pagina);

            if (moldura == -1) {
                moldura = memoria.alocarPagina(ev.pagina);
                if (moldura == -1) {
                    writer.println("Memória física cheia. Encerrando.");
                    break;
                }
                tabela.mapear(ev.pagina, moldura);
            }

            int enderecoFisico = moldura * config.tamPagina + ev.offset;

            writer.printf("Endereço Virtual: %d | Segmento: %s | Página: %d | Offset: %d | Endereço Físico: %d\n",
                    endereco, ev.segmento, ev.pagina, ev.offset, enderecoFisico);
        }

        writer.println("\n=== Tabela de Páginas ===");
        writer.println(tabela.estadoAtual());

        writer.println("\n=== Memória Física ===");
        writer.println(memoria.estadoAtual());

        writer.close();
    }

    private List<Integer> lerEnderecos(String arquivo) throws IOException {
       // System.out.println("Lendo endereços do arquivo: " + arquivo);

        List<Integer> lista = new ArrayList<>();
        BufferedReader reader = new BufferedReader(new FileReader(CaminhoArquivos.caminhoArquivoEntrada(arquivo)));
        String linha;
        while ((linha = reader.readLine()) != null) {
            lista.add(Integer.parseInt(linha.trim()));
        }
        reader.close();
        // System.out.println("Endereços lidos: " + lista.size());
        return lista;

    }
}
