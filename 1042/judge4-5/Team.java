import java.util.Scanner;
public class Team {
    public static void main(String []argv) {
        Scanner input = new Scanner(System.in); 
        Boolean []array = {false, false}; //判斷是否出現過
        Lion lion = new Lion();
        Eagle eagle = new Eagle();
        Loop:
        while(true) {
            String role = input.next();
            switch (role) {
                case "Lion":
                    if(array[0] != true) {
                        array[0] = true;
                        lion.setName(input.next());
                        System.out.println("獅子名稱:" + lion.getName() + " 功能:" + lion.Action + " " + lion.Attack);
                    } else {
                        System.out.println("已出現過!");
                    }
                    break;
                case "Eagle":
                    if(array[1] != true) {
                        array[1] = true;
                        eagle.setName(input.next());
                        System.out.println("老鷹名稱:" + eagle.getName() + " 功能:" + eagle.Action + " " + eagle.Attack);
                    } else {
                        System.out.println("已出現過!");
                    }
                    break;
                default:
                    if(role.equals("merge")) {
                        if(array[0] == true && array[1] == true){
                            BigRobot bigrobot = new BigRobot(lion.getName(), eagle.getName());
                            System.out.println("合體機器人名稱:" + bigrobot.getName() + " 功能:"+bigrobot.Attack);
                            break Loop; 
                        } else {
                            System.out.println("獅子或老鷹還沒產生，無法合體");
                        }
                    } else{
                        System.out.println("輸入錯誤!");
                    }    
            }
        }

    }
} 