package TravelManagementSystem;
import java.awt.BorderLayout;
import java.awt.*;

import javax.swing.JFrame;
import javax.swing.JPanel;

import java.sql.*;
import javax.swing.*;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
public class ViewCustomers extends JFrame {
    Connection conn = null;
    private JPanel contentPane;

    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    ViewCustomers frame = new ViewCustomers("Ranu2211");
                    frame.setVisible(true);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }


    public ViewCustomers(String username) throws SQLException {
        //conn = Javaconnect.getDBConnection();
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(390, 100, 900, 680);
        getContentPane().setBackground(Color.white);
        setLayout(null);

        JLabel lblusername = new JLabel("Username");
        lblusername.setBounds(30, 50, 150,25);
        add(lblusername);

        JLabel labelusername = new JLabel();
        labelusername.setBounds(220, 50, 150,25);
        add(labelusername);

        JLabel lblid = new JLabel("Id");
        lblid.setBounds(30, 110, 150,25);
        add(lblid);

        JLabel labelid = new JLabel();
        labelid.setBounds(220, 110, 150,25);
        add(labelid);

        JLabel lblnumber = new JLabel("Number");
        lblnumber.setBounds(30, 170, 150,25);
        add(lblnumber);

        JLabel labelnumber = new JLabel();
        labelnumber.setBounds(220, 170, 150,25);
        add(labelnumber);

        JLabel lblname = new JLabel("Name");
        lblname.setBounds(30, 230, 150,25);
        add(lblname);

        JLabel labelname = new JLabel();
        labelname.setBounds(220, 230, 150,25);
        add(labelname);

        JLabel lblgender = new JLabel("Gender");
        lblgender.setBounds(30, 290, 150,25);
        add(lblgender);

        JLabel labelgender = new JLabel();
        labelgender.setBounds(220, 290, 150,25);
        add(labelgender);

        JLabel lblcountry = new JLabel("Country");
        lblcountry.setBounds(500, 50, 150,25);
        add(lblcountry);

        JLabel labelcountry = new JLabel();
        labelcountry.setBounds(690, 50, 150,25);
        add(labelcountry);

        JLabel lbladdress = new JLabel("Address");
        lbladdress.setBounds(500, 110, 150,25);
        add( lbladdress);

        JLabel labeladdress = new JLabel();
        labeladdress.setBounds(690, 110, 150,25);
        add(labeladdress);

        JLabel lblphone = new JLabel("Phone");
        lblphone.setBounds(500, 170, 150,25);
        add(lblphone);

        JLabel labelphone = new JLabel();
        labelphone.setBounds(690, 170, 150,25);
        add(labelphone);

        JLabel lblemail = new JLabel("E-mail");
        lblemail.setBounds(500, 230, 150,25);
        add( lblemail);

        JLabel labelemail = new JLabel();
        labelemail.setBounds(690, 230, 150,25);
        add(labelemail);

       ImageIcon i1  = new ImageIcon(ClassLoader.getSystemResource("TravelManagementSystem/icons/viewall.jpg"));
        Image i3 = i1.getImage().getScaledInstance(626, 201,Image.SCALE_DEFAULT);
        ImageIcon i2 = new ImageIcon(i3);
        JLabel l1 = new JLabel(i2);
        l1.setBounds(0,450,626,201);
        add(l1);

        ImageIcon i4  = new ImageIcon(ClassLoader.getSystemResource("TravelManagementSystem/icons/viewall.jpg"));
        Image i5 = i4.getImage().getScaledInstance(626, 201,Image.SCALE_DEFAULT);
        ImageIcon i6 = new ImageIcon(i5);
        JLabel l2 = new JLabel(i6);
        l2.setBounds(615,450,626,201);
        add(l2);

        try{
            Conn c = new Conn();
            String displayCustomersql = "select * from customer where username = '"+username+"'";
                    ResultSet rs = c.s.executeQuery(displayCustomersql);
                    while(rs.next()){
                        labelusername.setText(rs.getString("username"));
                        labelid.setText(rs.getString("id"));
                        labelnumber.setText(rs.getString("number"));
                        labelname.setText(rs.getString("name"));
                        labelgender.setText(rs.getString("gender"));
                        labelcountry.setText(rs.getString("country"));
                        labeladdress.setText(rs.getString("address"));
                        labelphone.setText(rs.getString("phone"));
                        labelemail.setText(rs.getString("email"));

                    }


//            table.setModel(DbUtils.resultSetToTableModel(rs));
        }
        catch(Exception e1){
            e1.printStackTrace();
        }

        JButton btnNewButton = new JButton("Back");
        btnNewButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                setVisible(false);
            }
        });
        btnNewButton.setBounds(390, 400, 120, 30);
        btnNewButton.setBackground(Color.BLACK);
        btnNewButton.setForeground(Color.WHITE);
        add(btnNewButton);
  getContentPane().setBackground(Color.WHITE);
    }

}