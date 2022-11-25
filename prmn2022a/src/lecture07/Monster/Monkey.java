package lecture07.Monster;

import lecture07.skill.Ember;
import lecture07.skill.Scratch;
import lecture07.skill.Tackle;

import java.util.Arrays;

public class Monkey extends Monster{
    Monkey(){
        super("Monkey", 44, 14, 11, 31, Arrays.asList(new Scratch(), new Tackle(), new Ember()));
    }
}
