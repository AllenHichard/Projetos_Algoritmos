/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ProgramacaoDinamica;

/**
 *
 * @author allen
 */
public class FBFibonacci {
    
 
     public long fibonacci(int n) {
        int atual = 0;     // atual
        int anterior = 0;   // anterior
        for (int i = 1; i <= n; i++) {
            if (i == 1) {
                atual = 1;
                anterior = 0;
            } else {
                atual += anterior;
                anterior = atual - anterior;
            }
        }
        return atual;
    }
 
    public static void main(String[] args) {
 
	System.out.println("Fibonnaci - Força Bruta");
        PDFibonacci F = new PDFibonacci();
        System.out.println(F.fibonacci(10));
        System.out.println(F.fibonacci(10));
        System.out.println(F.fibonacci(11));
        System.out.println(F.fibonacci(15));
        
 
    }
 
}
