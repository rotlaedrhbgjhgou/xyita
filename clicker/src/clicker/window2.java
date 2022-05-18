package clicker;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

public class window2 extends js {

	
		
			

	public void showWindow() {
		// TODO Auto-generated method stub
		JFrame window2 = new JFrame ("2");
		window2.setBounds(100,100,467,315);
		window2.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		window2.getContentPane().setLayout(null);
		
		JButton Back = new JButton("back");
		Back.setBounds(275, 212, 166, 53);
		window2.getContentPane().add(Back);
		Back.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				window2.setVisible(false);
				
		
				
			}
			
		});
		
		
		
	
	
		JButton btnNewButton = new JButton("click ");
		btnNewButton.setBounds(10, 11, 111, 34);
		window2.getContentPane().add(btnNewButton);
		btnNewButton.setActionCommand("perClick");
		btnNewButton.addActionListener(cHandler); 
		
		
					
		JButton btnNewButton_3 = new JButton("perSecodn 1");
		btnNewButton_3.setBounds(330, 11, 111, 34);
		window2.getContentPane().add(btnNewButton_3);
		btnNewButton_3.setActionCommand("perSec");
		btnNewButton_3.addActionListener(cHandler);
		
		
	
		
		
		
		
		
		window2.setVisible(true);
		
	}


	
}

	
	


		
		
	
	


