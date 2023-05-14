/* Nome do Aluno: Mateus Oliveira de Macedo
 * RA:12523122971
 * Nome do Programa:
        Escreva um programa que, dada a carga máxima de um
        elevador e a quantidade máxima de pessoas digitadas pelo
        usuário, leia o peso de cada pessoa, também digitada pelo
        usuário, que entra no elevador até que a carga máxima seja
        atingida ou o número máximo de pessoas seja atingido (utilize
        do /while).
 * Data:14/05/2023
 */

import java.util.Scanner;

public class Ex20 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite a carga máxima do elevador em kg: ");
        int cargaMaxima = scanner.nextInt();

        System.out.print("Digite a quantidade máxima de pessoas no elevador: ");
        int maxPessoas = scanner.nextInt();

        int pesoTotal = 0;
        int numPessoas = 0;

        do {
            System.out.print("Digite o peso da pessoa em kg: ");
            int pesoPessoa = scanner.nextInt();

            if (pesoTotal + pesoPessoa > cargaMaxima) {
                System.out.println("Carga máxima do elevador atingida. Não é possível adicionar mais pessoas.");
                break;
            }

            pesoTotal += pesoPessoa;
            numPessoas++;

        } while (numPessoas < maxPessoas);

        System.out.println("O elevador está com " + numPessoas + " pessoa(s) e um peso total de " + pesoTotal + " kg.");

        scanner.close();
    }
}
