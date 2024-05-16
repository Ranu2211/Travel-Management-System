package TravelManagementSystem;

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import java.sql.SQLException;


public class Home extends JFrame
//        implements ActionListener
{
    String username;
    JButton addPersonalDetails;
    JButton viewPersonalDetails;
    JButton UpdatePersonalDetails;
    JButton deletePersonalDetails;
    JButton checkpackages;
    JButton bookpackages;
    JButton viewpackages;
    JButton viewhotels;
    JButton bookhotel;
    JButton destinations;
    JButton viewbookedhotel;
    JButton payments;
    JButton calculators;
    JButton notepad;
    JButton about;

    public static void main(String[] args) {
        new Home("").setVisible(true);
    }

    public Home(String username) {
        setExtendedState(JFrame.MAXIMIZED_BOTH);
        setLayout(null);
        JPanel p1 = new JPanel();
        p1.setLayout(null);
        p1.setBackground(new Color(0,0,102));
        p1.setBounds(0,0, 1600, 60);
        add(p1);
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("TravelManagementSystem/icons/dashboard.png"));
        Image i2 = i1.getImage().getScaledInstance(70,70, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel icon = new JLabel(i3);
        icon.setBounds(5, 0, 70, 70);
        p1.add(icon);

        JLabel heading = new JLabel("Home");
        heading.setBounds(80, 10, 300, 40);
        heading.setForeground(Color.WHITE);
        heading.setFont(new Font("Tahoma", Font.BOLD, 30));
        p1.add(heading);

        JPanel p2 = new JPanel();
        p2.setLayout(null);
        p2.setBackground(new Color(0,0,102));
        p2.setBounds(0,60, 300, 900);
        add(p2);

        addPersonalDetails = new JButton("Add Personal Details");
        addPersonalDetails.setBounds(0,0,300,50);
        addPersonalDetails.setBackground(new Color(0,0,102));
        addPersonalDetails.setForeground(Color.WHITE);
        addPersonalDetails.setFont(new Font("Tahoma", Font.PLAIN, 20));
        addPersonalDetails.setMargin(new Insets(0,0,0,60));
//        addPersonalDetails.addActionListener(this);
        p2.add(addPersonalDetails);
        addPersonalDetails.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent ae){
                try{
                    new AddCustomer(username).setVisible(true);
                }catch(Exception e ){
                    e.printStackTrace();
                }
            }
        });

        UpdatePersonalDetails = new JButton("Update Personal Details");
        UpdatePersonalDetails.setBounds(0,50,300,50);
        UpdatePersonalDetails.setBackground(new Color(0,0,102));
        UpdatePersonalDetails.setForeground(Color.WHITE);
        UpdatePersonalDetails.setFont(new Font("Tahoma", Font.PLAIN, 20));
        UpdatePersonalDetails.setMargin(new Insets(0,0,0,30));
        p2.add(UpdatePersonalDetails);

        UpdatePersonalDetails.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent ae){
                try{
                    new UpdateCustomer(username).setVisible(true);
                }catch(Exception e ){}
            }
        });

         viewPersonalDetails = new JButton("View Personal Details");
        viewPersonalDetails.setBounds(0,100,300,50);
        viewPersonalDetails.setBackground(new Color(0,0,102));
        viewPersonalDetails.setForeground(Color.WHITE);
        viewPersonalDetails.setFont(new Font("Tahoma", Font.PLAIN, 20));
        viewPersonalDetails.setMargin(new Insets(0,0,0,80));
//        viewPersonalDetails.addActionListener(this);
        p2.add(viewPersonalDetails);

        viewPersonalDetails.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent ae){
                try{
                    new ViewCustomers(username).setVisible(true);
                }catch(Exception e ){
                    e.printStackTrace();
                }
            }
        });

