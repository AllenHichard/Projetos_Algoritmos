/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MetodoGuloso;

/**
 * Analisando pelo valor pelo de cada produto.
 * @author allen
 */
public class MochilaFracionaria {

    private int[] valor = {60, 100, 120};
    private int[] peso = {10, 20, 30};
    private int[] valorPeso = {6, 5, 4};
    private int capacidadeMochila = 40;
    private int carregando = 0;
    private int valorTotal;

    public void Mochila() {
        int i = 0;
        while (carregando < capacidadeMochila && i < 3) {
            if (peso[i] <= (capacidadeMochila - carregando)) {
                carregando = carregando + peso[i];
                valorTotal += valor[i];
            } else {
                valorTotal += (capacidadeMochila - carregando) * valorPeso[i];
                carregando = carregando + (capacidadeMochila - carregando);
                valorTotal += (capacidadeMochila - carregando);
            }
            i++;
        }
        System.out.println(valorTotal + " - Reais");
        System.out.println(carregando + " - Peso Total");
    }

    public static void main(String[] args) {
        new MochilaFracionaria().Mochila();
    }
}
