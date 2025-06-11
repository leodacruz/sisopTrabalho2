package sisop_trab_2;

public class EnderecoVirtual {
    public int endereco;
    public int pagina;
    public int offset;
    public Segmento segmento;

    public EnderecoVirtual(int endereco, Config config) {
        this.endereco = endereco;
        this.offset = endereco % config.tamPagina;
        this.pagina = endereco / config.tamPagina;
        this.segmento = calcularSegmento(endereco, config);
    }

    private Segmento calcularSegmento(int endereco, Config config) {
        int limiteText = config.tamText;
        int limiteData = limiteText + config.tamData;
        int limiteStack = limiteData + config.tamStack;
        int limiteBss = limiteStack + config.tamBss;

        if (endereco < limiteText) return Segmento.TEXT;
        else if (endereco < limiteData) return Segmento.DATA;
        else if (endereco < limiteStack) return Segmento.STACK;
        else if (endereco < limiteBss) return Segmento.BSS;
        else return Segmento.BSS; // Fora de limite vira BSS por segurança
    }
}
