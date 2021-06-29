package Javaproject;

import java.awt.*;
import javax.swing.*;
import java.util.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Login {
    public static void main(String[] a) {
        LoginFrame frame = new LoginFrame();
        frame.setTitle("Login Form");
        frame.setVisible(true);
        frame.setBounds(100, 100, 750, 800);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        frame.setResizable(false);

    }

}

class LoginFrame extends JFrame implements ActionListener {

    public String userText;
    public String pwdText;

    Container container = getContentPane();
    JLabel userLabel = new JLabel("USERNAME");
    JLabel titleLable = new JLabel("COVID MANAGEMENT SYSTEM");
    JLabel passwordLabel = new JLabel("PASSWORD");
    JTextField userTextField = new JTextField();
    JPasswordField passwordField = new JPasswordField();
    JButton loginButton = new JButton("LOGIN");
    JButton resetButton = new JButton("RESET");
    JCheckBox showPassword = new JCheckBox("Show Password");
    JButton loginasgeneralbutton = new JButton("LOGIN as General User");

    Map<String, String> username_password_map = new HashMap<>();

    LoginFrame() {

        setLayoutManager();
        setLocationAndSize();
        addComponentsToContainer();
        addActionEvent();

        username_password_map.putIfAbsent("Rayyan", "Rayyan1234%");
        username_password_map.putIfAbsent("kushal", "kushal1234%");
        username_password_map.putIfAbsent("BMS HOSPITAL", "bms1234%");
        username_password_map.putIfAbsent("Aster RV Hospital", "Aster1234%");
        username_password_map.putIfAbsent("BANGALORE BAPTIST HOSPITAL", "bangalore1234%");
        username_password_map.putIfAbsent("Appolo Hospital", "Appolo1234%");
        username_password_map.putIfAbsent("BGS GLOBAL HOSPITAL", "bgs1234%");
        username_password_map.putIfAbsent("Bhagwan Mahaveer Jain Hospital", "bhagwan1234%");

    }

    public void setLayoutManager() {
        container.setLayout(null);
    }

    public void setLocationAndSize() {
        titleLable.setBounds(180, 50, 500, 100);
        titleLable.setFont(new Font("Serif", Font.PLAIN, 30));

        userLabel.setBounds(270, 200, 100, 30);
        passwordLabel.setBounds(270, 270, 100, 30);
        userTextField.setBounds(370, 200, 150, 30);
        passwordField.setBounds(370, 270, 150, 30);
        showPassword.setBounds(370, 300, 150, 30);
        loginButton.setBounds(270, 350, 100, 30);
        resetButton.setBounds(420, 350, 100, 30);
        loginasgeneralbutton.setBounds(270, 400, 250, 30);

    }

    public void addComponentsToContainer() {
        container.add(userLabel);
        container.add(titleLable);
        container.add(passwordLabel);
        container.add(userTextField);
        container.add(passwordField);
        container.add(showPassword);
        container.add(loginButton);
        container.add(resetButton);
        container.add(loginasgeneralbutton);
    }

    public void addActionEvent() {
        loginButton.addActionListener(this);
        resetButton.addActionListener(this);
        showPassword.addActionListener(this);
        loginasgeneralbutton.addActionListener(this);
    }

    Boolean user_passwordmatched(String user, String pwd)
    {
        for(Map.Entry<String,String> e: username_password_map.entrySet())
        {
            if(e.getKey().equalsIgnoreCase(user) && e.getValue().equalsIgnoreCase(pwd))
            {
                return true;
            }
        }
        return false;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        // Coding Part of LOGIN button
        if (e.getSource() == loginButton) {

            userText = userTextField.getText();
            pwdText = passwordField.getText().toString();
            // && passwordField.getText().equalsIgnoreCase("12345")
            // if (userText.equalsIgnoreCase("mehtab") && pwdText.equalsIgnoreCase("12345"))
            if (username_password_map.containsKey(userText) && user_passwordmatched(userText,pwdText)) {
                
                    JOptionPane.showMessageDialog(this, "Login Successful");

                new homepage(userText);
                // covidprediction obj = new covidprediction();
                // dispose();
                this.setVisible(false);
                

            } else {
                JOptionPane.showMessageDialog(this, "Invalid Username or Password");

            }

        }
        // Coding Part of RESET button
        if (e.getSource() == resetButton) {
            userTextField.setText("");
            passwordField.setText("");
        }
        // Coding Part of showPassword JCheckBox
        if (e.getSource() == showPassword) {
            if (showPassword.isSelected()) {
                passwordField.setEchoChar((char) 0);
            } else {
                passwordField.setEchoChar('*');
            }

        }

        if(e.getSource()== loginasgeneralbutton)
        {
            userText = "user";
            new homepage(userText);
            // covidprediction obj = new covidprediction();
            // dispose();
            this.setVisible(false);

        }
    }

}
