/* Nome do Aluno: Mateus Oliveira de Macedo
 * RA:12523122971
 * Nome do Programa:
        Faça um programa para imprimir o conceito de um aluno. O
        conceito é calculado em função da nota do aluno que varia de 0
        a 100. As faixas da correlação são mostradas abaixo:
        Nota Conceito
        0 a 49 Insuficiente
        50 a 64 Regular
        65 a 84 Bom
        85 100 Ótimo
 * Data:11/05/2023
 */

import java.util.Scanner;

public class Ex06 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite a nota do aluno (entre 0 e 100): ");
        int nota = scanner.nextInt();
        scanner.close();
        String conceito;

        if (nota >= 0 && nota <= 49) {
            conceito = "Insuficiente";
        } else if (nota >= 50 && nota <= 64) {
            conceito = "Regular";
        } else if (nota >= 65 && nota <= 84) {
            conceito = "Bom";
        } else if (nota >= 85 && nota <= 100) {
            conceito = "Ótimo";
        } else {
            System.out.println("Nota inválida. Digite um valor entre 0 e 100.");
            scanner.close();
            return;
        }

        System.out.println("Conceito do aluno: " + conceito);
    }
}
