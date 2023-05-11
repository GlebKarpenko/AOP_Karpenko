import java.awt.*;
import java.awt.event.*;

public class MainFrame extends Frame {
    MainFrame(String s) {

        super(s);
        setSize(800, 500);
        setVisible(true);

        addWindowListener(new WindowAdapter() {

            public void windowClosing(WindowEvent ev) {
                System.exit(0);
            }
        });
    }

    public void paint(Graphics graphics) {

        graphics.setColor(new Color(73, 73, 73));
        graphics.setFont(new Font("Times New Roman", Font.ITALIC, 16));
        graphics.drawString("Elipse", 200, 60);
        graphics.drawString("Triangle", 200,260);
        graphics.drawString("Trapezoid", 500, 60);

        graphics.setColor(new Color(250, 10, 10));
        graphics.fillOval(120, 100, 200, 100);

        graphics.setColor(new Color(255, 234, 0, 255));
        graphics.fillPolygon(new int[] {120, 120, 320}, new int[] {300, 400, 400}, 3);

        graphics.setColor(new Color(0, 50,200 ));
        graphics.fillPolygon(new int[] {500, 600, 680, 420}, new int[] {110, 110, 180, 180}, 4);
    }
}

