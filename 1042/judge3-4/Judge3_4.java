import java.util.Scanner;
class Judge3_4 {
    public static void main(String[] argv) {
        Scanner sc = new Scanner(System.in);
        boolean pass = true;
        String value = "";
        // 判斷格式是否正確。格式錯誤則重新輸入。
        do {
            pass = true;
            // 輸入二進位數
            System.out.println("Value :");
            value = sc.next();
            for(int i = 0 ; i < value.length() ; i++) {
                if(value.charAt(i) > '1' || value.charAt(i) < '0' ) {
                    pass = false;
                }
            }
            if(pass == false) {
                System.out.println("Error, try again!");
            }
        }while(pass == false);

        int binary = Integer.parseInt(value); // 字串轉數字，去掉多餘的 0
        int decimal = 0; // 十進位數，由下面迴圈算出
        int tmp = 0; // 第 n 位的數，乘以 2 的 n 次方

        while(binary != 0) {
            decimal += (binary % 10) * (int)(Math.pow(2, tmp));
            binary /= 10;
            tmp++;
        }

        int base = 0; // 轉換的位數
        // 最多到 16 進位
        do{
            pass = true;
            System.out.println("n :");
            base = sc.nextInt();
            if(base > 16) {
                pass = false;
                System.out.println("Error, n <= 16, try again!");
            }
        }while(pass == false);

        String result = ""; // 最終結果
        String[] s = {"0", "1", "2", "3", "4", "5", "6", "7", "8", "9", "A", "B", "C", "D", "E", "F"};

        int quotient = decimal; // 商數，起始值為 10 進位結果
        int remainder = 0; // 餘數

        while(quotient != 0) {
            remainder = quotient % base;
            result = s[remainder] + result;
            quotient = quotient / base;
        }

        // System.out.println("十進位 " + decimal);
        System.out.println("result : " + result);
    }
}
