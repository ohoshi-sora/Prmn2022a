package lecture04;

public class Fighter {

    private int hitpoint;
    private int power;
    private String name;

    public Fighter(int hitPoint, int power, String name){
        this.hitpoint = hitPoint;
        this.power = power;
        this.name = name;
    }

    public void attack(Fighter enemy){
        enemy.hitpoint = enemy.hitpoint - power;
        System.out.println(name + " は " + enemy.getName() + " に " + power + "ダメージを与えた。");
    }

    public boolean isAlive(){

        if(hitpoint < 0) {
            return false;
        }else{
            return true;
        }

    }

    public int getHitpoint(){
        return hitpoint;
    }

    public void setHitpoint(int hitPoint){
        this.hitpoint = hitPoint;
    }

    public String getName(){
        return name;
    }

}
