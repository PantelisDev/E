import javax.swing.*;
public class MainWindow extends JFrame {

	public static void main(String[] args) {
		
		JFrame jFrame = new JFrame("Login");
        jFrame.setBounds(0, 0, 190, 140);
        jFrame.setLocationRelativeTo(null);
        jFrame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        jFrame.setResizable(true);

        JPanel panel = new JPanel();
        panel.setLayout(null);

        JLabel userLabel = new JLabel("Username");
        userLabel.setBounds(10, 10, 80, 20);
        JTextField userField = new JTextField();
        userField.setBounds(80, 10, 80, 20);

        JLabel passLabel = new JLabel("Password");
        passLabel.setBounds(10, 40, 80, 20);
        JPasswordField passField = new JPasswordField();
        passField.setBounds(80, 40, 80, 20);

        JButton submitButton = new JButton("Submit");
        submitButton.setBounds(40, 70, 90, 20);

        panel.add(userLabel);
        panel.add(userField);
        panel.add(passLabel);
        panel.add(passField);
        panel.add(submitButton);

        jFrame.setContentPane(panel);
        jFrame.setVisible(true);
    }
	
		

}


