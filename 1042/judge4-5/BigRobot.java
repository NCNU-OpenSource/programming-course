public class BigRobot extends Robot implements Fly,Collide {
    public BigRobot(String name1, String name2) {
        this.setName(name1 + name2);
    }
    public String Attack = Bite.Action + " " + Collide.Attack + " " + Fly.Attack;
}