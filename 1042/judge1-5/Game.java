import java.util.Scanner;

public class Game {
    public static void play(){
        Scanner input =new Scanner(System.in);
        int n=input.nextInt();
        Beginner []arr=new Beginner[n];
        
        int survivor=0;
        for(int i=0;i<n;i++){
            String command=input.next();
            if(command.equals("劍士")){
                arr[i]=new Swordsman(input.next(),input.nextInt());
            }
            if (command.equals("法師")){
                arr[i]=new Magician(input.next(),input.nextInt());
            }
        }
        if(input.next().equals("Boss")){
            Boss boss=new Boss(input.nextInt());
            System.out.println();
            for(int i=0;i<n;i++){
                if(arr[i].getPower()<boss.power){
                    System.out.println(arr[i].getName()+"  死亡");
                }else{
                    System.out.println(arr[i].getName()+"  "+arr[i].getAttackMethod()+"  "+arr[i].skill());
                    survivor++;
                }
            }
        }
        if(survivor > n/2){
            System.out.println();
            System.out.println("遊戲勝利!!!");
        }else{
            System.out.println();
            System.out.println("遊戲失敗!!!");
        }
        
        System.out.print("要產生一個新遊戲嗎?Y or N:");
        if(input.next().equals("Y")){
            play();
        }
        else{
        }
    }

    public static void main(String[] argv){
        play();
    }
}
