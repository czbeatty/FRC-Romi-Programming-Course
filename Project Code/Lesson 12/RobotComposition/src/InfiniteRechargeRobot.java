public class InfiniteRechargeRobot extends Robot {
    
    public InfiniteRechargeRobot() {
        BallShooter ballShooter = new BallShooter();
        this.manipulator = ballShooter;
    }
}
