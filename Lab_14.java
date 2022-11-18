import java.awt.*;
import java.awt.event.*;

public class Lab_14 extends Frame implements ActionListener {

    TextField txtInput;
    Panel panel;

    String btnLString[] = { "7", "8", "9", "+", "4", "5", "6", "-", "1", "2", "3", "*", "C", "0", "=", "/" };

    int num1 = 0, num2 = 0, res;
    Button btn[] = new Button[btnLString.length];
    char operation;

    public Lab_14() {
        txtInput = new TextField(10);

        panel = new Panel();

        add(txtInput, "North");
        add(panel, "Center");

        panel.setLayout(new GridLayout(4, 4));

        for (int i = 0; i < btnLString.length; i++) {
            btn[i] = new Button(btnLString[i]);
            btn[i].addActionListener(this);
            panel.add(btn[i]);
        }

        addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String str = e.getActionCommand();
        System.out.println(str);
        if (str.equals("+")) {
            operation = '+';
            num1 = Integer.parseInt(txtInput.getText());
            txtInput.setText("");
        } else if (str.equals("-")) {
            operation = '-';
            num1 = Integer.parseInt(txtInput.getText());
            txtInput.setText("");
        } else if (str.equals("*")) {
            operation = '*';
            num1 = Integer.parseInt(txtInput.getText());
            txtInput.setText("");
        } else if (str.equals("/")) {
            operation = '/';
            num1 = Integer.parseInt(txtInput.getText());
            txtInput.setText("");
        } else if (str.equals("=")) {
            num2 = Integer.parseInt(txtInput.getText());

            switch (operation) {
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
                default:
                    System.out.println("ERROR");
                    break;
            }
            txtInput.setText(res + "");
            res = 0;
        } else if(str.equals("C")) {
            txtInput.setText("");
            num1 = num2 = res = 0;
        } else {
            txtInput.setText(txtInput.getText() + str);
        }
    }

    public static void main(String[] args) {
        Lab_14 calc = new Lab_14();
        calc.setTitle("RIR Calc");
        calc.setSize(250, 300);
        calc.setVisible(true);
    }
}
