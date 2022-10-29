package lecture01;

import java.util.Scanner;

public class kadai_13 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("年齢を入力してください : ");
        int age = input.nextInt();

//0〜19才の時
        if(age < 20 && age >= 0){
            System.out.println("I am " + age + " years old so I cannot drink liquor.");
        }
//20才〜の時
        else if(age >= 20){
            System.out.println("I am " + age + " years old so I can drink liquor.");
        }
//-1才などのエラー処理
        else{
            System.out.println("error");
        }

    }
}
