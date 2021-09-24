public class RobotComposition {
    public static void main(String[] args) throws Exception {
        Robot robot = new Robot();
        GamePieceManipulator manipulator = new GamePieceManipulator();
        robot.manipulator = manipulator;

        PowerUpRobot powerUpRobot = new PowerUpRobot();
        DeepSpaceRobot deepSpaceRobot = new DeepSpaceRobot();
        InfiniteRechargeRobot infiniteRechargeRobot = new InfiniteRechargeRobot();

        robot.manipulateGamePiece();
        powerUpRobot.manipulateGamePiece();
        deepSpaceRobot.manipulateGamePiece();
        infiniteRechargeRobot.manipulateGamePiece();
    }
}
