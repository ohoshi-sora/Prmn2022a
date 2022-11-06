package lecture03;

import java.util.ArrayList;
import java.util.Scanner;

public class kadai32 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        ArrayList<String> lists = new ArrayList<>();

        System.out.print("何行分入力しますか？：");
        int line = input.nextInt();
        String a = input.nextLine();

        for(int i = 0; i < line; i++){
            System.out.println(i + "行目：");
            lists.add(input.nextLine());
        }

        System.out.println("入力した文字列：");
        int i = 0;

        for(String list : lists){
            System.out.println("[" + i + "]" + list);
            i++;
        }

    }
}
