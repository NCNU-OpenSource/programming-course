class 籠子 {
    private Animal[] animals;
    private int 現有隻數;

    public 籠子(int 隻數) {
        this.animals =  new Animal[隻數];
    }

    public void 抓進籠子(Animal 某動物) {
        this.animals[現有隻數++] = 某動物;
    }

    public boolean isFull() {
        return this.現有隻數 == this.animals.length;
    }

    public int 取得隻數() {
        return this.現有隻數;
    }

    public int 取得總腿數() {
        int 總腿數 = 0;
        for (int i = 0; i < this.animals.length; i++) {
            總腿數 += this.animals[i].取得腿數();
        }
        return 總腿數;
    }

    public int 取得兔兔隻數() {
        return (this.取得總腿數() - (this.現有隻數 * 2)) / 2;
    }

    public int 取得雞雞隻數() {
        return this.現有隻數 - 取得兔兔隻數();
    }
}
