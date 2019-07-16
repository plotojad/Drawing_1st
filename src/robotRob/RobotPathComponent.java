package robotRob;

import javax.swing.*;
import java.awt.*;

public class RobotPathComponent extends JComponent {
    private Robot robot;

    public RobotPathComponent(Robot robot) {
        this.robot = robot;
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        //перебираем линии, которые сохранились у робота:
        for (RobotLine rl : robot.getLines()) {
            //для каждой линии получаем координаты:
            int x1 = (int) Math.round(rl.getX1());
            int y1 = (int) Math.round(rl.getY1());
            int x2 = (int) Math.round(rl.getX2());
            int y2 = (int) Math.round(rl.getY2());
            //рисуем линию по полученным координатам:
            g.drawLine(x1, y1, x2, y2);
        }
    }
}
