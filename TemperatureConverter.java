import java.awt.*;
import javax.swing.*;
import java.awt.event.*;



public class TemperatureConverter extends JFrame {
		private int celsius = 0;
		private int fahrenheit = 0;
		
		private JTextField myCelsius;
		private JTextField myFahrenheit;
		private JButton convertButtonCelsius;
		private JButton convertButtonFahrenheit;
		
		
	TemperatureConverter(){
		
// setting up the GUI
		setLayout(new GridLayout(2,3));
		
		JLabel celsiusLabel = new JLabel("Celsius");
		add(celsiusLabel);
		myCelsius = new JTextField(celsius + "", 10);
		add(myCelsius);
		convertButtonCelsius = new JButton("convert to fahrenheit");
		add(convertButtonCelsius);
		
		JLabel fahrenheitLabel = new JLabel("Fahrenheit");
		add(fahrenheitLabel);
		myFahrenheit = new JTextField(fahrenheit + "", 10);
		add(myFahrenheit);
		convertButtonFahrenheit = new JButton("convert to celsius");
		add(convertButtonFahrenheit);

// implementing ActionListener
		EventMngr myMngr = new EventMngr();
		convertButtonCelsius.addActionListener(myMngr);
		convertButtonFahrenheit.addActionListener(myMngr);
		
	}
	
	private class EventMngr implements ActionListener {
		public void actionPerformed(ActionEvent e){
			if (e.getSource() == convertButtonCelsius ){
				String i = myCelsius.getText();
				Double j = Double.parseDouble(i);
				Double convertedToFahrenheit = (j*1.8) + 32;
				JOptionPane.showMessageDialog(null,j + " Celsius is = " + convertedToFahrenheit + " Fahrenheit");
				
				
			} else if (e.getSource() == convertButtonFahrenheit){
				String i = myFahrenheit.getText();
				Double j = Double.parseDouble(i);
				Double convertedToCelsius = (j-32) / 1.8;
				JOptionPane.showMessageDialog(null,j + " Fahrenheit is = " + convertedToCelsius + " Celsius" );	
			}
		}
		
	}
	
	
	public static void main(String[] args) {
		TemperatureConverter myConverter = new TemperatureConverter();
		myConverter.setSize(700,100);
		myConverter.setVisible(true);
		myConverter.setDefaultCloseOperation(myConverter.EXIT_ON_CLOSE);
	}

}
