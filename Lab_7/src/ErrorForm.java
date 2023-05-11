import java.awt.*;
import javax.swing.*;

public class ErrorForm extends JFrame{

    Label lbl1;

    ErrorForm(String errorMessage){

        setTitle("Error");
        setSize(300, 150);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        FlowLayout f = new FlowLayout();
        setLayout(f);

        lbl1 = new Label(errorMessage);
        add(lbl1);
    }
}
