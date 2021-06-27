package Javaproject;

import java.awt.*;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class covidprediction extends JFrame implements ActionListener {

    JFrame frame = new JFrame();
    Container container = getContentPane();

    JCheckBox coughcheckbox = new JCheckBox("   Cough");
    JCheckBox fevercheckbox = new JCheckBox("   Fever");
    JCheckBox sorethroatcheckbox = new JCheckBox("   Sore Throat");
    JCheckBox shortbreathcheckbox = new JCheckBox("   Shortbreath");
    JCheckBox headachecheckbox = new JCheckBox("   Headache");

    JLabel travelhistorylabel = new JLabel("Travel History");
    JCheckBox travelhistory0 = new JCheckBox(" No Travel history");
    JCheckBox travelhistory1 = new JCheckBox(" Travelled Abroad");
    JCheckBox travelhistory2 = new JCheckBox(" Came in Contacht with covid positive patient");
    // JSpinner //travelhistoryspinner =new JSpinner();

    JLabel resultlabel = new JLabel(" RESULT :");

    // JLabel userLabel = new JLabel("USERNAME");
    JLabel titleLable = new JLabel("COVID PREDICTOR");
    // JLabel passwordLabel = new JLabel("PASSWORD");
    // JTextField userTextField = new JTextField();
    // JPasswordField passwordField = new JPasswordField();
    JButton calculateButton = new JButton("CALCULATE");
    JButton clearButton = new JButton("CLEAR");
    // JCheckBox showPassword = new JCheckBox("Show Password");

    public covidprediction() {
        frame.setTitle("COVID PREDICTOR");
        frame.setVisible(true);
        frame.setBounds(100, 100, 750, 850);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        frame.setResizable(false);

        frame.add(container);

        setLayoutManager();
        setLocationAndSize();
        addComponentsToContainer();
        addActionEvent();

    }

    public void setLayoutManager() {
        container.setLayout(null);
    }

    public void setLocationAndSize() {
        titleLable.setBounds(220, 50, 500, 100);
        titleLable.setFont(new Font("Serif", Font.PLAIN, 40));

        coughcheckbox.setBounds(270, 150, 250, 50);
        fevercheckbox.setBounds(270, 200, 250, 50);
        sorethroatcheckbox.setBounds(270, 250, 250, 50);
        headachecheckbox.setBounds(270, 300, 250, 50);
        shortbreathcheckbox.setBounds(270, 350, 250, 50);
        // travelhistoryspinner.setBounds(270, 400, 50, 30);
        travelhistorylabel.setBounds(270, 400, 150, 30);
        travelhistory0.setBounds(300, 450, 150, 30);
        travelhistory1.setBounds(300, 480, 150, 30);
        travelhistory2.setBounds(300, 510, 150, 30);

        coughcheckbox.setFont(new Font("Serif", Font.PLAIN, 20));
        fevercheckbox.setFont(new Font("Serif", Font.PLAIN, 20));
        sorethroatcheckbox.setFont(new Font("Serif", Font.PLAIN, 20));
        headachecheckbox.setFont(new Font("Serif", Font.PLAIN, 20));
        shortbreathcheckbox.setFont(new Font("Serif", Font.PLAIN, 20));
        travelhistorylabel.setFont(new Font("Serif", Font.PLAIN, 20));

        // userLabel.setBounds(270, 200, 100, 30);
        // passwordLabel.setBounds(270, 270, 100, 30);
        // userTextField.setBounds(370, 200, 150, 30);
        // passwordField.setBounds(370, 270, 150, 30);
        // showPassword.setBounds(370, 300, 150, 30);
        calculateButton.setBounds(230, 550, 120, 30);
        clearButton.setBounds(380, 550, 100, 30);

        resultlabel.setBounds(200, 650, 200, 50);
        resultlabel.setFont(new Font("Serif", Font.PLAIN, 30));

    }

    public void addComponentsToContainer() {
        container.add(coughcheckbox);
        container.add(fevercheckbox);
        container.add(sorethroatcheckbox);
        container.add(headachecheckbox);
        container.add(shortbreathcheckbox);
        // container.add(//travelhistoryspinner);
        container.add(travelhistorylabel);
        // container.add(userLabel);
        container.add(titleLable);
        // container.add(passwordLabel);
        // container.add(userTextField);
        // container.add(passwordField);
        // container.add(showPassword);
        container.add(travelhistory0);
        container.add(travelhistory1);
        container.add(travelhistory2);
        container.add(calculateButton);
        container.add(clearButton);

        container.add(resultlabel);
    }

    public void addActionEvent() {
        calculateButton.addActionListener(this);
        clearButton.addActionListener(this);
        // showPassword.addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        // Coding Part of LOGIN button
        if (e.getSource() == calculateButton) {

            int cough;
            int fever = 0;
            int sore_throat = 0;

            int shortness_of_breath = 0;
            int head_ache = 0;
            int gender = 0;
            int travel_history = 0;

            if(coughcheckbox.isSelected())
            {
                cough =1;
            }
            if(fevercheckbox.isSelected())
            {
                fever =1;
            }
            if(sorethroatcheckbox.isSelected())
            {
                sore_throat =1;
            }
            if(shortbreathcheckbox.isSelected())
            {
                shortness_of_breath =1;
            }
            if(headachecheckbox.isSelected())
            {
                head_ache =1;
            }

            if(travelhistory0.isSelected())
            {
                travelhistory1.setSelected(false);
                travelhistory2.setSelected(false);
                
            }
            if(travelhistory1.isSelected())
            {
                travelhistory0.setSelected(false);
                travelhistory2.setSelected(false);
                
            }
            if(travelhistory2.isSelected())
            {
                travelhistory0.setSelected(false);
                travelhistory2.setSelected(false);
                
            }


            if(travelhistory0.isSelected())
            {
               travel_history =0;
               
            }
            else if(travelhistory1.isSelected())
            {
                travel_history=1;
            }
            else if(travelhistory2.isSelected())
            {
                travel_history=2;
            }



            // String userText;
            // String pwdText;
            // userText = userTextField.getText();
            // pwdText = passwordField.getText().toString();
            // // && passwordField.getText().equalsIgnoreCase("12345")
            // if (userText.equalsIgnoreCase("mehtab") && pwdText.equalsIgnoreCase("12345"))
            // {
            // JOptionPane.showMessageDialog(this, "Login Successful");

            // dispose();

            // } else {
            // JOptionPane.showMessageDialog(this, "Invalid Username or Password");

            // }

        }
        // //Coding Part of RESET button
        if (e.getSource() == clearButton) {
            coughcheckbox.setSelected(false);
            fevercheckbox.setSelected(false);
            headachecheckbox.setSelected(false);
            shortbreathcheckbox.setSelected(false);
            sorethroatcheckbox.setSelected(false);
            travelhistory0.setSelected(false);
            travelhistory1.setSelected(false);
            travelhistory2.setSelected(false);

        }

       
        // //Coding Part of showPassword JCheckBox
        // if (e.getSource() == showPassword) {
        // if (showPassword.isSelected()) {
        // passwordField.setEchoChar((char) 0);
        // } else {
        // passwordField.setEchoChar('*');
        // }

        // }
    }

    public static void main(String[] args) {

        covidprediction obj = new covidprediction();
        // JFrame frame;
        // frame= new JFrame("covid predictor");
        // covidprediction frame = new covidprediction();

    }

}
