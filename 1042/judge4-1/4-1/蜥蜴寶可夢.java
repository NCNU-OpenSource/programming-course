class 蜥蜴寶可夢 extends Pokemon {
    private String[] 進化可能;
    public 蜥蜴寶可夢(String nickname) {
        super(nickname);
        進化可能 = new String[]{"小火龍","火恐龍","噴火龍","超級噴火龍"};
    }
    public String getName() {
        return this.calcName(進化可能);
    }
}
