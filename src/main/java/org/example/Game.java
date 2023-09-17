package org.example;
import java.util.Random;
import java.util.Scanner;
import java.util.Timer;



public class Game {

    Scanner scanner = new Scanner(System.in);
    public Player Player;
    private
    Random random = new Random();
    private int soma;
    private int resposta;
    private String pergunta;



    public Game(String nome){
        exibirMenu();
        this.Player = new Player();
        Player.setName(nome);
        Player.setPoints(0);
        Player.exibirPontos();
        gerarPergunta(); exibirPergunta();
    }

    public void play(){
        if(testaResposta(scanner.nextInt())){
            gerarPergunta();
            Player.exibirPontos();
            exibirPergunta();
        }
        else {
            System.out.println("Errado");
            Player.exibirPontos();
            exibirPergunta();
        }

    }

    public void gerarPergunta() {
        int n1 = random.nextInt(100);
        int n2 = random.nextInt(100);
        this.pergunta = "Quanto é -> " + n1 + " + " + n2;
        setSoma(n1 + n2);
    }

    public boolean testaResposta(int resposta){
        this.resposta = resposta;

        if(getSoma() == resposta){
            Player.pontoPlus();
            return true;
        }

        return false;
    }

    public void exibirMenu(){
        System.out.println("Bem vindo ao FIB FASTEST SIMULATOR TABAJARA");
        System.out.println("**********");
        System.out.println("Você possui 30 segundos para responder o maximo de questoes que conseguir");
        System.out.println("**********");
    }
    public void exibirPergunta(){
        System.out.println(pergunta);
    }


    public int getSoma() {
        return soma;
    }

    public void setSoma(int soma) {
        this.soma = soma;
    }

}
