package org.example;

public class Player {
    private String name;
    private int points;


    public int getPoints()
    {
        return points;
    }

    public void setPoints(int points) {
        this.points = points;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void exibirPontos(){
        System.out.print("Pontos -> "); System.out.println(points);
    }

    public void exibirNome(){
        System.out.println(name);
    }

    public void pontoPlus(){
        points++;
    }

}
