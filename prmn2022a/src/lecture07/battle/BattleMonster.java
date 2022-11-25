package lecture07.battle;

import lecture07.monster.IMonster;
import lecture07.monster.Monster;

public abstract class BattleMonster extends Monster implements IBattleMonster, IMonster{

    protected BattleMonster (IMonster monster){
        super(monster);
    }

    public void attack(int skillIndex, IMonster opponent){

    }

    protected void receiveDamage(int damage, IMonster opponent){

    }
}
