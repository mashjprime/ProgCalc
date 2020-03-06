import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class App {
    private JButton buttonMsg;
    private JPanel panelMain;
    private JTextField input;
    private JComboBox baseSelect;

    String[] baseNumbers = new String[] {"Decimal, Binary, Octal, Hexadecimal"};

    private App() {
        baseSelect.addItem("Decimal");
        baseSelect.addItem("Binary");
        baseSelect.addItem("Octal");
        baseSelect.addItem("Hexadecimal");

        buttonMsg.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                convertBaseNumber();
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

    public void convertBaseNumber() {
        String number = input.getText();
        String selected = baseSelect.getSelectedItem().toString();
        String message = "";

        if (selected.equals("Decimal")) {
            message += ("\nBinary: " + convert.decimalToBinary(number));
            message += ("\nOctal: " + convert.decimalToOctal(number));
            message += ("\nHexadecimal: " + convert.decimalToHexidecimal(number));
        } else if (selected.equals("Binary")) {
            String decimal = convert.binaryToDecimal(number);
            message += ("\nDecimal: " + decimal);
            message += ("\nOctal: " + convert.decimalToOctal(decimal));
            message += ("\nHexadecimal: " + convert.decimalToHexidecimal(decimal ));
        } else if (selected.equals("Octal")) {
            String decimal = convert.octalToDecimal(number);
            message += ("\nDecimal: " + decimal);
            message += ("\nBinary: " + convert.decimalToBinary(decimal));
            message += ("\nHexadecimal: " + convert.decimalToHexidecimal(decimal));
        } else if (selected.equals("Hexadecimal")) {
            String decimal = convert.hexadecimalToDecimal(number);
            message += ("\nDecimal: " + decimal);
            message += ("\nBinary: " + convert.decimalToBinary(decimal));
            message += ("\nOctal: " + convert.decimalToOctal(decimal));
        } else {
            message += "No base selected";
        }


        JOptionPane.showMessageDialog(null, message);
    }
}
