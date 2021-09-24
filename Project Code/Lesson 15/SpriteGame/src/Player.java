public class Player extends Character implements Fightable, Movable {
    public Player(String name) {
        super(name);
    }

    @Override
    public void attack() {
        System.out.println("Player now attacking.");
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
    public void moveNorth() {
        // TODO Auto-generated method stub

    }

    @Override
    public void moveEast() {
        // TODO Auto-generated method stub

    }

    @Override
    public void moveSouth() {
        // TODO Auto-generated method stub

    }

    @Override
    public void moveWest() {
        // TODO Auto-generated method stub

    }

    @Override
    public int getXPosition() {
        // TODO Auto-generated method stub
        return 0;
    }

    @Override
    public int getYPosition() {
        // TODO Auto-generated method stub
        return 0;
    }

    @Override
    public void introduce() {
        System.out.println("I am a brave adventurer!");
    }
}
