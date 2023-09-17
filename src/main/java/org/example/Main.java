package org.example;
import java.util.Scanner;


public class Main {

    public static void main(String[] args) {

        BDD tabela = new BDD();
        Scanner scanner = new Scanner(System.in);
        System.out.print("Porfavor insira o nome do Jogador -> ");
        Game game = new Game(scanner.next());

        long startTime = System.currentTimeMillis();
        while (System.currentTimeMillis() - startTime < 30000) {
            game.play();
        }


        System.out.println("Seu tempo acabou");
        System.out.println("Nome do jogador: "); game.Player.exibirNome(); game.Player.exibirPontos();
        tabela.inserirValores(game.Player.getName(), game.Player.getPoints());








    }
}


