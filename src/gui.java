import javax.swing.*;

class gui {
    public static void menu() {
        JFrame frame = new JFrame("My First GUI");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300,300);
        JButton button1 = new JButton("Button 1");
        frame.getContentPane().add(button1);
        frame.setVisible(true);

    }
}
