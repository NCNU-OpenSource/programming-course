public abstract class Pokemon {
    private String nickname;
    private int exp;
    private int level;
    private int 進化階段;
    public Pokemon(String nickname) {
        this.exp = 0;
        this.nickname = nickname;
    }
    public void check進化() {
        int level = this.getLevel();
        if (level >= 50) {
            進化階段 = 3;
        } else if (level >= 36) {
            進化階段 = 2;
        } else if (level >= 16) {
            進化階段 = 1;
        } else {
            進化階段 = 0;
        }
    }
    public int getLevel() {
        return this.level;
    }
    public String getNickname() {
        return this.nickname;
    }
    public String calcName(String[] 進化可能) {
        return 進化可能[this.進化階段];
    }
    public int train() {
        int expandExp = (int)(Math.sqrt((Math.random() * 1000)) * 50);
        this.exp += expandExp;

        int tmp = this.exp;
        while (tmp >= level * level + 1) {
            tmp -= level * level + 1;
            this.level++;
        }

        check進化();

        return expandExp;
    }
    public abstract String getName();
}
