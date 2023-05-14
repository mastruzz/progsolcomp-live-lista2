/* Nome do Aluno: Mateus Oliveira de Macedo
 * RA:12523122971
 * Nome do Programa:
        Escreva um programa que, dado um número positivo digitado
        pelo o usuário mostre a tabuada de todos os números de 1 até o
        número digitado. (utilize for)
 * Data:14/05/2023
 */

import java.util.Scanner;

public class Ex21 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um número positivo: ");
        int numero = scanner.nextInt();

        for (int i = 1; i <= numero; i++) {
            System.out.println("Tabuada do " + i + ":");

            for (int j = 1; j <= 10; j++) {
                int resultado = i * j;
                System.out.println(i + " x " + j + " = " + resultado);
            }

            System.out.println();
        }

        scanner.close();
    }
}
