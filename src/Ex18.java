/* Nome do Aluno: Mateus Oliveira de Macedo
 * RA:12523122971
 * Nome do Programa:
        Faça um programa que determine o fatorial de um número.
        Para este problema, tem-se como entrada o valor do número do
        qual se deseja calcular o fatorial. O fatorial de 0 é igual a
        1. O fatorial de um número N (N!) é definido conforme a seguir
        (utilize for):
        N! = 1 * 2 * 3 * 4 * ... * (N-1) * N
 * Data:14/05/2023
 */

import java.util.Scanner;

public class Ex18 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um número: ");
        int numero = scanner.nextInt();

        int fatorial = 1;

        for (int i = 1; i <= numero; i++) {
            fatorial *= i;
        }

        System.out.println("O fatorial de " + numero + " é: " + fatorial);

        scanner.close();
    }
}
