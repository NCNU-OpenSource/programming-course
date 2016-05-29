import java.util.Scanner;

class Person {
    String name;
    int weight;
    public Person(String name) {
        this.name = name;
        weight = (int)(Math.random() * 100 + 51);
    }

}

class Stack {
    int top, totalWeight = 0;
    Person[] allPeople = new Person[6];
    
    public void push(Person enter) {
        allPeople[top] = enter;
        totalWeight += allPeople[top].weight;
        top++;
    }  


    public String pop() {
        top--;
        String tmp = allPeople[top].name;
        totalWeight -= allPeople[top].weight;
        allPeople[top] = null;
        return tmp;
    }  

    public boolean isEmpty() {
        return top == 0;
    }

    public boolean isFull() {
        return top == allPeople.length;
    }

    public boolean isOverWeight(Person enter) {
        return enter.weight + totalWeight > 450;
    }
}

public class Elevator {
    public static void main(String[] argv) {
        Stack elevator = new Stack();
        Scanner input = new Scanner(System.in);
        while (true) {
            String command = input.next();
            if (command.equals("enter")) {
                if (elevator.isFull()) {
                    System.out.println("電梯最多容納 6 人，請搭下一班電梯");
                } else {
                    Person tmp = new Person(input.next());
                    if (elevator.isOverWeight(tmp)) {
                        System.out.println("電梯最多容納 450 kg，請搭下一班電梯");
                    } else {
                        elevator.push(tmp);    
                    }
                }
            } else if(command.equals("leave")) {
               if (elevator.isEmpty()) {
                   System.out.println("電梯現在沒有人");
                } else {
                    System.out.println(elevator.pop() + " 走出電梯了");
                }
            } else if(command.equals("list")) {
                for (int i = 0; i < elevator.top ; i++) {
                    System.out.println("Name: " + elevator.allPeople[i].name + ", Weight:" + elevator.allPeople[i].weight);
                }
                System.out.println("total weight: " + elevator.totalWeight);
            } else if(command.equals("end")) {
                break;
            }
        }
    }
}