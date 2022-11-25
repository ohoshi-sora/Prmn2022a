package lecture07.Monster;

import java.util.ArrayList;
import java.util.List;
import lecture07.skill.Skill;

public class Monster implements IMonster {

    private String name;
    private HP hp = new HP();
    private int power;
    private int defence;
    private int speed;
    private List<Skill> skills = new ArrayList<>(3);

    protected Monster(String name, int hp, int power, int defence, int speed, List<Skill> skills){
        this.name = name;
        setHP(hp);
        this.power = power;
        this.defence = defence;
        this.speed = speed;
        this.skills = skills;
    }

    protected Monster(IMonster monster){

    }

    public String getName(){
        return name;
    }

    public int getHP(){
        return hp.getHP();
    }


//
//    まだできてない
    public void setHP(int hp) {

    }

    public int getPower() {
        return power;
    }

    public int getDefence() {
        return defence;
    }

    public boolean isAlive() {
        return hp.isAlive();
    }
}
