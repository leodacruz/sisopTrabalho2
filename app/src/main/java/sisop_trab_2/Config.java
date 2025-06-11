package sisop_trab_2;

public class Config {
    public int bitsEnderecoVirtual;
    public int bitsMemoriaFisica;
    public int bitsPagina;

    public int tamText;
    public int tamData;
    public int tamStack;
    public int tamBss;

    public int numPaginasVirtuais;
    public int numMoldurasFisicas;
    public int tamPagina;

    public Config(int bitsEnderecoVirtual, int bitsMemoriaFisica, int bitsPagina,
                  int tamText, int tamData, int tamStack) {

        if (bitsEnderecoVirtual >= bitsMemoriaFisica) {
            throw new IllegalArgumentException("O espaço de endereços virtuais deve ser menor que a memória física.");
        }

        this.bitsEnderecoVirtual = bitsEnderecoVirtual;
        this.bitsMemoriaFisica = bitsMemoriaFisica;
        this.bitsPagina = bitsPagina;

        this.tamPagina = (int) Math.pow(2, bitsPagina);

        this.tamText = tamText;
        this.tamData = tamData;
        this.tamStack = tamStack;
        this.tamBss = 3 * (tamText + tamData + tamStack); // conforme enunciado

        this.numPaginasVirtuais = (int) Math.pow(2, bitsEnderecoVirtual - bitsPagina);
        this.numMoldurasFisicas = (int) Math.pow(2, bitsMemoriaFisica - bitsPagina);
    }
}
