import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.KeyEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyListener;

public class MainFrame extends JFrame implements ActionListener{

    Canvas cns1;
    Button btn1;

    int x;
    int y;

    MainFrame(int x, int y){

        setTitle("Draw Point");
        setSize(500, 300);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        BorderLayout bl = new BorderLayout();
        setLayout(bl);
        setVisible(true);

        this.x = x;
        this.y = y;

        cns1 = new Canvas();
        add(cns1, BorderLayout.CENTER);

        Font font1 = new Font("Serif", Font.ROMAN_BASELINE, 18);

        btn1 = new Button("Малювати точку");
        btn1.setFont(font1);
        add(btn1, BorderLayout.SOUTH);
    }

    public void actionPerformed(ActionEvent ae){

        if (ae.getSource() == btn1){

            Graphics g = cns1.getGraphics();
            g.setColor(Color.BLACK);
            g.drawOval(x, y, 100, 100);
        }
    }
}
