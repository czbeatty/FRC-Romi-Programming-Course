public class Robot {
    protected Drivetrain drivetrain;
    protected GamePieceManipulator manipulator;

    public void manipulateGamePiece() {
        manipulator.manipulate();
    }
}
