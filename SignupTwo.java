package bank.management.system;

import javax.swing.*;
import java.awt.*;
import java.util.*;
import java.awt.event.*;


public class SignupTwo extends JFrame implements ActionListener {
    JTextField panTextField, aadharTextField;
    JComboBox religionComboBox, categoryComboBox, incomeComboBox, educationComboBox, occupationComboBox;
    JRadioButton syes, sno, ayes, ano;
    JButton next;
    String formno;
    
	SignupTwo(String formno) {
                this.formno = formno;
		
		setLayout(null);
                
                setTitle("NEW ACCOUNT APPLICATION FORM - PAGE 2");
		
		JLabel additionalDetails = new JLabel("Page 2: Additional Details");
		additionalDetails.setFont(new Font("Raleway", Font.BOLD, 20));
		additionalDetails.setBounds(290, 80, 400, 30);
		add(additionalDetails);
		
		JLabel religion = new JLabel("Religion:");
		religion.setFont(new Font("Raleway", Font.BOLD, 22));
		religion.setBounds(100, 140, 100, 30);
		add(religion);
		
                String valReligion[] = {"Hindu", "Muslim", "Sikh", "Christian", "Other"};
                religionComboBox = new JComboBox(valReligion);
                religionComboBox.setBounds(300, 140, 400, 30);
                religionComboBox.setFont(new Font("Raleway", Font.BOLD, 14));
                religionComboBox.setBackground(Color.WHITE);
                add(religionComboBox);
		
		JLabel category = new JLabel("Category:");
		category.setFont(new Font("Raleway", Font.BOLD, 22));
		category.setBounds(100, 190, 200, 30);
		add(category);
		
                String valCategory[] = {"General", "OBC", "SC", "ST", "Other"};
                categoryComboBox = new JComboBox(valCategory);
                categoryComboBox.setFont(new Font("Raleway", Font.BOLD, 14));
		categoryComboBox.setBounds(300, 190, 400, 30);
                categoryComboBox.setBackground(Color.WHITE);
		add(categoryComboBox);
		
		JLabel income = new JLabel("Income:");
		income.setFont(new Font("Raleway", Font.BOLD, 22));
		income.setBounds(100, 240, 200, 30);
		add(income);
		
		String valIncome[] = {"Null", "< 1,50,000", "< 2,50,000", "< 5,00,000", "Upto 10,00,000"};
                incomeComboBox = new JComboBox(valIncome);
		incomeComboBox.setBounds(300, 240, 400, 30);
                incomeComboBox.setBackground(Color.WHITE);
                // incomeComboBox.setForeground(new Color(105, 105, 105));
                incomeComboBox.setFont(new Font("Raleway", Font.BOLD, 14));
		add(incomeComboBox);
		
		JLabel educational = new JLabel("Educational");
		educational.setFont(new Font("Raleway", Font.BOLD, 22));
		educational.setBounds(100, 290, 200, 30);
		add(educational);
                
		JLabel qualification = new JLabel("Qualification:");
		qualification.setFont(new Font("Raleway", Font.BOLD, 22));
		qualification.setBounds(100, 315, 200, 30);
		add(qualification);
		
                String educationValues[] = {"Non-Graduation", "Graduate", "Post-Graduation", "Doctrate", "Others"};
                educationComboBox = new JComboBox(educationValues);
                educationComboBox.setFont(new Font("Raleway", Font.BOLD, 14));
		educationComboBox.setBounds(300, 315, 400, 30);
                educationComboBox.setBackground(Color.WHITE);
		add(educationComboBox);
		
		JLabel occupation = new JLabel("Occupation:");
		occupation.setFont(new Font("Raleway", Font.BOLD, 22));
		occupation.setBounds(100, 390, 200, 30);
		add(occupation);
                
                String occupationValues[] = {"Salaried", "Self-Employed", "Bussiness", "Student", "Retired", "Others"};
                occupationComboBox = new JComboBox(occupationValues);
                occupationComboBox.setFont(new Font("Raleway", Font.BOLD, 14));
		occupationComboBox.setBounds(300, 390, 400, 30);
                occupationComboBox.setBackground(Color.WHITE);
		add(occupationComboBox);
		
		JLabel pan = new JLabel("PAN Number:");
		pan.setFont(new Font("Raleway", Font.BOLD, 22));
		pan.setBounds(100, 440, 200, 30);
		add(pan);
		
		panTextField = new JTextField();
		panTextField.setFont(new Font("Raleway", Font.BOLD, 14));
		panTextField.setBounds(300, 440, 400, 30);
		add(panTextField);
		
		JLabel aadhar = new JLabel("Aadhar Number:");
		aadhar.setFont(new Font("Raleway", Font.BOLD, 22));
		aadhar.setBounds(100, 490, 200, 30);
		add(aadhar);
		
		aadharTextField = new JTextField();
		aadharTextField.setFont(new Font("Raleway", Font.BOLD, 14));
		aadharTextField.setBounds(300, 490, 400, 30);
		add(aadharTextField);
		
		JLabel senior = new JLabel("Senior citizen:");
		senior.setFont(new Font("Raleway", Font.BOLD, 22));
		senior.setBounds(100, 540, 200, 30);
		add(senior);
                
                syes = new JRadioButton("Yes");
                syes.setBounds(300, 540, 100, 30);
                syes.setBackground(Color.WHITE);
                add(syes);
                
                sno = new JRadioButton("No");
                sno.setBounds(450, 540, 100, 30);
                sno.setBackground(Color.WHITE);
                add(sno);
                
                ButtonGroup gendergroup = new ButtonGroup();
                gendergroup.add(syes);
                gendergroup.add(sno);
		
		JLabel account = new JLabel("Exisiting Account:");
		account.setFont(new Font("Raleway", Font.BOLD, 22));
		account.setBounds(100, 590, 200, 30);
		add(account);
		
		ayes = new JRadioButton("Yes");
                ayes.setBounds(300, 590, 100, 30);
                ayes.setBackground(Color.WHITE);
                add(ayes);
                
                ano = new JRadioButton("No");
                ano.setBounds(450, 590, 100, 30);
                ano.setBackground(Color.WHITE);
                add(ano);
                
                ButtonGroup accountgroup = new ButtonGroup();
                accountgroup.add(ayes);
                accountgroup.add(ano);
                
                next = new JButton("Next");
                next.setBackground(Color.BLACK);
                next.setForeground(Color.WHITE);
                next.setFont(new Font("Raleway", Font.BOLD, 14));
                next.setBounds(620, 660, 80, 30);
                next.addActionListener(this);
                add(next);
		
		getContentPane().setBackground(Color.WHITE);
		
		setSize(850,  800);
		setLocation(350, 10);
		setVisible(true);
	}
        public void actionPerformed(ActionEvent ae) {
            String religion = (String) religionComboBox.getSelectedItem();
            String category = (String) categoryComboBox.getSelectedItem();
            String income = (String)incomeComboBox.getSelectedItem();
            String education = (String)educationComboBox.getSelectedItem();
            String occupation = (String)occupationComboBox.getSelectedItem();
            String pan = panTextField.getText();
            String aadhar = aadharTextField.getText();
            String senior = null;
            if (syes.isSelected()) {
                senior = "Yes";
            } else if (sno.isSelected()){
                senior = "No";
            }
            String account = null;
            if (ayes.isSelected()) {
                account = "Yes";
            } else if (ano.isSelected()){
                account = "No";
            }
            
            try{
                if (formno.equals("")) {
                    JOptionPane.showMessageDialog(null, "f is Required");
                }
                if (pan.equals("")) {
                    JOptionPane.showMessageDialog(null, "Address is Required");
                }
                if (aadhar.equals("")) {
                    JOptionPane.showMessageDialog(null, "City is Required");
                }
                else {
                    // JOptionPane.showMessageDialog(null, "formno = "+formno);
                    Conn c = new Conn();
                    String query = "insert into signuptwo values('"+formno+"','"+religion+"','"+category+"','"+income+"','"+education+"','"+occupation+"','"+pan+"','"+aadhar+"','"+senior+"','"+account+"');";
                    c.s.executeUpdate(query);
                }
                
                setVisible(false);
                new SignupThree(formno);
            } catch (Exception e) {
                System.out.println(e);
            }
	}

	public static void main(String[] args) {
		new SignupTwo("");

	}

}

