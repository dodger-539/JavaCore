package HW1;

public class Cat extends Team implements CanRun, CanJump {

    private int runningSpeed;
    private int jumpHeight;

    public Cat(String name) {
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

    public int run(Course course) {
        System.out.println("Я кот, я бегу!");
        System.out.println("Затратил " + course.getWay() / runningSpeed);
        return course.getWay() / runningSpeed;
    }

    public int jump(Course course) {
        System.out.println("Я кот, я прыгаю!");
        System.out.println("Затратил " + course.getHeight() / jumpHeight);
        return course.getHeight() / jumpHeight;
    }
}
