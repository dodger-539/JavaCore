package HW1;

public class Dog extends Team implements CanRun, CanJump{

    private int runningSpeed;
    private int jumpHeight;

    public Dog(String name) {
        super(name);
    }

    public int getRunningSpeed() {
        return runningSpeed;
    }

    public void setRunningSpeed(int runningSpeed) {
        this.runningSpeed = runningSpeed;
    }

    public int getJumpHeight() {
        return jumpHeight;
    }

    public void setJumpHeight(int jumpHeight) {
        this.jumpHeight = jumpHeight;
    }

    @Override
    public int jump(Course height) {
        return 0;
    }

    @Override
    public int run(Course way) {
        return 0;
    }
}
