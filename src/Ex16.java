/* Nome do Aluno: Mateus Oliveira de Macedo
 * RA:12523122971
 * Nome do Programa:
        Faça um programa que solicite ao usuário que digite um
        número até que ele digite um número menor que 0 (utilize
        while)
 * Data:14/05/2023
 */
import java.util.Scanner;

public class Ex16 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numero;

        do {
            System.out.print("Digite um número (digite um número menor que 0 para sair): ");
            numero = scanner.nextInt();
        } while (numero >= 0);

        System.out.println("Você digitou um número menor que 0. Encerrando o programa.");

        scanner.close();
    }
}
