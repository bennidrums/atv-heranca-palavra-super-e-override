package loja;

import produtos.*;
import java.util.Scanner;
import java.util.InputMismatchException;

public class LojaRacoonCityMain {

    public static void main(String[] args) {

        int opcaoMenu;
        int unidadeCompra;
        int quantidadeTelevisao = 0;
        int quantidadeRadio = 0;
        int quantidadeVideoGame = 0;
        int quantidadeTablet = 0;
        int quantidadeCelular = 0;
        double precoFinalTotal = 0;
        int comprasRealizadas = 0;

        System.out.println("\nOlá, seja bem vindo a Racoon City Store!");

        Scanner sc = new Scanner(System.in);

        System.out.print("\nQuantas unidades quer comprar?: ");
        unidadeCompra = sc.nextInt();
        sc.nextLine();

        Produto[] compras = new Produto[unidadeCompra];

        for (int i = 0; i < unidadeCompra; i++) {
            do {
                System.out.print("\nQual produto você quer comprar?");
                System.out.println("\n1 - Televisão.");
                System.out.println("2 - Rádio.");
                System.out.println("3 - Videogame.");
                System.out.println("4 - Tablet.");
                System.out.println("5 - Celular.");
                System.out.println("0 - Finalizar compra.");
                System.out.print("\nSelecione umas das opções: ");
                try {
                opcaoMenu = sc.nextInt();
                }
                catch (InputMismatchException e) {
                    System.out.println("Digite apenas números!");
                    opcaoMenu = -1;
                }
                sc.nextLine();

                switch (opcaoMenu) {
                    case 1:
                        compras[i] = new Televisao();
                        break;
                    case 2:
                        compras[i] = new Radio();
                        break;
                    case 3:
                        compras[i] = new VideoGame();
                        break;
                    case 4:
                        compras[i] = new Tablet();
                        break;
                    case 5:
                        compras[i] = new Celular();
                        break;
                    case 0:
                        break;

                    default:
                        System.out.println("Opção inválida!");
                }
                if (opcaoMenu >= 1 && opcaoMenu <= 5) {
                    comprasRealizadas++;
                }
            } while (opcaoMenu < 0 || opcaoMenu > 5);

            if (opcaoMenu == 0) {
                System.out.println("Encerrando...");
                break;
            }
        }

        for (int i = 0; i < comprasRealizadas; i++) {
            if (compras[i] instanceof Televisao) {
                quantidadeTelevisao++;
            }
            if (compras[i] instanceof Radio) {
                quantidadeRadio++;
            }
            if (compras[i] instanceof VideoGame) {
                quantidadeVideoGame++;
            }
            if (compras[i] instanceof Tablet) {
                quantidadeTablet++;
            }
            if (compras[i] instanceof Celular) {
                quantidadeCelular++;
            }
        }
        System.out.println("\nCHECK-OUT");
        System.out.println("\nTelevisão: " + quantidadeTelevisao);
        System.out.println("Rádio: " + quantidadeRadio);
        System.out.println("Videogame: " + quantidadeVideoGame);
        System.out.println("Tablet: " + quantidadeTablet);
        System.out.println("Celular: " + quantidadeCelular);

        for (int i = 0; i < comprasRealizadas; i++) {
            precoFinalTotal = precoFinalTotal + compras[i].getPrecoProduto();
        }
        System.out.println("\nValor total: " + precoFinalTotal);
    }
}