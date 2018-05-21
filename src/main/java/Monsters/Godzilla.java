package Monsters;

import Monsters.Kaiju;

public class Godzilla extends Kaiju {

    private String move;

    public Godzilla(String name, int healthValue, int attackValue, String move){
        super(name, healthValue, attackValue);
        this.move = move;
    }

    public String makeMove() {
        return String.format("%s %s!", this.getName(), this.move);
    }


}
