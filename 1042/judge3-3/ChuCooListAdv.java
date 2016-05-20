import java.util.Scanner;

class Queue {
    String[] data = new String[10];
    String name;
    int head, tail, size;

    public Queue(String name) {
        this.name = name;
    }

    public void add(String x) {
        data[tail++] = x;
        tail %= data.length;
        size++;
    }

    public String remove() {
        String tmp = data[head];
        data[head++] = null;
        head %= data.length;
        size--;
        return tmp;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public boolean isFull() {
        return size == data.length;
    }

    public void list() {
        System.out.println("\n" + name + " 待辦事項：");
        for (int i = 0, j = head; i < data.length; i++, j = (j+1) % data.length) {
            if (data[j] != null) {
                System.out.println(data[j]);
            } else {
                System.out.println("空");
            }
        }
    }
}

public class ChuCooListAdv {
    public static void main(String[] argv) {
        Queue[] allLists = new Queue[100];
        int numList = 0;
        Scanner input = new Scanner(System.in);
        while (true) {
            String command = input.next();
            if (command.equals("new")) {
                allLists[numList++] = new Queue(input.next());
            } else if(command.equals("end")) {
                break;
            } else {
                String name = input.next();
                int i;
                for (i = 0; i < numList; i++) {
                    if (allLists[i].name.equals(name))
                        break;
                }
                if (command.equals("add")) {
                    if (!allLists[i].isFull()) {
                        allLists[i].add(input.next());
                    } else {
                        System.out.println("這個清單已經滿了！");
                    }
                } else if (command.equals("remove")) {
                    if (!allLists[i].isEmpty()) {
                        allLists[i].remove();
                    } else {
                        System.out.println("這個清單沒有東西！");
                    }
                } else if (command.equals("list")) {
                    allLists[i].list();
                }
            }
        }

        for (int i = 0; i < numList; i++) {
            if(allLists[i] != null)
                allLists[i].list();
        }
    }
}
