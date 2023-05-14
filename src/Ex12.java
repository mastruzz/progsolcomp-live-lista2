/* Nome do Aluno: Mateus Oliveira de Macedo
 * RA:12523122971
 * Nome do Programa:
        Faça um programa que imprima todos os números pares de 1
        a 100.
 * Data:11/05/2023
 */
public class Ex12 {
    public static void main(String[] args) {
        int numero = 0;

        do {
            if (numero % 2 == 0) {
                System.out.println(numero);
            }
            numero += 2;
        } while (numero % 7 != 0);
    }
}
