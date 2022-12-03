import java.awt.*;
import java.awt.event.*;

public class Calculator extends Frame implements ActionListener {
    TextField txt;
    Panel p;
    String btnString[] = {"7", "8", "9", "+",
    "4", "5", "6", "-",
    "1", "2", "3", "*",
    "C", "0", "=", "/"};
    Button btns[] = new Button[16];
    int num1 = 0, num2 = 0, res = 0;
    char operator;

    Calculator() {
        txt = new TextField(10);

        p = new Panel(new GridLayout(4, 4));
        
        add(txt, "North");
        add(p, "Center");
        
        for (int i = 0; i < btns.length; i++) {
            btns[i] = new Button(btnString[i]);
            btns[i].addActionListener(this);
            p.add(btns[i]);
        }
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String action = e.getActionCommand();

        if (action.equals("+")) {
            operator = '+';
            num1 = Integer.parseInt(txt.getText());
            txt.setText("");
        } else if (action.equals("-")) {
            operator = '-';
            num1 = Integer.parseInt(txt.getText());
            txt.setText("");
        } else if (action.equals("*")) {
            operator = '*';
            num1 = Integer.parseInt(txt.getText());
            txt.setText("");
        } else if (action.equals("/")) {
            operator = '/';
            num1 = Integer.parseInt(txt.getText());
            txt.setText("");
        } else if (action.equals("=")) {
            num2 = Integer.parseInt(txt.getText());
            switch (operator) {
                case '+':
                    res = num1 + num2;
                    break;
                case '-':
                    res = num1 - num2;
                    break;
                case '*':
                    res = num1 * num2;
                    break;
                case '/':
                    res = num1 / num2;
                    break;
            }

            txt.setText(res+"");
            res = 0;
        } else if (action.equals("C")) {
            txt.setText("");
            num1 = num2 = res = 0;
        } else {
            txt.setText(txt.getText() + action);
        }
    }

    public static void main(String[] args) {
        Calculator c = new Calculator();
        c.setTitle("Calculator");
        c.setSize(250, 300);
        c.setVisible(true);
    }
}
