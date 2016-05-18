import java.util.*;
public class Lotto{
    static int count = 0;
    static int pricestatus = 0;
    static int totalbonus = 0;
    /*new a lotto */
    public static void newLotto(int[] data){
        boolean[] Status = new boolean[49+1]; //who is price
        for(int i = 0 ; i < 6 ;){
            int tmp =(int)(Math.random()*49+1); //1~49
            //System.out.println(tmp);
            if (Status[tmp] == false){ //未抓過{
                data[i] = tmp;
                Status[tmp] = true; //設定為抓取過
                i++;
            }
        }
    }
    /*sort*/
    public static void sort(int[] data){
        int tmp;
        for(int i = 0 ; i < data.length - 1; i++){
            for(int j = 0 ; j < data.length - 1-i; j++ ){
                if(data[j] > data[j+1]){
                    tmp = data[j];
                    data[j] = data[j+1];
                    data[j+1] = tmp;
                }
            }
        }
    }
    /* judge win status*/
    public static int judge(int num, int[] data){
            for(int i = 0 ; i < 6 ; i ++){
                if(data[i] == num){
                    count++;
                }
            }
            if ( count == 6){
                pricestatus = 6;
            }else if(count == 5){
                pricestatus = 5;
            }
            return pricestatus;
    }
    /*bonus*/
    public static int price(int everybonus){
        int getPrice = 0;
        totalbonus= totalbonus + everybonus;
        if(pricestatus == 6){
            getPrice = totalbonus;
            System.out.println("夢想達成了！！");
            System.out.println("獲得全部bonus：" + totalbonus);
            totalbonus = 0;
        }
        else if(pricestatus == 5){
            getPrice = totalbonus/5;
            totalbonus = totalbonus - getPrice;
            System.out.println("答對五個！");
            System.out.println("獲得Bonus的五分之一：" + getPrice);
        }
        else{
            System.out.println("加油R");
        }
        return totalbonus;
    }
    //guess number
    public static void guess(int[] insertData,int[] data){
        Scanner input = new Scanner(System.in);
        int inputTime = 0 ;
        while (inputTime <= 5){
            boolean isrepeat = false;
            int insert = input.nextInt();
            if(insert > 49){
                System.out.println(insert + " 請勿超過49...");
            }else if (insert < 1){
                System.out.println(insert + " 請勿小於1...");
            }
            else{
                for(int i = 0 ; i <= inputTime ; i++ ){
                    if(insert == insertData[i]){
                        isrepeat = true;
                        System.out.println(insert+" 這個號碼已經輸入過了！");
                    }
                }
                if(isrepeat == false){
                    insertData[inputTime] = insert;
                    judge(insert, data);
                    inputTime++;
                }
            }
        }
    }
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int[] data = new int[6]; //6 price
        int[] insertData = new int[6];
        newLotto(data);
        sort(data);
        System.out.print("Answer: ");
        for(int i =0 ; i < data.length; i++){
            System.out.print(data[i] + "\t");
        }
        System.out.println("");
        System.out.println("請輸入請輸入每期頭獎金額......");
        int everybonus = input.nextInt();
        System.out.println("請輸入 6 個樂透號碼......");
        guess(insertData,data);
        price(everybonus);
        System.out.println("");
        while(true){
            pricestatus = 0;
            count = 0;
            System.out.println("是否要再挑戰夢想呢 ？ 按Y繼續...");
            String again = input.next();
            if (again.equals("Y")){
                for(int i = 0 ; i < data.length ; i++){
                    data[i] = 0;
                    insertData[i] = 0;
                }
                System.out.println("累積頭彩上看....." + " " + (totalbonus + everybonus));
                System.out.println("請輸入 6 個樂透號碼......");
                newLotto(data);
                sort(data);
                System.out.print("Answer: ");
                for(int i = 0 ; i < data.length ; i++){
                    System.out.print(data[i]+"\t");
                }
                System.out.println("");
                guess(insertData,data);
                price(everybonus);
            }else{
                break;
            }
        }
    }
}

