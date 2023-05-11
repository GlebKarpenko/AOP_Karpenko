import java.awt.*;
import java.awt.event.*;

class MainFrame extends Frame {

    Label lbl1, lbl2, lbl3, lbl4, lbl5, lbl6, lbl7, lbl8, lbl9, lbl10, lbl11;

    TextField txt1, txt2, txt3, txt4, txt5, txt6;

    Button btn1, btn2, btn3, btn4;

    MainFrame() {

        setTitle("Lab_5");
        setSize(800, 630);
        setVisible(true);
        setLayout(null);

        addWindowListener(new WindowAdapter() {

            public void windowClosing(WindowEvent ev) {
                System.exit(0);
            }
        });

        lbl1 = new Label("Информация об организации");
        lbl2 = new Label("Наименование*");
        lbl3 = new Label("Город*");
        lbl4 = new Label("Адрес*");
        lbl5 = new Label("Контактное лицо*");
        lbl6 = new Label("Телефон*");
        lbl7 = new Label("E-mail*");
        lbl8 = new Label("Информация об объекте");
        lbl9 = new Label("Название*");
        lbl10 = new Label("Область применения ПТО");
        lbl11 = new Label("8");

        txt1 = new TextField();
        txt2 = new TextField();
        txt3 = new TextField();
        txt4 = new TextField();
        txt5 = new TextField();
        txt6 = new TextField();

        btn1 = new Button("Отопление");
        btn2 = new Button("Вентиляция");
        btn3 = new Button("ГВС");
        btn4 = new Button("Отправить");

        Font font1 = new Font("Serif", Font.ROMAN_BASELINE, 18);
        Font font2 = new Font("Serif", Font.BOLD, 14);
        Color color1 = new Color(54, 89, 234);

        lbl1.setBounds(30, 50, 250, 20);
        lbl1.setForeground(color1);
        lbl1.setFont(font1);

        lbl2.setBounds(30, 100, 200, 20);
        lbl2.setFont(font2);
        txt1.setBounds(300, 100, 200, 20);

        lbl3.setBounds(30, 150, 200, 20);
        lbl3.setFont(font2);
        txt2.setBounds(300, 150, 200, 20);

        lbl4.setBounds(30, 200, 200, 20);
        lbl4.setFont(font2);
        txt3.setBounds(300, 200, 200, 20);

        lbl5.setBounds(30, 250, 250, 20);
        lbl5.setFont(font1);
        lbl5.setForeground(color1);

        lbl6.setBounds(30, 300, 200, 20);
        lbl6.setFont(font2);
        txt4.setBounds(300, 300, 200, 20);

        lbl7.setBounds(30, 350, 200, 20);
        lbl7.setFont(font2);
        txt5.setBounds(310, 350, 200, 20);
        lbl11.setBounds(300, 350, 10, 20);

        lbl8.setBounds(30, 400, 250, 20);
        lbl8.setFont(font1);
        lbl8.setForeground(color1);

        lbl9.setBounds(30, 450, 200, 20);
        lbl9.setFont(font2);
        txt6.setBounds(300, 450, 200, 20);

        lbl10.setBounds(30, 500, 200, 20);
        lbl10.setFont(font2);

        btn1.setBounds(300, 500, 150, 40);
        btn1.setForeground(color1);

        btn2.setBounds(450, 500, 150, 40);
        btn2.setForeground(color1);

        btn3.setBounds(600, 500, 50, 40);
        btn3.setForeground(color1);

        btn4.setBounds(690, 550, 100, 40);
        btn4.setForeground(color1);

        add(lbl1);
        add(lbl2);
        add(lbl3);
        add(lbl4);
        add(lbl5);
        add(lbl6);
        add(lbl7);
        add(lbl8);
        add(lbl9);
        add(lbl10);
        add(lbl11);

        add(txt1);
        add(txt2);
        add(txt3);
        add(txt4);
        add(txt5);
        add(txt6);

        add(btn1);
        add(btn2);
        add(btn3);
        add(btn4);
    }
}
