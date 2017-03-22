import java.awt.*;
import java.awt.event.*;

import javax.swing.*;

/* 
 * The following code creates a simple interface featuring two buttons and a textfield.
 * The textfield displays a count and the buttons can add or subtract from the count.
 * The code is meant to demonstrate a simple ActionListener implementation.
 */


public class counter extends JFrame {
	private int count = 0;
	
	private JButton addition;
	private JButton subtract;
	private JTextField theCount;
	
	counter(){
		ActionMngr myEvent = new ActionMngr(); //the actionlistener is instantiated as a ActionMngr object. 
		
		theCount = new JTextField(count + "", 10);
		add(theCount);
		
		addition = new JButton("+");
		addition.addActionListener(myEvent);
		add(addition);
		
		subtract = new JButton("-");
		subtract.addActionListener(myEvent);
		add(subtract);
		
		setLayout(new FlowLayout()); //layout is defined
	}
	
	
	private class ActionMngr implements ActionListener { // custom actionlistener class is instatiated. OBS: a class instatiated inside the scope of another class inherits from the "outer" class. 
		
		public void actionPerformed(ActionEvent e){
			
			if (e.getSource() == addition){ // if the + button is pressed the count is increased by 1 and the textfield is updated
				count++;
				theCount.setText(count + "");
			} else if (e.getSource() == subtract){ // if the - button is pressed the count is decreased by 1 and the textfield is updated
				count--;
				theCount.setText(count + "");
			}
			
		}
		
	}
	
	
public static void main(String[] args) {
	counter myCounter = new counter();
	myCounter.setDefaultCloseOperation(myCounter.EXIT_ON_CLOSE);
	myCounter.setSize(255,75);
	myCounter.setVisible(true);

	}
}
