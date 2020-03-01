import javax.swing.*;

class gui {
    public static void menu() {
        // Testing
        JFrame frame = new JFrame("ProgCalc");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300,300);
        JButton button1 = new JButton("Calculate");
        frame.getContentPane().add(button1);
        frame.setVisible(true);
    }
}
