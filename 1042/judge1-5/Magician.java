public class Magician extends Beginner {
    String []sk={"冰雷合擊","冰風暴","聖光"};
    public Magician(String name,int power){
        this.setName(name);
        this.setPower(power);
    }
    public String skill(){
        return sk[(int)(Math.random()*2)];
    }
    public String getAttackMethod(){
        return "法術";
    }
}
