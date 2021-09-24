public class Enemy extends Character implements Fightable {
    public Enemy(String name) {
        this.setName(name);
    }

    @Override
    public void attack() {
        System.out.println("Enemy now attacking.");
    }

    @Override
    public void takeDamage(int damage) {
        // TODO Auto-generated method stub
    }

    @Override
    public int getMaxHp() {
        // TODO Auto-generated method stub
        return 0;
    }

    @Override
    public int getHpRemaining() {
        // TODO Auto-generated method stub
        return 0;
    }

    @Override
    public void introduce() {
        System.out.println("I am an evil enemy!");
    }
}
