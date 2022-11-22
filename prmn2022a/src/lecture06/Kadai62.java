package lecture06;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;

public class Kadai62 {
    public static void main(String[] args) {

        Random random = new Random();
        Scanner input = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<>(6);

        System.out.println("サイコロを5つ振りました.");
        for (int i = 0; i < 5; i++) {
            list.add(random.nextInt(6));
        }
        System.out.print("何番目のサイコロを確認しますか：");

        try {
            int x = input.nextInt();
            System.out.println(list.get(x));
        } catch (IndexOutOfBoundsException e) {
            System.out.println("ArrayListの範囲外アクセスを確認しました.");
            System.out.println("プログラムを終了します.");
        } catch (InputMismatchException e){
            System.out.println("整数以外の値が確認されました.");
            System.out.println("プログラムを終了します.");
        }

    }
}
