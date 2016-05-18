import java.util.Scanner;

public class Coding {
    public static void main(String[] argv) {
        Scanner input = new Scanner(System.in);
        String answer = ""; //答案
        while (true) {
            String str = input.next();
            if (!str.equals("end")) {
                //判斷第二個字是否為數字
                try {
                    if (Integer.parseInt(String.valueOf(str.charAt(1))) > 0) {
                        int time = 0; //數字重複次數
                        for (int i = 1; i < str.length(); i+=2) {
                            time = Character.getNumericValue(str.charAt(i));
                            for (int j = 0; j < time; j++){
                                answer += String.valueOf(str.charAt(i-1)); 
                            }
                        }
                    } 
                } catch (Exception err) { 
                    //全為字串 ex.AAABBCCCC  ->   A3B2C4
                    int accumulation = 0; //累積次數,指標
                    char temp = str.charAt(0);  //比對單字
                    for (int i = 0; i < str.length(); i++) { 
                        if (i > 0){
                            temp = str.charAt(i-1);
                        }
                        if(temp == str.charAt(i)){
                            accumulation++;
                        } else {
                            answer += String.valueOf(str.charAt(i-1)) + String.valueOf(accumulation);
                            accumulation = 1;
                        }
                    }
                    answer +=  String.valueOf(str.charAt(str.length()-1)) +  String.valueOf(accumulation);
                }
                System.out.println(answer);
            } else {
                break;
            }
            answer = "";
        }
    }    
}