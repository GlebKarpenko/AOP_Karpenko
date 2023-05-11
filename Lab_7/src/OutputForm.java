import java.awt.*;
import javax.swing.*;

public class OutputForm extends JFrame {

    TextField txt1, txt2;

    double P;
    double Area;

    OutputForm (double P, double Area){

        this.P = P;
        this.Area = Area;

        setTitle("Output form");
        setSize(400, 200);
        GridBagLayout g = new GridBagLayout();
        setLayout(g);
        GridBagConstraints gbc = new GridBagConstraints();
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        gbc.fill = GridBagConstraints.HORIZONTAL;
        gbc.ipadx = 100;
        gbc.gridx = 0;
        gbc.gridy = 0;
        txt1 = new TextField("Периметр трикутника: " + P);
        add(txt1, gbc);

        gbc.fill = GridBagConstraints.HORIZONTAL;
        gbc.ipadx = 100;
        gbc.gridx = 0;
        gbc.gridy = 1;
        txt2 = new TextField("Площа трикутника: " + Area);
        add(txt2, gbc);
    }
}
