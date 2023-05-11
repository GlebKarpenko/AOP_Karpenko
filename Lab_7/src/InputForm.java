import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.KeyEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyListener;

public class InputForm extends JFrame implements ActionListener, KeyListener {

    Label lbl1;
    TextField txt1, txt2, txt3;
    Button btn1;

    InputForm() {

        setTitle("InputFrame");
        setVisible(true);
        GridBagLayout g = new GridBagLayout();
        setLayout(g);
        GridBagConstraints gbc = new GridBagConstraints();
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        gbc.fill = GridBagConstraints.HORIZONTAL;
        gbc.gridx = 0;
        gbc.gridy = 0;
        gbc.weighty = 10;
        lbl1 = new Label("Введіть довжини сторін трикутника.");
        add(lbl1, gbc);

        gbc.gridx = 1;
        gbc.gridy = 0;
        txt1 = new TextField();
        add(txt1, gbc);

        gbc.gridx = 2;
        gbc.gridy = 0;
        txt2 = new TextField();
        add(txt2);

        gbc.gridx = 3;
        gbc.gridy = 0;
        txt3 = new TextField();
        add(txt3);

        gbc.fill = GridBagConstraints.HORIZONTAL;
        gbc.ipady = 20;
        gbc.gridx = 0;
        gbc.gridy = 1;
        btn1 = new Button("Розрахувати");
        add(btn1, gbc);
        btn1.addActionListener(this);
        btn1.addKeyListener(this);

        pack();
    }

    public void createForm() {

        Lab_7 l = new Lab_7();
        double P, A;

        String s1 = txt1.getText();
        String s2 = txt2.getText();
        String s3 = txt3.getText();

        double a = Double.parseDouble(s1);
        double b = Double.parseDouble(s2);
        double c = Double.parseDouble(s3);

        P = l.findPerimeter(a, b, c);
        A = l.findArea(a, b, c);

        int check = l.checkInput(a, b, c);
        if (check == -1) {
            ErrorForm er1 = new ErrorForm("Одна або більше сторони не більша 0!");
            er1.setVisible(true);
            return        }
        if (check == 0) {
            ErrorForm er2 = new ErrorForm("Задані сторони не утворюють трикутник!");
            er2.setVisible(true);
            return;
        }

        OutputForm form2 = new OutputForm(P, A);
        form2.setVisible(true);
    }

    public void keyTyped(KeyEvent e){

    }

    public void keyPressed(KeyEvent e){

        if (e.getKeyCode() == KeyEvent.VK_ENTER){createForm();}
    }

    public void keyReleased(KeyEvent e){

    }

    public void actionPerformed(ActionEvent ae){

        if (ae.getSource() == btn1){createForm();}
    }
}
