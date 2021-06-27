package Javaproject;

import java.awt.*;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class homepage extends JFrame implements ActionListener 
{
    String username;
    JFrame frame = new JFrame("Home Page");
    Container container = getContentPane();
    JLabel Titlelabel = new JLabel("COVID MANAGEMENT SYSTEM");
    JLabel welcomelabel = new JLabel("WELCOME ");
    JButton HospitalbedButton = new JButton(" Hospital Bed ");
    JButton covidpredictorButton = new JButton(" Covid predictior ");
    JButton logoutbutton = new JButton(" <-LogOut ");
    
    public homepage(String user)
    {
        username =user;
        frame.setTitle("HOME PAGE");
        frame.setVisible(true);
       // frame.setBounds(100, 100, 750, 850);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.add(container);

        setLayoutManager();
        setLocationAndSize();
        addComponentsToContainer();
        addActionEvent();
    }

    public void setLayoutManager()
    {
        container.setLayout(null);
    }

    public void setLocationAndSize()
    {
        Titlelabel.setBounds(300, 40, 1000, 100);
        Titlelabel.setFont(new Font("Serif", Font.BOLD, 60));

        welcomelabel.setBounds(600, 170, 800, 60);
        welcomelabel.setText("Welcome " + username);
        welcomelabel.setFont(new Font("Serif", Font.PLAIN, 40));

        HospitalbedButton.setBounds(410,300,300,200);
        
        covidpredictorButton.setBounds(790, 300, 300, 200);

        logoutbutton.setBounds(1400, 30, 100, 30);

    }

    public void addComponentsToContainer()
    {
        container.add(Titlelabel);
        container.add(welcomelabel);
        container.add(HospitalbedButton);
        container.add(covidpredictorButton);
        container.add(logoutbutton);

    }

    public void addActionEvent()
    {
       HospitalbedButton.addActionListener(this);
        covidpredictorButton.addActionListener(this);
        logoutbutton.addActionListener(this);

    }
    @Override
    public void actionPerformed(ActionEvent e)
    {
        if(e.getSource()==HospitalbedButton)
        {
            

        }
        if(e.getSource()==covidpredictorButton)
        {
            frame.setVisible(false);
            new covidprediction(username);
            //dispose();
            

        }
        if(e.getSource() == logoutbutton)
        {
            
            LoginFrame frame1 =new LoginFrame();
            frame1.setTitle("Login Form");
            frame1.setVisible(true);
            frame1.setBounds(100, 100, 750, 800);
            frame1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            
            
            frame1.setResizable(false);
            
            
            frame.setVisible(false);
            //dispose();
            
        }
        

    }

    public static void main(String[] args) {

        homepage obj = new homepage("Rayyan ");
        // JFrame frame;
        // frame= new JFrame("covid predictor");
        // covidprediction frame = new covidprediction();

    }


    
}
