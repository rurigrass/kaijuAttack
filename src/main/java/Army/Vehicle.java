package Army;

import Monsters.Godzilla;
import Monsters.Kaiju;

public abstract class Vehicle {

    private String name;
    public int healthValue;
    private int attackValue;

    public Vehicle(String name, int healthValue, int attackValue){
        this.name = name;
        this.healthValue = healthValue;
        this.attackValue = attackValue;
    }


    public String getName() {
        return this.name;
    }

    public int getHealthValue() {
        return this.healthValue;
    }

    public int getAttackValue() {
        return this.attackValue;
    }

    public void loseHealth(Kaiju kaiju) {
        this.healthValue - kaiju.attack(Helicopter);
    }
}
