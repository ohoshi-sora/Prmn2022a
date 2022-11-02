package lecture02;

public class Engine {

    int rpm;

    Engine(int rpm){
        this.rpm = rpm;
    }

    void start(){
        System.out.print("rpm = " + rpm);
        System.out.println(" でエンジンを始動させました。");
    }

}
