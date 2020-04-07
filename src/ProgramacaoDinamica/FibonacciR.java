/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ProgramacaoDinamica;

/**
 * Força bruta recursiva Fibonacci
 * @author allen
 */
public class FibonacciR {
     public long fibonacci(int elemento) {
        if (elemento < 2) {
            return elemento;
        } else {  
            return fibonacci(elemento - 1) + fibonacci(elemento - 2);    
        }
    }
    public static void main(String[] args) {   
        System.out.println("Fibonnaci - Recursivo");
        PDFibonacci F = new PDFibonacci();
        System.out.println(F.fibonacci(10));
        System.out.println(F.fibonacci(10));
        System.out.println(F.fibonacci(11));
        System.out.println(F.fibonacci(15));
    }
}
