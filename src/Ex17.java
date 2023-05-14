/* Nome do Aluno: Mateus Oliveira de Macedo
 * RA:12523122971
 * Nome do Programa:
        Faça um programa que imprima os múltiplos negativos de 7,
        superiores a -1000. (utilize do / while)
 * Data:14/05/2023
 */

public class Ex17 {
    public static void main(String[] args) {
        int numero = -7;

        do {
            System.out.println(numero);
            numero -= 7;
        } while (numero > -1000);
    }
}
