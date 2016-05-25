import java.util.Scanner;
class ChuCooLet {

    private static int n; // 幾種口味
    private static Pudding[] pud; // 布丁

    public static void main(String[] argv) {
        
        Scanner input = new Scanner(System.in);
        System.out.println("How many flavors?");
        n = input.nextInt(); 
        System.out.println("deliver or toGo?");
        String buy = input.next(); // 外送還是外帶
        
        System.out.println("Insert pudding data");
        pud = new Pudding[n]; // input 布丁
        for(int i = 0 ; i < n ; i++) {
            String f = input.next();
            int p = input.nextInt();
            int q = input.nextInt();
            pud[i] = new Pudding(f, p, q);
        }

        sortPudding();

        System.out.println((getTotalQuantity() / 12) + " 盒 + " + (getTotalQuantity() % 12) + " 個");

        int money = totalMoney();
        if(buy.equals("toGo")) {
        } else if (buy.equals("deliver")) {
            money += 100;
        }
        System.out.println("Money : " + money);
    }

    public static void sortPudding() {
        for(int i = 0 ; i < n-1 ; i++) {
            for(int j = 0 ; j < n-1-i ; j++) {
                if(pud[j].getPrice() > pud[j+1].getPrice()) {
                    Pudding tmpP = pud[j];
                    pud[j] = pud[j+1];
                    pud[j+1] = tmpP;
                }
            }
        }
    }

    public static int getTotalQuantity() {
        int total = 0;
        for(int i = 0 ; i < n ; i++) {
            total += pud[i].getQuantity();
        }
        return total;
    }

    public static int totalMoney() {

        int totalMoney = 0;
        int boxCommodity = getTotalQuantity() - (getTotalQuantity() % 12); // 有裝盒的商品數量
        int boxMoney = 0; // 有裝盒的商品價錢，之後要打 9 折。
        int head = 0;
        int totalQuantity = getTotalQuantity();

        while(boxCommodity != 0) {
            if(boxCommodity > pud[head].getQuantity()) {
                boxCommodity -= pud[head].getQuantity();
                boxMoney += pud[head].getPrice() * pud[head].getQuantity();
                pud[head].setQuantity(0);
                head++;
            } else {
                boxMoney += pud[head].getPrice() * boxCommodity;
                pud[head].setQuantity(pud[head].getQuantity() - boxCommodity);
                boxCommodity = 0;
            }
        }

        for(int i = head ; i < n ; i++) {
            totalMoney += pud[i].getPrice() * pud[i].getQuantity();
        }

        // 裝盒的要打 9 折。
        totalMoney += (boxMoney * 0.9);

        return totalMoney;
    }
}