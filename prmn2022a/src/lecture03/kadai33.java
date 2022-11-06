package lecture03;

import java.util.Scanner;

public class kadai33 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("1つ目の整数を入力してください：");
        String a = input.nextLine();
        System.out.print("2つ目の整数を入力してください：");
        String b = input.nextLine();

        int aa = Integer.parseInt(a);
        int bb = Integer.parseInt(b);
        System.out.println(aa + " + " + bb + " = " + (aa+bb));

    }
}
