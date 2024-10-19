package atv1prsisii;

public class Atv1PrSisII {
    public static void main(String[] args) {
        int limiteEstoque = 10000;
        Combustivel gasolina = new Combustivel("Gasolina", limiteEstoque);
        int qtdAposReposicao = gasolina.reporEstoque(1000);
        System.out.println("Qtd Após Reposição " + qtdAposReposicao);
        int qtdRealmenteAbastecido1 = gasolina.abastecerVeiculo(51);
        System.out.println("Qtd Abastecida 1 " + qtdRealmenteAbastecido1);
        int qtdRealmenteAbastecido2 = gasolina.abastecerVeiculo(10);
        System.out.println("Qtd Abastecida 2 " + qtdRealmenteAbastecido2);
        System.out.println("Estoque de Gasolina " + gasolina.mostrarEstoque());
    }
}
