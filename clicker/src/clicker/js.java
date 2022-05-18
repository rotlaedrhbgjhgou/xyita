

package clicker;

import java.awt.*;
import java.awt.event.*;

import javax.swing.*;




import clicker.js.jsHandler;

public class js extends JFrame {
	

	JLabel counterLabel, perSec;
	int jsCounter, timerSpeed, PerSecondPrice;
	double perSecond;
	boolean timerOn;
	JButton btnNewButton_3, btnNewButton;
	Font font1, font2;
	jsHandler cHandler = new jsHandler();
	Timer timer;
	JFrame window = new JFrame("Coin-Clicker");
	
	
	
	public static void main(String[]args) {
		
	
		new js();
		
			
	}
	public js() {
		
		timerOn = false;
		perSecond = 0;
				
		jsCounter = 0;
		PerSecondPrice = 10;
		
		createFont();
		
		createUI();
	}
	
	public void createFont() {
		
		font1 = new Font("TimesRoman", Font.PLAIN,32);
				
		font2 = new Font("TimesRoman", Font.PLAIN,15);
		
	}
		public void createUI() {
			
			
			
			JFrame window = new JFrame("Coin-Clicker");
			window.setSize(800,600);
			window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			window.getContentPane().setBackground(Color.lightGray);
			window.getContentPane().setLayout(null);
			
			JPanel jsPanel = new JPanel();
			jsPanel.setBounds(300,125,200,200);
			jsPanel.setBackground(Color.lightGray);
			window.getContentPane().add(jsPanel);
			
			ImageIcon js = new ImageIcon(getClass().getClassLoader().getResource("555.png"));
			
			JButton jsButton = new JButton();
			jsButton.setBackground(Color.lightGray);
			jsButton.setFocusPainted(false); 
			jsButton.setBorder(null);
			jsButton.setIcon(js);
			jsButton.addActionListener(cHandler);
			jsButton.setActionCommand("Coin");
			jsPanel.add(jsButton);
					

			
			JPanel counterPanel = new JPanel();
			counterPanel.setBounds(20,450,200,100);
			counterPanel.setBackground(Color.lightGray);
			counterPanel.setLayout(new GridLayout(2,1));
			window.getContentPane().add(counterPanel);
			
			counterLabel= new JLabel(jsCounter + " Coin");
			counterLabel.setFont(font1);
			counterLabel.setForeground(Color.white);
			counterPanel.add(counterLabel);
			
			perSec = new JLabel();
			perSec.setFont(font2);
			perSec.setForeground(Color.white);
			counterPanel.add(perSec);
				
				window.setVisible(true);
			
			
				
				 
		
				JButton UpdateButton=new JButton("Update");  
		    UpdateButton.setBounds(348,469,95,30);  
		    window.getContentPane().add(UpdateButton);  
		     
		    UpdateButton.addActionListener(new ActionListener() {
		    	
		    	@Override
		    	public void actionPerformed(ActionEvent arg0) {
		    		
		    		window2 w2 = new window2();
					w2.showWindow();
			
		    	}
		   });
			
				
			}
		
		
		
		
		
		public void setTimer() {
			
			 timer = new Timer(1000, new ActionListener() {

				@Override
				public void actionPerformed(ActionEvent e) {
					 
					jsCounter++;
					counterLabel.setText(jsCounter + "Coin");
					
					
				}
				 
			 });
		}
			
		public void timerUpdate() {
			
			if(timerOn==false) {
				timerOn=true;
			}
			double speed = 1/perSecond*1000;
			timerSpeed = (int)Math.round(speed);
			
			setTimer();
			timer.start();
		}
		
		
		public class jsHandler implements ActionListener {
			
			public void actionPerformed(ActionEvent event) {
				
				
				
				String action = event.getActionCommand();
				
				switch(action) {
				case "Coin":
					jsCounter++;
					counterLabel.setText(jsCounter + " Coin");
					break;
				case "perSec":
				//	if(jsCounter>=PerSecondPrice) {
						
					//jsCounter = jsCounter - PerSecondPrice;
					//PerSecondPrice = PerSecondPrice + 10;
					
					
				//	btnNewButton_3.setText("PerSecond " + "Price " + "(" + PerSecondPrice + ")");
						
					perSecond = perSecond + 0.1;
					timerUpdate();
					}
				}
			}
		}
			//}
			
		
		
		
		
		

		
	