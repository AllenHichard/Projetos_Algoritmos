/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ProgramacaoDinamica;

/**
 * O atrivuto memoria, e a tabela utilizada para não haver recalculo
 * @author allen e leo
 */
public class PDFibonacci {
     private long[] memoria = new long[100];
     public long fibonacci(int elemento) {
        if(elemento < memoria.length && memoria[elemento]!=0){
            return memoria[elemento];    
        } 
        else if (elemento < 2) {
            return elemento;
        } else {  
            memoria[elemento] = fibonacci(elemento - 1) + fibonacci(elemento - 2);
            return memoria[elemento];     
        }
     }
    public static void main(String[] args) {   
        System.out.println("Fibonnaci - Programação Dinâmica");
        PDFibonacci F = new PDFibonacci();
        System.out.println(F.fibonacci(10));
        System.out.println(F.fibonacci(10));
        System.out.println(F.fibonacci(11));
        System.out.println(F.fibonacci(15));
    }
}
