public class Janken {
    public static void main(String[] args) {
    //ユーザー側に表示
        System.out.println("じゃんけんをしましょう");
        System.out.println("0:グー 1:チョキ 2:パー");
    //ユーザーの入力
        int player = new java.util.Scanner(System.in).nextInt();
            //０～２ではない数値を入力された際の再入力を勧める処理   
            while (player > 2 || player < 0) {
                System.out.println("0~2の値を入力してください");
                player = new java.util.Scanner(System.in).nextInt();
              }
    //乱数を使った手の選定
        int cpu = new java.util.Random().nextInt(3);
        String[] hand = {"グー","チョキ","パー"};
    //結果の表示
        System.out.println("あなた：" + hand[player] + " " +  "コンピュータ：" + hand[cpu]);
    //judgeメゾットの返り値を使った勝敗の表示
        String result = judge(player, cpu);
        System.out.println(result);
    }
  //勝敗判定をメソッドとして分離
    public static String judge(int player, int cpu) {
        if((player == 0 && cpu == 1) || 
           (player == 1 && cpu == 2) ||  
           (player == 2 && cpu == 0)) {
            return "あなたの勝ち！";
        } else if(player == cpu) {
            return  "あいこ！";
        } else{
            return "残念！負け！！";
        }
    }
}