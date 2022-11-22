package lecture07.Monster;

import java.util.List;
import lecture07.Monster.HP;
import lecture07.skill.Skill;

public class Monster {

    private String name;
    private HP hp;
    private int power;
    private int defence;
    private int speed;
    private List<Skill> skills;

    protected Monster(String name, int hp, int power, int defence, int speed, List<Skill> skills){
        this.name = name;

    }
}
