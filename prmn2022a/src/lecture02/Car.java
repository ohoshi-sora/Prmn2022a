package lecture02;

public class Car {

    int fuel;
    Tire tires[];
    Engine engine;

    Car(Tire tires[], Engine engine){
        this.fuel = 0;
        this.tires = tires;
        this.engine = engine;
    }

    void run(){

        if(fuel > 0){
            fuel = fuel - 1;
            System.out.println("燃料を1消費して、走行しました。");
        }else{
            System.out.println("燃料が足りないために、走行できませんでした。");
        }

    }

    void startEngine(){
        engine.start();
    }

}
