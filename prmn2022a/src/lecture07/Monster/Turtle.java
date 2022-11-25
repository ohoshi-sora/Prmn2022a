package lecture07.Monster;

import lecture07.skill.RazorLeaf;
import lecture07.skill.Tackle;

import java.util.Arrays;

public class Turtle extends Monster{
    Turtle(){
        super("Turtle", 55, 17, 16, 15, Arrays.asList(new Tackle(), new RazorLeaf()));
    }
}
