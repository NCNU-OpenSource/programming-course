import java.util.Scanner;
public class PokemonMaster {
    public static void main(String[] argv) {
        Scanner input = new Scanner(System.in);
        Pokemon[] 背包 = new Pokemon[6];
        for (int i = 0; i < 背包.length; i++) {
            int dice = (int)(Math.random() * 3);
            if (dice == 0) {
                背包[i] = new 種子寶可夢(input.next());
            } else if (dice == 1) {
                背包[i] = new 龜甲寶可夢(input.next());
            } else {
                背包[i] = new 蜥蜴寶可夢(input.next());
            }
        }
        System.out.println("請輸入指令");
        while (input.hasNext()) {
            String cmd = input.next();
            if (cmd.equals("train")) {
                System.out.println("開始訓練");
                for (int i = 0; i < 背包.length; i++) {
                    System.out.println(背包[i].getNickname()+" 訓練獲得: " + 背包[i].train() +" exp");
                }
                System.out.println();
            } else if (cmd.equals("list")) {
                System.out.println("目前您的寶可夢們：");
                for (int i = 0; i < 背包.length; i++) {
                    System.out.print(背包[i].getNickname() + " ");
                    System.out.print(背包[i].getName() + " ");
                    System.out.print(背包[i].getLevel() + " ");
                    System.out.println();
                }
                System.out.println();
            } else {
                break;
            }
        }
    }
}
