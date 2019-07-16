package robotRob;

import javax.swing.*;

public class RobotManager {
    public static void main(String[] args) {
        //количество сторон многоугольника:
        final int COUNT = 10;
        //длина стороны:
        final int SIDE = 100;

        Robot robot = new Robot(200, 50);
        //создаем замкнутую фигуру с кол-вом углов COUNT:
        for (int i = 0; i < COUNT; i++) {
            robot.forward(SIDE);
            robot.setCourse(robot.getCourse() + 360 / COUNT);
        }

        //создаем форму для отрисовки пути робота:
        RobotFrame rf = new RobotFrame(robot);
        rf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        rf.setVisible(true);
    }
}
