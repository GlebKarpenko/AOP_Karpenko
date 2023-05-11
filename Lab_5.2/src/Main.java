import java.awt.*;
import javax.swing.*;
import java.awt.Graphics2D;

public class Main extends JFrame{

    ImageIcon img1, img2, img3;
    JLabel lbl1, lbl2, lbl3, lbl4, lbl5, lbl6, lbl7, lbl8, lbl9;
    Button btn1;
    TextField text1;
    Checkbox chk1;

    Main(){
        setSize(400, 400);
        setTitle("Конвертація документів");
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        lbl4 = new JLabel("Конвертація документів");
        setBounds(100, 50, 200, 50);
        add(lbl4);

        img3 = new ImageIcon(getClass().getResource("/icons/pdf_icon.png"));
        lbl3 = new JLabel(img3);
        lbl3.setBounds(100,  50, 100, 100);
        add(lbl3);

        img2 = new ImageIcon(getClass().getResource("/icons/ms_word_icon.png"));
        lbl2 = new JLabel(img2);
        lbl2.setBounds(50, 250, 100, 100);
        add(lbl2);

        img1 = new ImageIcon(getClass().getResource("/icons/ms_exel_icon.png"));
        lbl1 = new JLabel(img1);
        lbl1.setBounds(0, 350, 100, 100);
        add(lbl1);

    }

    public static void main(String[] args){

        Main mainFrame = new Main();

        mainFrame.setSize(600, 420);
        mainFrame.setTitle("Конвертація документів");
        mainFrame.setVisible(true);
        mainFrame.setDefaultCloseOperation(EXIT_ON_CLOSE);
        mainFrame.setLocationRelativeTo(null);
    }
}

