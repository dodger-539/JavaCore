package HW1;

public class Course {
    private int way;
    private int height;

    public Course(int way, int height) {
        this.way = way;
        this.height = height;
    }

    public int getWay() {
        return way;
    }

    public void setWay(int way) {
        this.way = way;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getResultRun (CanRun runner) {
        return runner.run(this);
    }

    public int getResultJump (CanJump jumper) {
        return jumper.jump(this);
    }
}
