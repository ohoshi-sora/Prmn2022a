package lecture01;

public class kadai_14 {
    public static void main(String[] args) {

        int[] array = new int[100];
        int sum = 0;

//        要素番号+1の値を代入
        for(int i = 0; i < array.length; i++){
            array[i] = i + 1;
        }

//        配列番号が偶数の値にの総和
        for(int j = 0; j < array.length; j++){
            if(array[j] % 2 == 0) {
                sum = sum + array[j];
            }
        }

        System.out.println("1~100 偶数の値の総和 : " + sum);

    }
}

//for文を用いたのは、今回の場合処理の回数がわかっていたからである。
//while文は何回処理を行えばいいかわからないときに、使用する
