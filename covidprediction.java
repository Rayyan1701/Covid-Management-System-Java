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

    JProgressBar progressbar =new JProgressBar();

    JLabel resultlabel = new JLabel(" RESULT :");
    JLabel probabilityresult =new JLabel(" Probability of having Covid-19 : ");
    JLabel warninglabel =new JLabel(" please get tested ASAP as u have high changes of being covid infected right now");

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
        travelhistory2.setBounds(300, 510, 200, 30);

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

        progressbar.setBounds(230, 590, 250, 30);
        progressbar.setValue(0);
        progressbar.setStringPainted(true);

        resultlabel.setBounds(200, 650, 200, 50);
        resultlabel.setFont(new Font("Serif", Font.PLAIN, 30));

        probabilityresult.setBounds(200, 700, 300, 50);

        warninglabel.setBounds(200, 750, 400, 50);;

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

        container.add(progressbar);

        container.add(resultlabel);
        resultlabel.setVisible(false);

        container.add(probabilityresult);
        probabilityresult.setVisible(false);

        container.add(warninglabel);
        warninglabel.setVisible(false);
    }

    public void addActionEvent() {
        calculateButton.addActionListener(this);
        clearButton.addActionListener(this);
        // showPassword.addActionListener(this);
    }

    void progressbarfunction()
    {
        int i = 0;
        try {
            progressbar.setValue(i);
            while (i <= 100) {
                // fill the menu bar
                progressbar.setValue(i + 10);
 
                // delay the thread
                Thread.sleep(500);
                i += 20;
            }
        }
        catch (Exception e) {
        }
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        // Coding Part of LOGIN button
        if (e.getSource() == calculateButton) {

            int cough=0;
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

            progressbarfunction();

            resultlabel.setVisible(true);

            double i=0.0;
             i=(0.04285044*cough)+(0.00539787*fever)+(0.01902055*sore_throat)+(0.09647643*shortness_of_breath)+(0.09647643*head_ache)+(-0.04837609*gender)+(0.34*travel_history);
    
             probabilityresult.setVisible(true);
             probabilityresult.setText(" Probability of having Covid-19 : "+ i);
             if(i>0.5)
             {
                 warninglabel.setVisible(true);

             }
             else
             {
                 warninglabel.setText("Your chances of having covid is Low");
                 warninglabel.setVisible(true);
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

            resultlabel.setVisible(false);

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
