package lecture01;

public class kadai_15 {
    public static void main(String[] args) {

//        テストの点数表
        int[] score = {41,85,72,38,80};

//        成績判断条件式
        String seiseki;
        for(int i = 0; i < score.length; i++){
            if(score[i] < 60){
                seiseki = "不可";
            }else if(score[i] < 70){
                seiseki = "可";
            }else if(score[i] < 80){
                seiseki = "良";
            }else if(score[i] < 90){
                seiseki = "優";
            }else if(score[i] <= 100){
                seiseki = "秀";
            }else{
                seiseki = "error";
            }
            System.out.println(i + "番 " + score[i] + "点 " + seiseki);
        }

//        最高点、最低点、平均点の出力
        System.out.println("・・・・・・・・・・・・・");
        System.out.println("最高点:" + max(score) + "点");
        System.out.println("最低点:" + min(score) + "点");
        System.out.println("平均点:" + ave(score) + "点");
        System.out.println("・・・・・・・・・・・・・");

    }

//    最小値を求める
    static int min(int[] score){

        int score_min = score[0];

        for (int j : score) {
            if (score_min > j) {
                score_min = j;
            }
        }
        return score_min;
    }

//    最大値を求める
    static int max(int[] score){

        int score_max = score[0];

        for (int j : score) {
            if (score_max < j) {
                score_max = j;
            }
        }
        return score_max;
    }

//    平均値を求める
    static double ave(int[] score){

        int sum = 0;

        for (int j : score) {
            sum = sum + j;
        }
        return (double) sum / (double) score.length;

    }

}

