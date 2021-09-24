public class DestructibleObject implements Fightable {

    @Override
    public void attack() {
        System.out.println("Object destroyed!");
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
    
}
