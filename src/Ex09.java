/* Nome do Aluno: Mateus Oliveira de Macedo
 * RA:12523122971
 * Nome do Programa:
        Faça um programa que receba o valor da venda, escolha a
        condição de pagamento no menu e mostre o total da venda final
        conforme condições a seguir:
        Venda a Vista - desconto de 10%
        Venda a Prazo 30 dias - desconto de 5%
        Venda a Prazo 60 dias - mesmo preço
        Venda a Prazo 90 dias - acréscimo de 5%
        Venda com cartão de débito - desconto de 8%
        Venda com cartão de crédito - desconto de 7%
 * Data:11/05/2023
 */

import java.util.Scanner;

public class Ex09 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o valor da venda: R$");
        double valorVenda = scanner.nextDouble();

        System.out.println("Selecione a condição de pagamento:");
        System.out.println("1 - Venda à vista");
        System.out.println("2 - Venda a prazo 30 dias");
        System.out.println("3 - Venda a prazo 60 dias");
        System.out.println("4 - Venda a prazo 90 dias");
        System.out.println("5 - Venda com cartão de débito");
        System.out.println("6 - Venda com cartão de crédito");
        System.out.print("Opção: ");
        int opcao = scanner.nextInt();

        double desconto = 0.0;
        double acrescimo = 0.0;

        switch (opcao) {
            case 1:
                desconto = 0.1;
                break;
            case 2:
                desconto = 0.05;
                break;
            case 3:
                // Mesmo preço, sem desconto ou acréscimo
                break;
            case 4:
                acrescimo = 0.05;
                break;
            case 5:
                desconto = 0.08;
                break;
            case 6:
                desconto = 0.07;
                break;
            default:
                System.out.println("Opção inválida. Tente novamente.");
                scanner.close();
                return;
        }

        double total = valorVenda - (valorVenda * desconto) + (valorVenda * acrescimo);

        System.out.println("Total da venda: R$" + total);

        scanner.close();
    }
}
