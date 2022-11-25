package lecture07.battle;

import lecture07.monster.IMonster;
import lecture07.monster.Monster;

public abstract class BattleMonster extends Monster implements IBattleMonster, IMonster{

    private BattleMonster (IMonster monster){
        super(monster);
    }

    public void attack(int skillIndex, IMonster opponent){

    }

    private void receiveDamage(int damage, IMonster opponent){

    }
}
