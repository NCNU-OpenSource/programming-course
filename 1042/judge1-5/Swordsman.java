public class Swordsman extends Beginner{
    String []sk={"虎咆嘯","龍咆嘯","氣絕劍"};
    public Swordsman(String name,int power){
        this.setName(name);
        this.setPower(power);
    }
    public String skill(){
        return sk[(int)(Math.random()*3)+1];
    }
    public String getAttackMethod(){
        return "揮砍";
    }
}
