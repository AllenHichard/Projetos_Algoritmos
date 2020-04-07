/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DividirParaConquistar;

/**
 * Resolvendo calculando as distâncias entre todos os pontos do plano e selecionando
 * o menor
 * @author allen
 */
public class ForBruParPontosMaisProximos {
    //pontos em coordenadas XY 
    private int[] pontosX = {0, 0, 1, 2, 2, 3, 4, 4, 5, 5};
    private int[] pontosY = {0, 2, 5, 3, 4, 1, 0, 5, 4, 5};
    String nome;
    private double menor = Double.MAX_VALUE;
    public ForBruParPontosMaisProximos() {
        parProx();
        System.out.println(nome);
        System.out.println(menor);
    }
    public void parProx() {
        for (int i = 0; i < pontosX.length-1; i++) {
            for (int j = 0; j < pontosX.length; j++) {
                double aux = Math.pow(pontosX[i] - pontosX[j], 2) + Math.pow(pontosY[i] - pontosY[j], 2);
                double total = Math.sqrt(aux);
                if (total < menor && i!=j) {
                    menor = total;
                    nome = "(" + pontosX[i] + "," + pontosY[i] + ")" + "(" + pontosX[j] + "," + pontosY[j] + ")";
                }
            }
        }
    }
    public static void main(String[] args) {
        System.out.println("Força Bruta");
        new ForBruParPontosMaisProximos();
    }
}
