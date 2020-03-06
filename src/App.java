import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class App {
    private JButton buttonMsg;
    private JPanel panelMain;
    private JTextField inputA;
    private JTextField inputB;
    private JComboBox baseSelectA;
    private JComboBox baseSelectB;
    private JComboBox operation;

    private App() {

        buttonMsg.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                process();
            }
        });
    }

    public static void app() {
        JFrame frame = new JFrame("ProgCalc");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        // frame.setSize(800,500);
        frame.setContentPane(new App().panelMain);
        frame.pack();
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }

    public void process() {
        if (operation.getSelectedItem().equals("Convert")) {
            convertBaseNumber();
        } else if (operation.getSelectedItem().equals("Add")) {
            // Implement
        } else if (operation.getSelectedItem().equals("Subtract")) {
            // Implement
        } else if (operation.getSelectedItem().equals("Multiply")) {
            // Implement
        } else if (operation.getSelectedItem().equals("Divide")) {
            // Implement
        }
    }

    public void convertBaseNumber() {
        String numberA = inputA.getText();
        String numberB = inputB.getText();
        String selectedA = baseSelectA.getSelectedItem().toString();
        String selectedB = baseSelectB.getSelectedItem().toString();
        String message = "";

        if (selectedA.equals("Decimal")) {
            if (selectedB.equals("Binary")) {
                inputB.setText(convert.decimalToBinary(numberA));
            } else if (selectedB.equals("Octal")) {
                inputB.setText(convert.decimalToOctal(numberA));
            } else if (selectedB.equals("Hexadecimal")) {
                inputB.setText(convert.decimalToHexidecimal(numberA));
            } else {
                inputB.setText(numberA);
            }
        } else if (selectedA.equals("Binary")) {
            String decimal = convert.binaryToDecimal(numberA);
            if (selectedB.equals("Binary")) {
                inputB.setText(convert.decimalToBinary(decimal));
            } else if (selectedB.equals("Octal")) {
                inputB.setText(convert.decimalToOctal(decimal));
            } else if (selectedB.equals("Hexadecimal")) {
                inputB.setText(convert.decimalToHexidecimal(decimal));
            } else {
                inputB.setText(decimal);
            }
        } else if (selectedA.equals("Octal")) {
            String decimal = convert.octalToDecimal(numberA);
            if (selectedB.equals("Binary")) {
                inputB.setText(convert.decimalToBinary(decimal));
            } else if (selectedB.equals("Octal")) {
                inputB.setText(convert.decimalToOctal(decimal));
            } else if (selectedB.equals("Hexadecimal")) {
                inputB.setText(convert.decimalToHexidecimal(decimal));
            } else {
                inputB.setText(decimal);
            }
        } else if (selectedA.equals("Hexadecimal")) {
            String decimal = convert.hexadecimalToDecimal(numberA);
            if (selectedB.equals("Binary")) {
                inputB.setText(convert.decimalToBinary(decimal));
            } else if (selectedB.equals("Octal")) {
                inputB.setText(convert.decimalToOctal(decimal));
            } else if (selectedB.equals("Hexadecimal")) {
                inputB.setText(convert.decimalToHexidecimal(decimal));
            } else {
                inputB.setText(decimal);
            }
        }

        //JOptionPane.showMessageDialog(null, message);
    }
}
