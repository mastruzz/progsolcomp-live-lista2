/* Nome do Aluno: Mateus Oliveira de Macedo
 * RA:12523122971
 * Nome do Programa:
        Faça um programa que some os números de 1 a 100 e imprima
        somente o valor total da soma (utilize while).
 * Data:14/05/2023
 */

public class Ex13 {
    public static void main(String[] args) {
        int numero = 1;
        int soma = 0;

        while (numero <= 100) {
            soma += numero;
            numero++;
        }

        System.out.println("Total da soma: " + soma);
    }
}
