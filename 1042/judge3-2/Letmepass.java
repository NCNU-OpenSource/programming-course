import java.util.Scanner;
public class Letmepass {
    // 取得由字串轉成的數字陣列
    public static int[] stringToArray(String s) {
        int[] arr = new int[s.length()];
        // 將字串依序轉為數字
        for (int i = 0; i < s.length(); i++) {
            // 若 '1'-'0' 會是 49-48，即為 1
            int num = s.charAt(i) - '0';

            if (num > 9 || num < 0) {
                // 若非數字，填入 -1
                arr[i] = -1;
            } else {
                // 若是數字，則填入本身至陣列
                arr[i] = num;
            }
        }

        return arr;
    }

    // 比較數字與陣列是否符合
    public static boolean isComply(int num, int[] array) {
        // 由陣列末開始，依次比較
        int index = array.length;

        // 比較至數字比完為止
        while (num > 0) {
            // 陣列 index 往前移動
            index--;

            // 取得此回合要比較之數字
            int n = num % 10;

            // 比較
            if (index < 0) {
                // 若陣列先比完了，中斷
                return false;
            } else if (array[index] != n && array[index] != -1) {
                // 任一比較不成立，中斷
                return false;
            }

            // 準備至下一回合
            num /= 10;
        }

        // 若陣列與數字位數相當、沒被中斷，即為相同
        return index == 0;
    }

    // 取得 n 位數的最大值
    public static int calcMaxNum(int n) {
        // 如：2 位數極大值為
        return (int)(Math.pow(10, n)) - 1;
    }

    public static void main(String[] args) {
        // 讀入資料
        Scanner input = new Scanner(System.in);
        String x = input.nextLine();
        String y = input.nextLine();
        String z = input.nextLine();

        // 字串轉陣列
        int[] arrayX = stringToArray(x);
        int[] arrayY = stringToArray(y);
        int[] arrayZ = stringToArray(z);

        // 窮舉所有可能
        for (int numX = 0; numX <= calcMaxNum( x.length() ); numX++) {
            // 比較數字部分是否符合，不符合即跳過
            if ( !isComply(numX, arrayX) ) {
                continue;
            }
            for (int numY = 0; numY <= calcMaxNum( y.length() ); numY++) {
                // 比較數字部分是否符合，不符合即跳過
                if ( !isComply(numY, arrayY) ) {
                    continue;
                }
                // 比較乘積數字部分是否符合，不符合即跳過
                if ( !isComply(numX * numY, arrayZ) ) {
                    continue;
                }
                // 顯示有可能的答案
                System.out.println(numX + " * " + numY + " = " + numX * numY);
            }
        }
    }
}
