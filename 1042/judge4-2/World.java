import java.util.Scanner;
public class World {
    // 這世界能裝一千人
    private static Human[] people = new Human[1000];
    // 紀錄現在裝了幾人
    public static int count;
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // 世界一開始有兩個天降人（沒父母）
        people[0] = new Human("憲一", null, null);
        people[1] = new Human("展瑩", null, null);
        count += 2;

        // 運作吧，世界！
        while (true) {
            // 列出世界上每個人的資訊
            for (int i = 0; i < count; i++) {
                // 先取得這人的雙親
                Human[] parents = people[i].getParents();
                // 顯示姓名
                System.out.print("[" + people[i].getName() + "] ");
                // 若有父母，顯示父母
                if (parents[0] != null && parents[1] != null)  {
                    System.out.print("父母： " + parents[0].getName() + " & " + parents[1].getName() + " ");
                }
                // 若有伴侶，顯示伴侶
                if (people[i].getCompanion() != null)  {
                    System.out.print("伴侶： " + people[i].getCompanion().getName());
                }
                System.out.println();
            }
            System.out.println();

            // 取得指令
            String cmd = input.next();

            // 找尋既存於世界之二人
            // 預設找不到
            Human a = null;
            Human b = null;
            // 輸入到找到為止
            while (a == null) {
                String name = input.next();
                a = search(name);
            }
            while (b == null) {
                String name = input.next();
                b = search(name);
            }

            // 執行指令
            if (cmd.equals("marry")) {
                // 互結連理
                a.setCompanion(b);
                b.setCompanion(a);
            } else if (cmd.equals("deliver")) {
                // 若互為伴侶，才可生小孩
                if (couldDeliver(a, b)) {
                    System.out.print("請取個名字： ");
                    people[count++] = new Human(input.next(), a, b);
                } else {
                    System.out.println("互為伴侶才能生喔～");
                }
            }
            System.out.println();
        }
    }

    // 判斷這兩人是否能孩子
    private static boolean couldDeliver(Human a, Human b) {
        return a.getCompanion() == b && b.getCompanion() == a;
    }

    // 找尋叫這名字的人
    private static Human search(String name) {
        for (int i = 0; i < count; i++) {
            if (name.equals(people[i].getName())) {
                return people[i];
            }
        }
        return null;
    }
}
