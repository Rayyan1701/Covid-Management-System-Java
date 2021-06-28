package Javaproject;

import java.awt.*;
import javax.swing.*;
import javax.swing.border.Border;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class MyGridLayout extends JFrame implements ActionListener {

    JFrame f;
    JPanel panel;
    JLabel label1, label2, label3, label4, label5, label6;
    JLabel bedtitlelabel = new JLabel(" BEDS AVAILABILITY IN BANGALORE CITY ");
    JLabel hospitalnames[] = new JLabel[6];
    JLabel hospitaladdress[] = new JLabel[6];
    JLabel bedavailabilitylabel[] = new JLabel[6];
    Integer numberofbeds[] = new Integer[6];
    JButton gobackbutton = new JButton(" <-GoBack ");
    String username;

    MyGridLayout(String user) {
        
        username =user;

        f = new JFrame("COVID BED'S PAGE");
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        panel = new JPanel();
        panel.setBounds(280, 120, 1000, 600);
        panel.setBackground(Color.gray);
      

        numberofbeds[0]= Integer.valueOf(10);
        numberofbeds[1]=Integer.valueOf(58);
        numberofbeds[2]=Integer.valueOf(102);
        numberofbeds[3]=Integer.valueOf(10);
        numberofbeds[4]=Integer.valueOf(10);
        numberofbeds[5]=Integer.valueOf(10);

        addcomponentstoframe();
        setsizeframecomponets();

        addcomponentstopanel();
        setsizesinpanel();

        f.add(panel);
        f.setSize(400, 400);
        f.setLayout(null);
        f.setVisible(true);


        gobackbutton.addActionListener(this);

       

    }

    void addcomponentstoframe() {
        f.add(bedtitlelabel);
        f.add(gobackbutton);

    }

    void setsizeframecomponets() {
        bedtitlelabel.setBounds(480, 20, 800, 100);
        bedtitlelabel.setFont(new Font("Serif", Font.PLAIN, 30));

        gobackbutton.setBounds(60, 60, 100, 50);

    }

    void addhospitalnametolables()
        {
            hospitalnames[0]= new JLabel("BMS HOSPITAL");
            hospitalnames[0].setBounds(20, 20, 400, 50);
            hospitalnames[0].setBackground(Color.red);
            hospitalnames[0].setFont(new Font("Serif", Font.BOLD, 25));
            hospitalnames[0].setHorizontalAlignment(JLabel.CENTER);
            label1.add(hospitalnames[0]);
            hospitaladdress[0] = new JLabel("<html>No 618, Sri Mallikarjuna Swamy, Gangamma Temple St,<br/> NR Colony, Bengaluru, Karnataka 560019</html>");
            hospitaladdress[0].setBounds(20, 50, 450, 50);
            hospitaladdress[0].setFont(new Font("Serif", Font.PLAIN, 15));
            hospitaladdress[0].setHorizontalAlignment(JLabel.CENTER);
            label1.add(hospitaladdress[0]);
            bedavailabilitylabel[0]= new JLabel(" BED'S AVAILABLE : "+ numberofbeds[0]);
            bedavailabilitylabel[0].setBounds(15, 100, 450, 50);
            bedavailabilitylabel[0].setFont(new Font("Serif", Font.PLAIN, 20));
            bedavailabilitylabel[0].setHorizontalAlignment(JLabel.CENTER);
            label1.add(bedavailabilitylabel[0]);


            hospitalnames[1]= new JLabel("Aster RV Hospital");
            hospitalnames[1].setBounds(20, 20, 400, 50);
            hospitalnames[1].setBackground(Color.red);
            hospitalnames[1].setFont(new Font("Serif", Font.BOLD, 25));
            hospitalnames[1].setHorizontalAlignment(JLabel.CENTER);
            label2.add(hospitalnames[1]);
            hospitaladdress[1] = new JLabel("<html>CA-37, 24th Main Rd, ITI Layout, 1st Phase, J. P. Nagar, Bengaluru,<br/>Karnataka 560078, India. Phone -080660 40400</html>");
            hospitaladdress[1].setBounds(20, 50, 450, 50);
            hospitaladdress[1].setFont(new Font("Serif", Font.PLAIN, 15));
            hospitaladdress[1].setHorizontalAlignment(JLabel.CENTER);
            label2.add(hospitaladdress[1]);
            bedavailabilitylabel[1]= new JLabel(" BED'S AVAILABLE : "+ numberofbeds[1]);
            bedavailabilitylabel[1].setBounds(15, 100, 450, 50);
            bedavailabilitylabel[1].setFont(new Font("Serif", Font.PLAIN, 20));
            bedavailabilitylabel[1].setHorizontalAlignment(JLabel.CENTER);
            label2.add(bedavailabilitylabel[1]);

            hospitalnames[2]= new JLabel("BANGALORE BAPTIST HOSPITAL");
            hospitalnames[2].setBounds(20, 20, 420, 50);
            hospitalnames[2].setBackground(Color.red);
            hospitalnames[2].setFont(new Font("Serif", Font.BOLD, 25));
            hospitalnames[2].setHorizontalAlignment(JLabel.CENTER);
            label3.add(hospitalnames[2]);
            hospitaladdress[2] = new JLabel("<html>Bellary Rd, Vinayakanagar, Hebbal, Bengaluru, Karnataka 560024, India<br/> Phone -080 2202 4700</html>");
            hospitaladdress[2].setBounds(20, 50, 450, 50);
            hospitaladdress[2].setFont(new Font("Serif", Font.PLAIN, 15));
            hospitaladdress[2].setHorizontalAlignment(JLabel.CENTER);
            label3.add(hospitaladdress[2]);
            bedavailabilitylabel[2]= new JLabel(" BED'S AVAILABLE : "+ numberofbeds[2]);
            bedavailabilitylabel[2].setBounds(15, 100, 450, 50);
            bedavailabilitylabel[2].setFont(new Font("Serif", Font.PLAIN, 20));
            bedavailabilitylabel[2].setHorizontalAlignment(JLabel.CENTER);
            label3.add(bedavailabilitylabel[2]);


            hospitalnames[3]= new JLabel("<html>BANGALORE INSTITUTE OF<br/>     GASTROENTEROLOGY</html>");
            hospitalnames[3].setBounds(20, 20, 420, 50);
            hospitalnames[3].setBackground(Color.red);
            hospitalnames[3].setFont(new Font("Serif", Font.BOLD, 20));
            hospitalnames[3].setHorizontalAlignment(JLabel.CENTER);
            label4.add(hospitalnames[3]);
            hospitaladdress[3] = new JLabel("<html>13/3 & 4, T Mariappa Rd, 2nd Block, Jaya Nagar East, Jayanagar,<br/> Bengaluru, Karnataka 560011, India</html>");
            hospitaladdress[3].setBounds(20, 60, 450, 50);
            hospitaladdress[3].setFont(new Font("Serif", Font.PLAIN, 15));
            hospitaladdress[3].setHorizontalAlignment(JLabel.CENTER);
            label4.add(hospitaladdress[3]);
            numberofbeds[3]=40;
            bedavailabilitylabel[3]= new JLabel(" BED'S AVAILABLE : "+ numberofbeds[3]);
            bedavailabilitylabel[3].setBounds(15, 100, 450, 50);
            bedavailabilitylabel[3].setFont(new Font("Serif", Font.PLAIN, 20));
            bedavailabilitylabel[3].setHorizontalAlignment(JLabel.CENTER);
            label4.add(bedavailabilitylabel[3]);

            hospitalnames[4]= new JLabel("BGS GLOBAL HOSPITAL");
            hospitalnames[4].setBounds(20, 20, 420, 50);
            hospitalnames[4].setBackground(Color.red);
            hospitalnames[4].setFont(new Font("Serif", Font.BOLD, 20));
            hospitalnames[4].setHorizontalAlignment(JLabel.CENTER);
            label5.add(hospitalnames[4]);
            hospitaladdress[4] = new JLabel("<html>67, Uttarahalli Main Rd, Sunkalpalya, Bengaluru, Karnataka 560060, India<br/> phone : 080 2625 5555</html>");
            hospitaladdress[4].setBounds(20, 60, 450, 50);
            hospitaladdress[4].setFont(new Font("Serif", Font.PLAIN, 15));
            hospitaladdress[4].setHorizontalAlignment(JLabel.CENTER);
            label5.add(hospitaladdress[4]);
            numberofbeds[4]=23;
            bedavailabilitylabel[4]= new JLabel(" BED'S AVAILABLE : "+ numberofbeds[4]);
            bedavailabilitylabel[4].setBounds(15, 100, 450, 50);
            bedavailabilitylabel[4].setFont(new Font("Serif", Font.PLAIN, 20));
            bedavailabilitylabel[4].setHorizontalAlignment(JLabel.CENTER);
            label5.add(bedavailabilitylabel[4]);

            hospitalnames[5]= new JLabel("Bhagwan Mahaveer Jain Hospital");
            hospitalnames[5].setBounds(20, 20, 420, 50);
            hospitalnames[5].setBackground(Color.red);
            hospitalnames[5].setFont(new Font("Serif", Font.BOLD, 20));
            hospitalnames[5].setHorizontalAlignment(JLabel.CENTER);
            label6.add(hospitalnames[5]);
            hospitaladdress[5] = new JLabel("<html>17, Millers Rd, Kaverappa Layout, Vasanth Nagar, Bengaluru,<br/>Karnataka 560052, India phone : 080 4087 5500</html>");
            hospitaladdress[5].setBounds(20, 60, 450, 50);
            hospitaladdress[5].setFont(new Font("Serif", Font.PLAIN, 15));
            hospitaladdress[5].setHorizontalAlignment(JLabel.CENTER);
            label6.add(hospitaladdress[5]);
            numberofbeds[5]=4;
            bedavailabilitylabel[5]= new JLabel(" BED'S AVAILABLE : "+ numberofbeds[5]);
            bedavailabilitylabel[5].setBounds(15, 100, 450, 50);
            bedavailabilitylabel[5].setFont(new Font("Serif", Font.PLAIN, 20));
            bedavailabilitylabel[5].setHorizontalAlignment(JLabel.CENTER);
            label6.add(bedavailabilitylabel[5]);


           


            
        }

    void addcomponentstopanel() {

        label1 = new JLabel();
        label2 = new JLabel();
        label3 = new JLabel();
        label4 = new JLabel();
        label5 = new JLabel();
        label6 = new JLabel();

        label1.setSize(20, 20);
        label2.setSize(20, 20);
        label3.setSize(20, 20);
        label4.setSize(20, 20);
        label5.setSize(20, 20);
        label6.setSize(20, 20);

       

        Border blackline = BorderFactory.createLineBorder(Color.black);
        label1.setBorder(blackline);
        label2.setBorder(blackline);
        label3.setBorder(blackline);
        label4.setBorder(blackline);
        label5.setBorder(blackline);
        label6.setBorder(blackline);

        panel.add(label1);
        panel.add(label2);
        panel.add(label3);
        panel.add(label4);
        panel.add(label5);
        panel.add(label6);

        panel.setLayout(new GridLayout(3, 2));

        addhospitalnametolables();

    }

    void setsizesinpanel() {

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==gobackbutton)
        {
            f.setVisible(false);
            new homepage(username);
        }



    }

    public static void main(String args[]) {
        new MyGridLayout(" ");
    }
}