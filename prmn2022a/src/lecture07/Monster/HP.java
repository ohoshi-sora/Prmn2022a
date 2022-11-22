package lecture07.Monster;

public class HP {
    private int hp;
    private int dead = 0;

    public boolean isAlive(){
        if(hp <=  0) {
            return false;
        }else{
            return true;
        }
    }

    public int getHP(){
        return hp;
    }
}
