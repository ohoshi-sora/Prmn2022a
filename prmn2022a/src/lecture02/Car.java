package lecture02;

public class Car {

    int fuel;

    Car(){
        this.fuel = 0;
    }

    void run(){

        if(fuel > 0){
            fuel = fuel - 1;
            System.out.println("燃料を1消費して、走行しました。");
        }else{
            System.out.println("燃料が足りないために、走行できませんでした。");
        }

    }

}
