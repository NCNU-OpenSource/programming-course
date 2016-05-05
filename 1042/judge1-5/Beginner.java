public abstract class  Beginner {
    private String name;
    private int power;
    public abstract String getAttackMethod();
    public abstract String skill();
    public void setName(String name){
        this.name=name;
    }
    public String getName(){
        return name;
    }
    public void setPower(int power){
        this.power=power;
    }
    public int getPower(){
        return power;
    }
}
