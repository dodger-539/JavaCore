package HW1;

public class Main {
    public static void main(String[] args) {
//        Course[] c = {new Way(11), new Height(5), new Way(22)};
//        Team team = new Team(...); // Создаем команду
//        c.doIt(team); // Просим команду пройти полосу
//        team.showResults(); // Показываем результаты

        Cat cat1 = new Cat("Кот");
        cat1.setRunningSpeed(10);
        cat1.setJumpHeight(2);


        Course[] c = {new Course(10, 4), new Course(40, 24) };

        for (Course course : c) {
            course.getResultRun(cat1);
            course.getResultJump(cat1);

        }




    }
}
