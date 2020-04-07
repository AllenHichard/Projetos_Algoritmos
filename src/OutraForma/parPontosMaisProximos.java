package OutraForma;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import DividirParaConquistar.*;
import com.sun.org.apache.xerces.internal.xs.datatypes.ObjectList;
import java.util.LinkedList;
import java.util.List;


/**
 *
 * @author allen
 */
public class parPontosMaisProximos {
 
   //pontos em coordenadas XY 
   private int[] pontosX = {0,0,1,2,2,3,4,4,5,5};
   private int[] pontosY = {0,2,5,3,4,1,0,5,3,5};
   String nome;
   
   private double menor = Double.MAX_VALUE; 
   
   public parPontosMaisProximos(){
       parProx(pontosX, pontosY, 10);
       System.out.println(nome);
       System.out.println(menor);
       
   }
   public int[] parProx(int[] X, int [] Y, int n){
   if(n==1){
       int []v = {X[0], Y[0]};
       System.out.println("Foi Coordenadas "+ X[0] +","+ Y[0]);
       return v;
   }
   int m = n/2;
   int[] Xe = new int[m];
   int[] Xd = new int[(n-m)];
   int[] Ye = new int[m];
   int[] Yd = new int[(n-m)];
   
   System.arraycopy(X, 0, Xe , 0, m);
   System.arraycopy(X, m, Xd , 0, n-m );
   System.arraycopy(Y, 0, Ye , 0, m);
   System.arraycopy(Y, m , Yd , 0, n-m );
   
   int []v1 =   parProx(Xe, Ye, (m));
   int []v2 =   parProx(Xd, Yd, (n-m));
   
   double aux = Math.pow(v1[0] - v2[0],2) + Math.pow(v1[1]-v2[1],2);   
   double total =  Math.sqrt(aux);
   if(total < menor){
       menor = total;
       nome = "("+ v1[0] + "," + v1[1] + ")" + "("+ v2[0] + "," + v2[1] + ")";
   }
   if(total < menor){
       menor = total;
       nome = "("+ v1[0] + "," + v1[1] + ")" + "("+ v2[0] + "," + v2[1] + ")";
   }
   
   int []v = {X[0], Y[0]};
   return v;
   }
   
   public static void main(String[] args) {
         new parPontosMaisProximos();
    }
}

/*
System.out.println("E");
   for(int i = 0; i < Xe.length; i++){
       System.out.print(Xe[i]+ ",");
   }
       System.out.println("");
       
      System.out.println("D");
   for(int i = 0; i < Xd.length; i++){
       System.out.print(Xd[i]+ ",");
   }
      System.out.println("");
*/