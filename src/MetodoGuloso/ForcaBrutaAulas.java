/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MetodoGuloso;

/**
 * Selecao de atividade, testando todas as possibilidades de combinações de
 * aulas.
 * @author Allen Hichard e Leonardo de Melo
 */
public class ForcaBrutaAulas {
    private static int Gulosa(int[] inicio, int[] fim, int numeroDeAtividades) {
        int quantidade = 0;
        for (int i = 0; i < numeroDeAtividades; i++) {
            System.out.println("Aula " + (i + 1));
            int acaba = fim[i];
            quantidade = 1;
            for (int j = 0; j < numeroDeAtividades; j++) {
                if (inicio[j] > acaba) {
                    System.out.println("Aula " + (j + 1));
                    acaba = fim[j];
                    quantidade++;
                }
            }
            System.out.println("Quantidade");
            System.out.println(quantidade);
        }
        return quantidade;
    }
    public static void main(String[] args) {
        int[] inicio = {1, 3, 0, 5, 3, 5, 6, 8, 8, 2, 12};
        int[] fim = {4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14};
        int quantidadeDeAtividades = 11;
        int total = Gulosa(inicio, fim, quantidadeDeAtividades);
        System.out.println("Foram selecionadas " + total + " atividades");
    }
}
