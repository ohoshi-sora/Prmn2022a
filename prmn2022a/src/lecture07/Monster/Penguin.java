package lecture07.Monster;

import lecture07.skill.Bubble;
import lecture07.skill.Peck;
import lecture07.skill.Tackle;

import java.util.Arrays;

public class Penguin extends Monster{
    Penguin(){
        super("Penguin", 53, 12, 13, 20, Arrays.asList(new Peck(), new Tackle(), new Bubble()));
    }
}

