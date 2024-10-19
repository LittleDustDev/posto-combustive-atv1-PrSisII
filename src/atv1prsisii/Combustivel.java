package atv1prsisii;

public class Combustivel {
    private String tipo;
    private int limiteEstoque;
    private int qtdEstoque;

    // Define o limite do estoque como sendo o limite definido e a quantidade antes da reposição como 0
    public Combustivel(String tipo, int limiteEstoque) {
        this.tipo = tipo;
        this.limiteEstoque = limiteEstoque;
        this.qtdEstoque = 0;
    }

    // Repõe o estoque verificando o limite de estoque
    public int reporEstoque(int quantidade) {
        if (quantidade < 0) {
            return 0;
        }
        int espacoDisponivel = limiteEstoque - qtdEstoque;
        if (quantidade > espacoDisponivel) {
            qtdEstoque = limiteEstoque;
            return espacoDisponivel;
        } else {
            qtdEstoque += quantidade;
            return quantidade;
        }
    }

        // Abastece o veículo
    public int abastecerVeiculo(int quantidade) {
        if (quantidade < 0) {
            return 0;
        }
        if (quantidade > qtdEstoque) {
            int abastecido = qtdEstoque;
            qtdEstoque = 0;
            return abastecido;
        } else {
            qtdEstoque -= quantidade;
            return quantidade;
        }
    }

    // Mostra o estoque após abastecimento
    public int mostrarEstoque() {
        return qtdEstoque;
    }
}
