import Util.ResistorCode;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int escolha = 0;

        do {
            System.out.print("\n 1- Entrar com Valor");
            System.out.print("\n 2- Sair");
            System.out.print("\n\nEscolha uma opção >> ");
            escolha = sc.nextInt();
            sc.nextLine();

            switch (escolha) {
                case 1:
                    String entrada = sc.nextLine();
                    String resultado = ResistorCode.getCorResistor(entrada);
                    System.out.println(resultado);
                    break;
                case 2:
                    System.out.println("Saindo...");
                    break;
                default:
                    System.out.println("Escolha Inválida!!!");
            }
        } while (escolha != 2);
        sc.close();
    }
}