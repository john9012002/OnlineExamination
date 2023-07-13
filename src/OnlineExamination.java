import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class OnlineExamination extends JFrame implements ActionListener {
    private JTextField usernameField;
    private JPasswordField passwordField;
    private JButton loginButton;
    private JButton updateProfileButton;
    private JButton selectAnswersButton;
    private JButton writeAnswersButton;
    private JButton closeSessionButton;
    private JButton logoutButton;

    public OnlineExamination() {
        setTitle("Online Examination");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new GridLayout(7, 1));

        // Login
        JPanel loginPanel = new JPanel(new FlowLayout());
        JLabel usernameLabel = new JLabel("Username:");
        usernameField = new JTextField(20);
        JLabel passwordLabel = new JLabel("Password:");
        passwordField = new JPasswordField(20);
        loginButton = new JButton("Login");
        loginButton.addActionListener(this);
        loginPanel.add(usernameLabel);
        loginPanel.add(usernameField);
        loginPanel.add(passwordLabel);
        loginPanel.add(passwordField);
        loginPanel.add(loginButton);
        add(loginPanel);

        // Update Profile and Password
        JPanel updateProfilePanel = new JPanel(new FlowLayout());
        updateProfileButton = new JButton("Update Profile and Password");
        updateProfileButton.addActionListener(this);
        updateProfilePanel.add(updateProfileButton);
        add(updateProfilePanel);

        // Selecting answers for MCQs
        JPanel selectAnswersPanel = new JPanel(new FlowLayout());
        selectAnswersButton = new JButton("Select Answers for MCQs");
        selectAnswersButton.addActionListener(this);
        selectAnswersPanel.add(selectAnswersButton);
        add(selectAnswersPanel);

        // Writing Answers to questions
        JPanel writeAnswersPanel = new JPanel(new FlowLayout());
        writeAnswersButton = new JButton("Write Answers to Questions");
        writeAnswersButton.addActionListener(this);
        writeAnswersPanel.add(writeAnswersButton);
        add(writeAnswersPanel);

        // Closing session
        JPanel closeSessionPanel = new JPanel(new FlowLayout());
        closeSessionButton = new JButton("Close Session");
        closeSessionButton.addActionListener(this);
        closeSessionPanel.add(closeSessionButton);
        add(closeSessionPanel);

        // Logout
        JPanel logoutPanel = new JPanel(new FlowLayout());
        logoutButton = new JButton("Logout");
        logoutButton.addActionListener(this);
        logoutPanel.add(logoutButton);
        add(logoutPanel);

        pack();
        setLocationRelativeTo(null);
        setVisible(true);
    }

    public static void main(String[] args) {
        new OnlineExamination();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == loginButton) {
            login();
        } else if (e.getSource() == updateProfileButton) {
            updateProfile();
        } else if (e.getSource() == selectAnswersButton) {
            selectAnswers();
        } else if (e.getSource() == writeAnswersButton) {
            writeAnswers();
        } else if (e.getSource() == closeSessionButton) {
            closeSession();
        } else if (e.getSource() == logoutButton) {
            logout();
        }
    }

    private void login() {
        String username = usernameField.getText();
        char[] password = passwordField.getPassword();
        // Perform login authentication logic here
        JOptionPane.showMessageDialog(this, "Login successful!");
    }

    private void updateProfile() {
        // Open a new window or dialog to update profile and password
        JOptionPane.showMessageDialog(this, "Profile and password updated successfully!");
    }

    private void selectAnswers() {
        // Open a new window or dialog to select answers for MCQs
        JOptionPane.showMessageDialog(this, "Answers for MCQs selected successfully!");
    }

    private void writeAnswers() {
        // Open a new window or dialog to write answers to questions
        JOptionPane.showMessageDialog(this, "Answers to questions written successfully!");
    }

    private void closeSession() {
        // Perform closing session logic here
        JOptionPane.showMessageDialog(this, "Session closed successfully!");
    }

    private void logout() {
        // Perform logout logic here
        JOptionPane.showMessageDialog(this, "Logout successful!");
    }
}