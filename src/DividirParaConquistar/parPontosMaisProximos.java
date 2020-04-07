/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DividirParaConquistar;

/**
 * O par mais proximos entre pontos em um plano e feito de forma recursiva
 * recortando os planos em varios pedacos e calculando de forma individual
 * cada par de pontos pertencente ao menor plano possível.
 * @author Allen Hichard e Leonardo de Melo
 */
public class parPontosMaisProximos {
    //pontos em coordenadas XY 
    private int[] pontosX = {0, 0, 1, 2, 2, 3, 4, 4, 5, 5};
    private int[] pontosY = {0, 2, 5, 3, 4, 1, 0, 5, 4, 5};
    String nome;
    private double menor = Double.MAX_VALUE;
    public parPontosMaisProximos() {
        parProx(pontosX, pontosY, 10);
        System.out.println(nome);
        System.out.println(menor);
    }
    public double parProx(int[] X, int[] Y, int n) {
        if (n == 1) {
            return menor;
        }
        int m = n / 2;
        int[] Xe = new int[m];
        int[] Xd = new int[(n - m)];
        int[] Ye = new int[m];
        int[] Yd = new int[(n - m)];
        System.arraycopy(X, 0, Xe, 0, m);
        System.arraycopy(X, m, Xd, 0, n - m);
        System.arraycopy(Y, 0, Ye, 0, m);
        System.arraycopy(Y, m, Yd, 0, n - m);
        parProx(Xe, Ye, (m));
        parProx(Xd, Yd, (n - m));
        double aux = Math.pow(X[0] - X[1], 2) + Math.pow(Y[0] - Y[1], 2);
        double total = Math.sqrt(aux);
        if (total < menor) {
            menor = total;
            nome = "(" + X[0] + "," + Y[0] + ")" + "(" + X[1] + "," + Y[1] + ")";
        }
        return menor;
    }
    public static void main(String[] args) {
        System.out.println("Dividir Para Conquistar");
        new parPontosMaisProximos();
    }
}
