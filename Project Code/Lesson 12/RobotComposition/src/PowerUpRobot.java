public class PowerUpRobot extends Robot {
    
    public PowerUpRobot() {
        CubeElevator elevator = new CubeElevator();
        this.manipulator = elevator;
    }
}
