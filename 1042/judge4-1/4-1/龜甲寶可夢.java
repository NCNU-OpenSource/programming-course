class 龜甲寶可夢 extends Pokemon {
    private String[] 進化可能;
    public 龜甲寶可夢(String nickname) {
        super(nickname);
        進化可能 = new String[]{"傑尼龜","卡咪龜","水箭龜","超級水箭龜"};
    }
    public String getName() {
        return this.calcName(進化可能);
    }
}
