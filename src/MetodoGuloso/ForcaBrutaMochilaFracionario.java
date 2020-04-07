/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MetodoGuloso;

/**
 * Combinando Fatorialmente todas as combinações de produtos dentro da mochila
 * levando em consideração o melhor lucro.
 * @author allen
 */
public class ForcaBrutaMochilaFracionario {
    private int[] valor = {120, 60, 100};
    private int[] peso = {30, 10, 20};
    private int[] valorPeso = {4, 6, 5};
    private int capacidadeMochila = 50;
    private int carregando = 0;
    private int melhorCombinacao;
    private int melhorValor;
    private int melhorPeso;
    private int valorAtual;
    public void fatorial(int inicio, int fim, int opcao) {
        while (carregando < capacidadeMochila) {
            if (peso[inicio] <= (capacidadeMochila - carregando)) {
                carregando = carregando + peso[inicio];
                valorAtual += valor[inicio];
            } else {
                valorAtual += (capacidadeMochila - carregando) * (double) valorPeso[inicio];
                carregando = carregando + (capacidadeMochila - carregando);
            }
            if (opcao == 1) {
                inicio++;
                if (inicio == 3) {
                    inicio = 0; // para retornar ao inicio
                } else if (inicio == fim) {

                    break;
                }
            } else {
                inicio--;
                if (inicio == -1) {
                    inicio = 2; // para retornar ao inicio
                } else if (inicio == fim) {

                    break;
                }
            }
        }
        System.out.println(valorAtual + " - Reais");
        System.out.println(carregando + " - Peso Total\n");
        if (valorAtual > melhorValor) {
            melhorValor = valorAtual;
            melhorPeso = carregando;
        }
        carregando = 0;
        valorAtual = 0;
    }
    public void Mochila() {
        int i = 0;
        int h = 2;
        while (carregando < capacidadeMochila && i < 3) {
            int j = i;
            int a = h;
            System.out.println("Opçoes tipo A\n");
            fatorial(j, i, 1);
            System.out.println("Opçoes tipo B\n");
            fatorial(h, a, 0);
            i++;
            h--;
        }
        System.out.println("Melhor Opcao");
        System.out.println(melhorValor + " - Reais");
        System.out.println(melhorPeso + " - Peso Total");
    }
    public static void main(String[] args) {
        new ForcaBrutaMochilaFracionario().Mochila();
    }
}