//        deletePersonalDetails = new JButton("Delete Personal Details");
//        deletePersonalDetails.setBounds(0,150,300,50);
//        deletePersonalDetails.setBackground(new Color(0,0,102));
//        deletePersonalDetails.setForeground(Color.WHITE);
//        deletePersonalDetails.setFont(new Font("Tahoma", Font.PLAIN, 20));
//        deletePersonalDetails.setMargin(new Insets(0,0,0,40));
//        p2.add(deletePersonalDetails);
//
//        deletePersonalDetails.addActionListener(new ActionListener(){
//            public void actionPerformed(ActionEvent ae){
//                try{
//                    new DeleteCustomer().setVisible(true);
//                }catch(Exception e ){}
//            }
//        });

        checkpackages = new JButton("Check Package");
        checkpackages.setBounds(0,150,300,50);
        checkpackages.setBackground(new Color(0,0,102));
        checkpackages.setForeground(Color.WHITE);
        checkpackages.setFont(new Font("Tahoma", Font.PLAIN, 20));
        checkpackages.setMargin(new Insets(0,0,0,110));
        p2.add(checkpackages);

        checkpackages.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent ae){
                try{
                    new CheckPackage().setVisible(true);
                }catch(Exception e ){}
            }
        });

        bookpackages = new JButton("Book Package");
        bookpackages.setBounds(0,200,300,50);
        bookpackages.setBackground(new Color(0,0,102));
        bookpackages.setForeground(Color.WHITE);
        bookpackages.setFont(new Font("Tahoma", Font.PLAIN, 20));
        bookpackages.setMargin(new Insets(0,0,0,120));
        p2.add(bookpackages);

        bookpackages.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent ae){
                try{
                    new BookPackage(username).setVisible(true);
                }catch(Exception e ){
                    e.printStackTrace();
                }
            }
        });

         viewpackages = new JButton("View Package");
        viewpackages.setBounds(0,250,300,50);
        viewpackages.setBackground(new Color(0,0,102));
        viewpackages.setForeground(Color.WHITE);
        viewpackages.setFont(new Font("Tahoma", Font.PLAIN, 20));
        viewpackages.setMargin(new Insets(0,0,0,120));
        p2.add(viewpackages);

        viewpackages.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent ae){
                try{
                    new ViewPackage(username).setVisible(true);
                }catch(Exception e ){}

            }
        });

        viewhotels = new JButton("View Hotels");
        viewhotels.setBounds(0,300,300,50);
        viewhotels.setBackground(new Color(0,0,102));
        viewhotels.setForeground(Color.WHITE);
        viewhotels.setFont(new Font("Tahoma", Font.PLAIN, 20));
        viewhotels.setMargin(new Insets(0,0,0,130));
        p2.add(viewhotels);

        viewhotels.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent ae){
                try{
                    new CheckHotels().setVisible(true);
                }catch(Exception e ){}
            }
        });

        bookhotel = new JButton("Book Hotel");
        bookhotel.setBounds(0,350,300,50);
        bookhotel.setBackground(new Color(0,0,102));
        bookhotel.setForeground(Color.WHITE);
        bookhotel.setFont(new Font("Tahoma", Font.PLAIN, 20));
        bookhotel.setMargin(new Insets(0,0,0,140));
        p2.add(bookhotel);
        bookhotel.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent ae){
                new BookHotel(username).setVisible(true);
            }
        });

        viewbookedhotel = new JButton("View Booked Hotel");
        viewbookedhotel.setBounds(0,400,300,50);
        viewbookedhotel.setBackground(new Color(0,0,102));
        viewbookedhotel.setForeground(Color.WHITE);
        viewbookedhotel.setFont(new Font("Tahoma", Font.PLAIN, 20));
        viewbookedhotel.setMargin(new Insets(0,0,0,70));
        p2.add(viewbookedhotel);

        viewbookedhotel.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent ae){
                try{
                    new ViewBookedHotel(username).setVisible(true);
                }catch(Exception e ){}
            }
        });

        destinations = new JButton("Destinations");
        destinations.setBounds(0,450,300,50);
        destinations.setBackground(new Color(0,0,102));
        destinations.setForeground(Color.WHITE);
        destinations.setFont(new Font("Tahoma", Font.PLAIN, 20));
        destinations.setMargin(new Insets(0,0,0,125));
        p2.add(destinations);

        destinations.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent ae){
                new Destination().setVisible(true);
            }
        });

        payments = new JButton("Payments");
        payments.setBounds(0,500,300,50);
        payments.setBackground(new Color(0,0,102));
        payments.setForeground(Color.WHITE);
        payments.setFont(new Font("Tahoma", Font.PLAIN, 20));
        payments.setMargin(new Insets(0,0,0,155));
        p2.add(payments);

        payments.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent ae){
                new Payment().setVisible(true);
            }
        });

         calculators = new JButton("Calculator");
        calculators.setBounds(0,550,300,50);
        calculators.setBackground(new Color(0,0,102));
        calculators.setForeground(Color.WHITE);
        calculators.setFont(new Font("Tahoma", Font.PLAIN, 20));
        calculators.setMargin(new Insets(0,0,0,145));
        p2.add(calculators);

        calculators.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent ae){
                try{
                    Runtime.getRuntime().exec("calc.exe");
                }catch(Exception e){
                    e.printStackTrace();
                }
            }
        });

         notepad = new JButton("Notepad");
        notepad.setBounds(0,600,300,50);
        notepad.setBackground(new Color(0,0,102));
        notepad.setForeground(Color.WHITE);
        notepad.setFont(new Font("Tahoma", Font.PLAIN, 20));
        notepad.setMargin(new Insets(0,0,0,155));
        p2.add(notepad);

        notepad.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent ae){
                try{
                    Runtime.getRuntime().exec("notepad.exe");
                }catch(Exception e){
                    e.printStackTrace();
                }
            }
        });

        about = new JButton("About");
        about.setBounds(0,650,300,50);
        about.setBackground(new Color(0,0,102));
        about.setForeground(Color.WHITE);
        about.setFont(new Font("Tahoma", Font.PLAIN, 20));
        about.setMargin(new Insets(0,0,0,175));
        p2.add(about);

        about.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent ae){
                new About().setVisible(true);
            }
        });




        ImageIcon i4 = new ImageIcon(ClassLoader.getSystemResource("TravelManagementSystem/icons/home.jpg"));
        Image i5 = i4.getImage().getScaledInstance(1650, 1000,Image.SCALE_DEFAULT);
        ImageIcon i6 = new ImageIcon(i5);
        JLabel image = new JLabel(i6);
        image.setBounds(0, 0, 1650, 1000);
        add(image);

        JLabel l1 = new JLabel("Travel and Tourism Management System");
        l1.setForeground(Color.WHITE);
        l1.setFont(new Font("Railway", Font.PLAIN, 45));
        l1.setBounds(400, 70, 1200, 70);
        image.add(l1);
     setVisible(true);
        getContentPane().setBackground(Color.WHITE);
    }


}
