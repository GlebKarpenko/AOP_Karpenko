import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.KeyEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyListener;


public class Lab_8 extends JFrame implements ActionListener, KeyListener{

    Canvas cns1;
    Color clr1 = new Color(255, 255, 255);

    Lab_8() {

        setTitle("Lab_8");
        setSize(500, 300);
        setVisible(true);
        BorderLayout bl = new BorderLayout();
        setLayout(bl);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        MenuBar mb = new MenuBar();
        setMenuBar(mb);
        Menu mDraw = new Menu("Намалювати фігуру");
        mb.add(mDraw);

        cns1 = new Canvas();
        cns1.setBackground(clr1);
        add(cns1, BorderLayout.CENTER);

        MenuShortcut key1 = new MenuShortcut(KeyEvent.VK_P);
        MenuShortcut key2 = new MenuShortcut(KeyEvent.VK_R);
        MenuShortcut key3 = new MenuShortcut(KeyEvent.VK_O);

        MenuItem mPolygon = new MenuItem("Багатокутник", key1);
        mDraw.add(mPolygon);
        mPolygon.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                Graphics g = cns1.getGraphics();
                g.setColor(clr1);
                g.fillRect(0, 0, 500, 500);
                g.setColor(Color.BLACK);
                g.drawPolygon(new int[]{200, 300, 350, 300, 200, 150}, new int[]{80, 80, 150, 220, 220, 150}, 6);
            }
        });

        MenuItem mSquare = new MenuItem("Квадрат", key2);
        mDraw.add(mSquare);
        mSquare.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                Graphics g = cns1.getGraphics();
                g.setColor(clr1);
                g.fillRect(0, 0, 500, 500);
                g.setColor(Color.BLACK);
                g.drawRect(150, 50, 150, 150);
            }
        });

        MenuItem mOval = new MenuItem("Коло Ctrl", key3);
        mDraw.add(mOval);
        mOval.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                Graphics g = cns1.getGraphics();
                g.setColor(clr1);
                g.fillRect(0, 0, 500, 500);
                g.setColor(Color.BLACK);
                g.drawOval(150, 50, 150, 150);
            }
        });
    }

    public void actionPerformed(ActionEvent ae){


    }

    public void keyTyped(KeyEvent e){

    }

    public void keyPressed(KeyEvent e){

    }

    public void keyReleased(KeyEvent e){

    }

    public static void main(String[] args){

        Lab_8 mainFrame = new Lab_8();
    }
}
