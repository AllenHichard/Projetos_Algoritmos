/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MetodoGuloso;

/**
 * Seleção de atividade, escolhendo como forma de análise espaços que desocupam
 * com o tempo, no caso de aulas seria as que terminam primeiro.
 * @author Allen Hichard e Leonardo de Melo
 */
public class Aulas {
    private static int Gulosa(int[] inicio, int[] fim, int numeroDeAtividades) {
        int ultimaSelecao = 0;
        int qtdSelecao = 0;
        if(numeroDeAtividades==0){
            return 0;
        }
        System.out.println("aula "+1+ " ");
        qtdSelecao++;
        for(int i=1; i<numeroDeAtividades; i++){ 
            if(inicio[i] >= fim[ultimaSelecao]){
                System.out.println("aula "+(i+1)+ " ");
                qtdSelecao++;
                ultimaSelecao = i;
            }
        }
        System.out.println("");
        return qtdSelecao;
    }
    public static void main(String[] args) {
        int[] inicio = {1,3,0,5,3,5,6,8,8,2,12};
        int[] fim = {4,5,6,7,8,9,10,11,12,13,14};
        int quantidadeDeAtividades = 11;      
        int total = Gulosa(inicio,fim,quantidadeDeAtividades);
        System.out.println("Foram selecionadas " + total + " atividades");
    }    
}



