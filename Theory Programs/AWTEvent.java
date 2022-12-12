import java.awt.*;
import java.awt.event.*;

public class AWTEvent extends Frame implements ActionListener {

    TextField txt;

    Label lbl;
    AWTEvent() {
        txt = new TextField(10);
        txt.setEditable(false);

        Button b = new Button("Click me");
        b.addActionListener(this);

        add(txt);
        add(b);
        
        setLayout(new FlowLayout());

        setSize(200, 100);
        setTitle("AWT Event");
        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        txt.setText("Welcome");
    }

    public static void main(String[] args) {
        new AWTEvent();
    }
}