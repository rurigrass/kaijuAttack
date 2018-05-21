package Monsters;

import Monsters.Kaiju;

public class KingKong extends Kaiju {

    private String fly;

    public KingKong(String name, int healthValue, int attackValue, String fly){
        super(name, healthValue, attackValue);
        this.fly = fly;
    }


    public String makeFly() {
        return String.format("%s %s!", this.getName(), this.fly);
    }
}
