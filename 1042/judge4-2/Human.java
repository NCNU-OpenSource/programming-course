class Human {
    private String name;
    private Human[] parents;
    private Human companion;

    // 初生之時，會有雙親與姓名
    public Human(String name, Human parentA, Human parentB) {
        this.name = name;
        this.parents = new Human[2];
        this.parents[0] = parentA;
        this.parents[1] = parentB;
    }

    public Human[] getParents() {
        return this.parents;
    }

    public String getName() {
        return this.name;
    }

    public Human getCompanion() {
        return this.companion;
    }

    public void setCompanion(Human person) {
        this.companion = person;
    }




}
