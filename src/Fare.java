import java.awt.GridLayout;


import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;
public class Fare extends JFrame{
	
	JPanel Fare;
	JLabel Pasg,Dis,FC;
	JTextField Distxt,FCtxt;
	JComboBox pasgtyp;	
	JButton calculate,close;
	
	
	public Fare(){
		
		Fare=new JPanel();
		
		Pasg= new JLabel("Passenger:");
		Dis= new JLabel("Distance:");
		FC= new JLabel("Fare Cost:");
		
	
		Distxt= new JTextField();
		FCtxt= new JTextField();
		
		pasgtyp= new JComboBox();
		
		calculate= new JButton("Calcutale");
		close= new JButton("Close");
		
		
		
		setLayout(null);
		
		add(Pasg).setBounds(20, 30, 80, 20);
		add(Dis).setBounds(20, 60, 80, 20);
		add(FC).setBounds(20, 90, 80, 20);
		add(pasgtyp).setBounds(130, 30, 100, 20);
		add(Distxt).setBounds(130, 60, 100, 20);
		add(FCtxt).setBounds(130, 90, 100, 20);
		
		add(calculate).setBounds(20, 120, 100, 20);
		add(close).setBounds(150, 120, 100, 20);
		
		pasgtyp.addItem("Regular");
		pasgtyp.addItem("Senior");
		pasgtyp.addItem("Student");
		pasgtyp.addItem("PWD");
		
		
		
		
		
		
		
		
		  calculate.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					//String a = null;
					double km = Double.parseDouble(Distxt.getText());
					
					String regular = String.valueOf((km*1.50)+8);
					String senior = String.valueOf((km*1.50)+7);
					String student = String.valueOf((km*1.50)+7);
					String pwd = String.valueOf((km*1.50)+7);
					
					String rgl = String.valueOf(8);
					String dis = String.valueOf(7);
			     
			        if(pasgtyp.getSelectedItem().equals("Regular")&& (km >=4))
			        	
			        {
			        	FCtxt.setText(regular);
			        	Distxt.setText("");
			        }
			        if(pasgtyp.getSelectedItem().equals("Senior"))
			        {
			        	FCtxt.setText(senior);
			        	Distxt.setText("");
			        }
			        if(pasgtyp.getSelectedItem().equals("Student"))
			        {
			        	FCtxt.setText(student);
			        	Distxt.setText("");
			        }
			        if(pasgtyp.getSelectedItem().equals("PWD"))
			        {
			        	FCtxt.setText(pwd);
			        	Distxt.setText("");
			        }
			        if(pasgtyp.getSelectedItem  ().equals("PWD"))
			        {
			        	FCtxt.setText(pwd);
			        	Distxt.setText("");
			        }
			        
			      
			        
			        
			        
				}});	  
		   
		
		
		   close.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					
			        System.exit(0);
		   
		   
		   
		   
		}
		});
		   
		   
		   Fare.setBorder(BorderFactory.createTitledBorder("Fare Calculation App"));
			Fare.setBounds(5, 2, 270, 170);
			
			FCtxt.setEditable(false);
			add(Fare);
			setTitle("Fare Calculation App");
			setVisible(true);
			setLocationRelativeTo(null);
			setSize(300,220);
			setVisible(true);
			setDefaultCloseOperation(DISPOSE_ON_CLOSE);
		
	}
	

	public static void main(String[] args) {
		new Fare();
	}
	
}