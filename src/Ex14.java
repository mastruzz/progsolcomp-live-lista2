/* Nome do Aluno: Mateus Oliveira de Macedo
 * RA:12523122971
 * Nome do Programa:
        Faça um programa que preencha com zeros todas as posições
        de um vetor de tamanho 50
 * Data:14/05/2023
 */

public class Ex14 {
    public static void main(String[] args) {
        int[] vetor = new int[50];

        for (int i = 0; i < vetor.length; i++) {
            vetor[i] = 0;
        }

        System.out.println("Vetor preenchido com zeros:");
        for (int i = 0; i < vetor.length; i++) {
            System.out.println(vetor[i]);
        }
    }
}
