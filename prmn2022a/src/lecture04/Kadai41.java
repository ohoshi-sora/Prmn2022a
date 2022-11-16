package lecture04;

public class Kadai41 {
    public static void main(String[] args) {

        Fighter f1 = new Fighter(210, 100, "Fighter1");
        Fighter f2 = new Fighter(180, 150, "Fighter2");

        while(true){

            f1.attack(f2);
            System.out.println(f2.getName() + "の残り hitpoint : " + f2.getHitpoint());
            if(!f2.isAlive()){
                System.out.println(f2.getName() + "が倒れた。");
                break;
            }

            f2.attack(f1);
            System.out.println(f1.getName() + "の残り hitpoint : " + f1.getHitpoint());
            if(!f1.isAlive()){
                System.out.println(f1.getName() + "が倒れた。");
                break;
            }

        }

    }
}
