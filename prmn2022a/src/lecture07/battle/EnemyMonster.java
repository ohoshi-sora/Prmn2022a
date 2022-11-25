package lecture07.battle;

import lecture07.monster.IMonster;

public class EnemyMonster extends BattleMonster{

    public EnemyMonster(IMonster monster){
        super(monster);
    }

    public int skillSelect(){
        return 0;
    }

    public void attackOutput(){

    }

    public void remainHpOutput(){

    }

    public void skillListOutput(){

    }

    public void winOutput(){

    }

    public void loseOutput(){

    }


}
