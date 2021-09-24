public class DeepSpaceRobot extends Robot {
    public DeepSpaceRobot() {
        HatchPanelPlacer placer = new HatchPanelPlacer();
        this.manipulator = placer;
    }   
}
