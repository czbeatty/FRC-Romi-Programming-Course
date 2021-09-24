public class NPC extends Character {
    public NPC(String name) {
        this.setName(name);
    }

    @Override
    public void introduce() {
        System.out.println("I sell things!");
    }
}
