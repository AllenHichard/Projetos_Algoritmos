/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DividirParaConquistar;

/**
 * Esta classe efetua a soma dos n termos de um vetor de forma linear
 * @author allen
 */
public class ForBruSimaNtermos{ 
    private int[] vetor = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
    private int resultado = 0;
    public ForBruSimaNtermos() {
        System.out.println(parProx());
    }
    public int parProx() {
        for(int i = 0; i < vetor.length; i++){
            resultado += vetor[i];
        }
        return resultado;
    }
    public static void main(String[] args) {
        new SomaNtermos();
    }
}
