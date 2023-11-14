package bank.management.system;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.sql.ResultSet;
import java.util.*;

public class Withdrawl extends JFrame implements ActionListener{
    
    JTextField amountTextField;
    JButton withdraw, back;
    String pinnumber;
    Withdrawl(String pinnumber) {
        this.pinnumber = pinnumber;
        setLayout(null);
        
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("image/atm.jpg"));
        Image i2 = i1.getImage().getScaledInstance(900, 900, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel image = new JLabel(i3);
        image.setBounds(0, 0, 900, 900);
        add(image);
        
        JLabel text = new JLabel("Enter the amount you want to withdraw");
        text.setForeground(Color.WHITE);
        text.setFont(new Font("System", Font.BOLD, 16));
        text.setBounds(170, 300, 400, 20);
        image.add(text);
        
        amountTextField = new JTextField();
        amountTextField.setFont(new Font("Raleway", Font.BOLD, 22));
        amountTextField.setBounds(170, 350, 320, 25);
        image.add(amountTextField);
        
        withdraw = new JButton("Withdraw");
        withdraw.setBounds(355, 485, 150, 30);
        withdraw.addActionListener(this);
        image.add(withdraw);
        
        back = new JButton("Back");
        back.setBounds(355, 520, 150, 30);
        back.addActionListener(this);
        image.add(back);
        
        setSize(900, 900);
        setLocation(300, 0);
        setUndecorated(true);
        setVisible(true);
    }
    public void actionPerformed(ActionEvent ae) {
        if (ae.getSource() == withdraw) {
            String withdraw = amountTextField.getText();
            Date date = new Date();
            if (withdraw.equals("")) {
                JOptionPane.showMessageDialog(null, "Please enter the amount you want to withdraw");
            } else {
                try{
                    Conn conn = new Conn();
                    int balance = 0;
                    ResultSet rs = conn.s.executeQuery("select * from bank where pin = '"+pinnumber+"';");
                    while(rs.next()) {
                        if (rs.getString("type").equals("Deposit")) {
                            balance += Integer.parseInt(rs.getString("amount"));
                        } else {
                            balance -= Integer.parseInt(rs.getString("amount"));
                        }
                    }
                    if(balance < Integer.parseInt(withdraw)){
                        JOptionPane.showMessageDialog(null, "Insuffient Balance");
                        return;
                    }
                    String query = "insert into bank values('"+pinnumber+"', '"+date+"', 'Withdrawl', '"+withdraw+"');";
                    conn.s.executeUpdate(query);
                    JOptionPane.showMessageDialog(null, "Rs "+withdraw+" Withdraw Successfully");
                    setVisible(false);
                    new Transactions(pinnumber).setVisible(true);
                } catch (Exception e) {
                    System.out.println(e);
                }
            }
        } else if (ae.getSource() == back) {
            setVisible(false);
            new Transactions(pinnumber).setVisible(true);
        }
    }
    
    public static void main(String args[]) {
        new Withdrawl("");
    }
}