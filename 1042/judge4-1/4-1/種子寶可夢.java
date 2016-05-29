class 種子寶可夢 extends Pokemon {
    private String[] 進化可能;
    public 種子寶可夢(String nickname) {
        super(nickname);
        進化可能 = new String[]{"妙蛙種子","妙蛙草","妙蛙花","超級妙蛙花"};
    }
    public String getName() {
        return this.calcName(進化可能);
    }
}
