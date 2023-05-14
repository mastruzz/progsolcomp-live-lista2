/* Nome do Aluno: Mateus Oliveira de Macedo
 * RA:12523122971
 * Nome do Programa:
        Um determinado gás duplica seu volume a cada segundo.
        Dada um volume inicial, em centímetros cúbicos, digitado pelo
        usuário faça um programa que determine o tempo necessário para
        que esse volume se torne maior que 1000 centímetros cúbicos.
        (utilize while)
 * Data:14/05/2023
 */

import java.util.Scanner;

public class Ex19 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o volume inicial em centímetros cúbicos: ");
        int volumeInicial = scanner.nextInt();

        int volumeAtual = volumeInicial;
        int tempo = 0;

        while (volumeAtual <= 1000) {
            volumeAtual *= 2;
            tempo++;
        }

        System.out.println("O volume ultrapassou 1000 cm³ em " + tempo + " segundos.");

        scanner.close();
    }
}
