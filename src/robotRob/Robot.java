package robotRob;

import java.util.ArrayList;

public class Robot {

    private double x = 0;
    private double y = 0;
    protected double course = 0;
    //список хранения линий перемещения робота:
    private ArrayList<RobotLine> lines = new ArrayList<>();

    public Robot(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public void forward(int distance) {
        //запоминаем стартовые координаты:
        final double xOld = x;
        final double yOld = y;
        //координаты точки назначения (прибытия):
        x += distance * Math.cos(course / 180 * Math.PI);
        y += distance * Math.sin(course / 180 * Math.PI);
        //заносим координаты пройденного пути в список:
        lines.add(new RobotLine(xOld, yOld, x, y));
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    public double getCourse() {
        return course;
    }

    public void setCourse(double course) {
        this.course = course;
    }

    public ArrayList<RobotLine> getLines() {
        return lines;
    }
}
