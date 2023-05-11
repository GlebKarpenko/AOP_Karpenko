import java.awt.*;
import java.awt.event.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Lab_6 extends Frame implements ActionListener {

    Button btn1, btn2, btn3;

    Canvas cns1;

    Lab_6() {

        setTitle("Lab_6");
        setSize(760, 630);
        setVisible(true);
        setLayout(null);

        addWindowListener(new WindowAdapter() {

            public void windowClosing(WindowEvent ev) {

                System.exit(0);
            }
        });

        btn1 = new Button("Залити фігуру червоним");
        btn2 = new Button("Залити фігуру жовтим");
        btn3 = new Button("Скасувати");

        cns1 = new Canvas() {
            public void paint(Graphics g) {

                g.setColor(Color.BLACK);
                g.drawPolygon(new int[]{100, 200, 250, 200, 100, 50}, new int[]{80, 80, 150, 220, 220, 150}, 6);
            }
        };

        btn1.setBounds(50, 400, 200, 40);
        btn2.setBounds(300, 400, 200, 40);
        btn3.setBounds(550, 400, 200, 40);
        cns1.setBounds(250, 30, 300, 300);
        cns1.setBackground(Color.GRAY);

        add(btn1);
        add(btn2);
        add(btn3);
        add(cns1);

        btn1.addActionListener(this);
        btn2.addActionListener(this);
        btn3.addActionListener(this);
    }

    public void actionPerformed(ActionEvent actionEvent) {

        if (actionEvent.getSource() == btn1) {

            Graphics g = cns1.getGraphics();
            g.setColor(Color.red);
            g.fillPolygon(new int[]{100, 200, 250, 200, 100, 50}, new int[]{80, 80, 150, 220, 220, 150}, 6);
        }

        if (actionEvent.getSource() == btn2) {

            Graphics g = cns1.getGraphics();
            g.setColor(Color.yellow);
            g.fillPolygon(new int[]{100, 200, 250, 200, 100, 50}, new int[]{80, 80, 150, 220, 220, 150}, 6);
        }

        if (actionEvent.getSource() == btn3) {

            Graphics g = cns1.getGraphics();
            g.setColor(Color.GRAY);
            g.fillPolygon(new int[]{100, 200, 250, 200, 100, 50}, new int[]{80, 80, 150, 220, 220, 150}, 6);
            g.setColor(Color.BLACK);
            g.drawPolygon(new int[]{100, 200, 250, 200, 100, 50}, new int[]{80, 80, 150, 220, 220, 150}, 6);
        }
    }

    public static void main(String[] args) {

        Lab_6 mainFrame = new Lab_6();
        mainFrame.setLocation(300, 200);
    }
}
