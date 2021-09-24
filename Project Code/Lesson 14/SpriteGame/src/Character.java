public abstract class Character {
    private String name;

    public void printName() {
        System.out.println(this.name);
    }

    public void setName(String name) {
        this.name = name;
    }

    public abstract void introduce();
}
