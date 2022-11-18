import java.awt.*;
import java.awt.event.*;
import javax.swing.*;


public class Lab_15 extends JFrame {

    int count = 0;
    boolean countUp = true;
    int step = 1;

    public Lab_15() {
        Container c = getContentPane();
        c.setLayout(new FlowLayout());

        c.add(new JLabel("Counter:"));

        JTextField txtCount = new JTextField("0", 5);
        txtCount.setEditable(false);
        c.add(txtCount);

        JRadioButton rBtnUp = new JRadioButton("Up", true);
        c.add(rBtnUp);
        rBtnUp.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                countUp = true;                
            }
        });

        JRadioButton rBtnDown = new JRadioButton("Down", false);
        c.add(rBtnDown);
        rBtnDown.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                countUp = false;
            }
        });

        ButtonGroup rBtns = new ButtonGroup();
        rBtns.add(rBtnUp);
        rBtns.add(rBtnDown);

        c.add(new JLabel("Step: "));

        Integer steps[] = {1, 2, 3, 4, 5};
        JComboBox<Integer> comboCnt = new JComboBox<>(steps);
        comboCnt.setPreferredSize(new Dimension(60, 20));
        c.add(comboCnt);

        comboCnt.addItemListener(new ItemListener() {

            @Override
            public void itemStateChanged(ItemEvent e) {
                if(e.getStateChange() == ItemEvent.SELECTED) {
                    step = (Integer)comboCnt.getSelectedItem();
                }
            }
        });

        JButton btnCnt = new JButton("Count");
        c.add(btnCnt);
        btnCnt.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(countUp) {
                    count += step;
                } else {
                    count -= step;
                }
                txtCount.setText(count + "");
            }
        });

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setTitle("Counter");
        setSize(480, 100);
        setVisible(true);
    }

    public static void main(String[] args) {
        new Lab_15();
    }
}