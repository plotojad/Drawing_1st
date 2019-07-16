package robotRob;

import javax.swing.*;

public class RobotFrame extends JFrame {

    public RobotFrame(Robot robot) {
        //устанавливаем заголовок окна:
        setTitle("Robot Frame");
        //добавляем компонент для рисования пути робота:
        add(new RobotPathComponent(robot));
        //устанавливаем размеры окна:
        setBounds(100, 100, 500, 500);
    }
}
