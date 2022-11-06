package lecture03;

import java.util.Scanner;

public class kadai31 {
    public static void main(String[] args) {

        System.out.print("任意の文字列を入力してください：");
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        System.out.println("”" + input + "” と入力されました。");

    }
}
