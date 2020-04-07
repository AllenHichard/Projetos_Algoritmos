/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DividirParaConquistar;

/**
 * Esta classe efetua a soma dos n termos de um vetor, mas para isso foi aplicado
 * o método de dividir e conquistar, onde de forma recursiva o problema é dividido
 * em subproblemas para otimizar o tempo de execução e resposta
 * @author allen
 */
public class SomaNtermos {
    private int[] vetor = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
    private int resultado = 0;
    public SomaNtermos() {
        System.out.println(parProx(vetor, 10));
    }
    public int parProx(int[] X, int n) {
        if (n == 1) {
            return X[0];
        }
        int m = n / 2;
        int[] Xe = new int[m];
        int[] Xd = new int[(n - m)];
        System.arraycopy(X, 0, Xe, 0, m);
        System.arraycopy(X, m, Xd, 0, n - m);
        int valor1 = parProx(Xe, (m));
        int valor2 = parProx(Xd, (n - m));
        
        return valor1 + valor2;
    }
    public static void main(String[] args) {
        new SomaNtermos();
    }
}
