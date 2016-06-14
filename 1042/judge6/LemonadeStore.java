import java.util.Scanner;
public class LemonadeStore {
    private int budget;
    private int quantity;
    private int purchasePrice;
    private int sellingPrice;
    public LemonadeStore(int initBudget, int purchasePrice, int sellingPrice) {
        this.budget = initBudget;
        this.purchasePrice = purchasePrice;
        this.sellingPrice = sellingPrice;
        this.quantity = 0;
    }
    public int getQuantity() {
        return this.quantity;
    }
    public int getBudget() {
        return this.budget;
    }
    public boolean isLemonadeEnough(int quantity) {
        return this.quantity >= quantity;
    }
    public boolean isBudgetEnough(int quantity) {
        return this.budget >= this.purchasePrice * quantity;
    }
    public void sell(int quantity) {
        this.quantity -= quantity;
        this.budget += quantity * this.sellingPrice;
    }
    public void buy(int quantity) {
        this.budget -= quantity * this.purchasePrice;
        this.quantity += quantity;
    }

    public static void main(String[] argv) {
        Scanner input = new Scanner(System.in);
        System.out.print("請輸入創業資本額、每杯成本、每杯售價：");
        LemonadeStore LemonadeStore = new LemonadeStore(input.nextInt(), input.nextInt(), input.nextInt());
        while (true) {
            System.out.println("目前共有：" + LemonadeStore.getQuantity() + "杯");
            System.out.println("目前預算：" + LemonadeStore.getBudget() + "元");
            System.out.println("可用指令：");
            System.out.println("- 販賣：sell 杯數");
            System.out.println("- 進貨：buy 杯數");
            System.out.print("請輸入指令：");
            String cmd = input.next();
            if ( cmd.equals("sell") ) {
                int quantity = input.nextInt();
                if ( LemonadeStore.isLemonadeEnough(quantity) ) {
                    LemonadeStore.sell(quantity);
                    System.out.println("賣出 " + quantity + "杯");
                } else {
                    System.out.println("貨源不足");
                }
            } else if ( cmd.equals("buy") ) {
                int quantity = input.nextInt();
                if ( LemonadeStore.isBudgetEnough(quantity) ) {
                    LemonadeStore.buy(quantity);
                    System.out.println("買進 " + quantity + "杯");
                } else {
                    System.out.println("預算不夠");
                }
            }
            System.out.println();
        }
    }
}
