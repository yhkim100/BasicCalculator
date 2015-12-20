import javax.swing.*;
import java.awt.*; 
import java.awt.event.*;


public class CalcGUI extends JFrame{
	private JTextField answerField; 
	private JButton one, two, three, four, five, six, seven, eight, nine, zero, dec, neg, add, sub, mult, div, equals, clear;
	private String strTemp1, strTemp2, strResult; 
	private double result = 0.0;
	private JPanel contentPanel;
	private boolean equalsClicked = false, opChosen = false;
	char op = ' ';
	
	public CalcGUI(){
		super("Calculator"); //super gives the title of the window
		
		/*
		 * Setting up Variables and Buttons for GUI
		 */
		Font resultFont = new Font("SansSerif", Font.BOLD, 12);
		answerField = new JTextField(null, 20);
		answerField.setFont(resultFont);
		answerField.setEditable(false);
		
		one = new JButton("1");
		two = new JButton("2");
		three = new JButton("3");
		four = new JButton("4");
		five = new JButton("5");
		six = new JButton("6");
		seven = new JButton("7");
		eight = new JButton("8");
		nine = new JButton("9");
		zero = new JButton("0");
		dec = new JButton(".");
		neg = new JButton("+/-");
		add = new JButton("+");
		sub = new JButton("-");
		mult = new JButton("*");
		div = new JButton("/");
		equals = new JButton("=");
		clear = new JButton("C");
		
		Dimension dimm = new Dimension(50, 25); //Set the dimension for all buttons 
		
		one.setPreferredSize(dimm);
		two.setPreferredSize(dimm);
		three.setPreferredSize(dimm);
		four.setPreferredSize(dimm);
		five.setPreferredSize(dimm);
		six.setPreferredSize(dimm);
		seven.setPreferredSize(dimm);
		eight.setPreferredSize(dimm);
		nine.setPreferredSize(dimm);
		zero.setPreferredSize(dimm);
		add.setPreferredSize(dimm);
		sub.setPreferredSize(dimm);
		mult.setPreferredSize(dimm);
		div.setPreferredSize(dimm);
		equals.setPreferredSize(new Dimension(160,25));
		clear.setPreferredSize(dimm);
		dec.setPreferredSize(dimm);
		neg.setPreferredSize(dimm);
		
		/*
		 * SETTING UP ACTION LISTENERS to enable functionality 
		 */
		
		Numbers n = new Numbers();
		Calc c = new Calc();
		
		one.addActionListener(n); two.addActionListener(n); three.addActionListener(n);
		four.addActionListener(n); five.addActionListener(n); six.addActionListener(n);
		seven.addActionListener(n); eight.addActionListener(n); nine.addActionListener(n);
		zero.addActionListener(n); dec.addActionListener(n); neg.addActionListener(n);
		
		add.addActionListener(c);sub.addActionListener(c);mult.addActionListener(c);div.addActionListener(c);
		equals.addActionListener(c); clear.addActionListener(c);
		
		
		/*
		 * ADDING EVERYTHING TO GUI
		 */
		
		contentPanel = new JPanel();
		contentPanel.setBackground(Color.LIGHT_GRAY);
		
		contentPanel.add(answerField, BorderLayout.NORTH);
		contentPanel.add(one);contentPanel.add(two);contentPanel.add(three);contentPanel.add(neg);
		contentPanel.add(four);contentPanel.add(five);contentPanel.add(six);contentPanel.add(add);
		contentPanel.add(seven);contentPanel.add(eight);contentPanel.add(nine);contentPanel.add(sub);
		contentPanel.add(zero);contentPanel.add(clear);contentPanel.add(dec);contentPanel.add(mult);
		contentPanel.add(equals);contentPanel.add(div);

		
		this.setContentPane(contentPanel);
	}
	
	/* 
	 * =====================================================
	 * FUNCTIONAL BUT SHOULD BE CLEANED UP FOR READABILITY!!
	 * Most likely a better way to implement this...
	 * =====================================================
	 */
	private class Numbers implements ActionListener{
		public void actionPerformed(ActionEvent event){
			JButton src = (JButton) event.getSource(); //Used to see which button was clicked
			
			if(src.equals(one)){
				if(opChosen == false){ //if operation was not chosen, append the value to temp string 1
					if(strTemp1 == null){
						strTemp1 = "1";
					}
					else{
						strTemp1 += "1";
					}
				}
				else{ //if operation was chosen, append the value to temp string 2
					if(strTemp2 == null){
						strTemp2 = "1";
					}
					else{
						strTemp2 += "1";
					}
				}
			}
			
			if(src.equals(two)){
				if(opChosen == false){ //if operation was not chosen, append the value to temp string 1
					if(strTemp1 == null){
						strTemp1 = "2";
					}
					else{
						strTemp1 += "2";
					}
				}
				else{ //if operation was chosen, append the value to temp string 2
					if(strTemp2 == null){
						strTemp2 = "2";
					}
					else{
						strTemp2 += "2";
					}
				}
			}
			
			if(src.equals(three)){
				if(opChosen == false){ //if operation was not chosen, append the value to temp string 1
					if(strTemp1 == null){
						strTemp1 = "3";
					}
					else{
						strTemp1 += "3";
					}
				}
				else{ //if operation was chosen, append the value to temp string 2
					if(strTemp2 == null){
						strTemp2 = "3";
					}
					else{
						strTemp2 += "3";
					}
				}
			}
			
			if(src.equals(four)){
				if(opChosen == false){ //if operation was not chosen, append the value to temp string 1
					if(strTemp1 == null){
						strTemp1 = "4";
					}
					else{
						strTemp1 += "4";
					}
				}
				else{ //if operation was chosen, append the value to temp string 2
					if(strTemp2 == null){
						strTemp2 = "4";
					}
					else{
						strTemp2 += "4";
					}
				}
			}
			
			if(src.equals(five)){
				if(opChosen == false){ //if operation was not chosen, append the value to temp string 1
					if(strTemp1 == null){
						strTemp1 = "5";
					}
					else{
						strTemp1 += "5";
					}
				}
				else{ //if operation was chosen, append the value to temp string 2
					if(strTemp2 == null){
						strTemp2 = "5";
					}
					else{
						strTemp2 += "5";
					}
				}
			}
			
			if(src.equals(six)){
				if(opChosen == false){ //if operation was not chosen, append the value to temp string 1
					if(strTemp1 == null){
						strTemp1 = "6";
					}
					else{
						strTemp1 += "6";
					}
				}
				else{ //if operation was chosen, append the value to temp string 2
					if(strTemp2 == null){
						strTemp2 = "6";
					}
					else{
						strTemp2 += "6";
					}
				}
			}
			
			if(src.equals(seven)){
				if(opChosen == false){ //if operation was not chosen, append the value to temp string 1
					if(strTemp1 == null){
						strTemp1 = "7";
					}
					else{
						strTemp1 += "7";
					}
				}
				else{ //if operation was chosen, append the value to temp string 2
					if(strTemp2 == null){
						strTemp2 = "7";
					}
					else{
						strTemp2 += "7";
					}
				}
			}
			
			if(src.equals(eight)){
				if(opChosen == false){ //if operation was not chosen, append the value to temp string 1
					if(strTemp1 == null){
						strTemp1 = "8";
					}
					else{
						strTemp1 += "8";
					}
				}
				else{ //if operation was chosen, append the value to temp string 2
					if(strTemp2 == null){
						strTemp2 = "8";
					}
					else{
						strTemp2 += "8";
					}
				}
			}
			
			if(src.equals(nine)){
				if(opChosen == false){ //if operation was not chosen, append the value to temp string 1
					if(strTemp1 == null){
						strTemp1 = "9";
					}
					else{
						strTemp1 += "9";
					}
				}
				else{ //if operation was chosen, append the value to temp string 2
					if(strTemp2 == null){
						strTemp2 = "9";
					}
					else{
						strTemp2 += "9";
					}
				}
			}
			
			if(src.equals(zero)){
				if(opChosen == false){ //if operation was not chosen, append the value to temp string 1
					if(strTemp1 == null){
						strTemp1 = "0";
					}
					else{
						strTemp1 += "0";
					}
				}
				else{ //if operation was chosen, append the value to temp string 2
					if(strTemp2 == null){
						strTemp2 = "0";
					}
					else{
						strTemp2 += "0";
					}
				}
			}
			
			if(src.equals(neg)){
				if(opChosen == false){ //if operation was not chosen, append the value to temp string 1
					if(strTemp1 == null){
						strTemp1 = "-";
					}
					else{
						if(strTemp1.startsWith("-")){
							strTemp1 = strTemp1.substring(1);
						}
						else{
							strTemp1 = "-" + strTemp1;
						}
					}
				}
				else{ //if operation was chosen, append the value to temp string 2
					if(strTemp2 == null){
						strTemp2 = "-";
					}
					else{
						if(strTemp2.startsWith("-")){
							strTemp2 = strTemp2.substring(1);
						}
						else{
							strTemp2 = "-" + strTemp2;
						}
					}
				}
			}
			
			
			if(src.equals(dec)){
				if(opChosen == false){ //if operation was not chosen, append the value to temp string 1
					if(strTemp1 == null){
						strTemp1 = "0.";
					}
					else{
						if(strTemp1.contains(".")){ //IF DECIMAL POINT IS ALREADY PRESENT, DO NOTHING
							System.out.println("Decimal point already present");
						}
						else{
							strTemp1 += ".";
						}
					}
				}
				else{ //if operation was chosen, append the value to temp string 2
					if(strTemp2 == null){
						strTemp2 = "0.";
					}
					else{
						if(strTemp2.contains(".")){ //IF DECIMAL POINT IS ALREADY PRESENT, DO NOTHING
							System.out.println("Decimal point already present");
						}
						else{
							strTemp2 += ".";
						}
					}
				}
			}
			
			/*
			 * SHOW THE NUMERIC VALUE WHEN BUTTONS ARE CLICKED
			 * APPEND NUMBERS IF EQUALS BUTTON IS NOT CLICKED
			 */
			
			if(equalsClicked == false){
				if(opChosen == false){
					answerField.setText(strTemp1);
				}
				else{
					answerField.setText(strTemp2);
				}		
			}

		}
	}
	
	private class Calc implements ActionListener{
		public void actionPerformed(ActionEvent event){
			JButton src = (JButton) event.getSource(); //Used to see which button was clicked
			
			//FIND Button Source and Do Appropriate Computation
			if(src.equals(add)){
				if(strTemp1 == null){
					System.out.println("NO NUMBERS SELECTED TO COMPUTE");
				}
				else{
					if(strTemp2 == null){
						opChosen = true;
						op = '+';
					}
					else{
						System.out.println("Two Operations Only!");
					}
				}
			}
			
			if(src.equals(sub)){
				if(strTemp1 == null){
					System.out.println("NO NUMBERS SELECTED TO COMPUTE");
				}
				else{
					if(strTemp2 == null){
						opChosen = true;
						op = '-';
					}
					else{
						System.out.println("Two Operations Only!");
					}
				}
			}
			
			if(src.equals(mult)){
				if(strTemp1 == null){
					System.out.println("NO NUMBERS SELECTED TO COMPUTE");
				}
				else{
					if(strTemp2 == null){
						opChosen = true;
						op = '*';
					}
					else{
						System.out.println("Two Operations Only!");
					}
				}
			}
			
			if(src.equals(div)){
				if(strTemp1 == null){
					System.out.println("NO NUMBERS SELECTED TO COMPUTE");
				}
				else{
					if(strTemp2 == null){
						opChosen = true;
						op = '/';
					}
					else{
						System.out.println("Two Operations Only!");
					}
				}
			}
			
			if(src.equals(equals)){
				if(strTemp1 == null){
					System.out.println("NO NUMBERS SELECTED TO COMPUTE");
				}
				else{
					if(strTemp2 == null){
						System.out.println("NO NUMBER SELECTED TO COMPUTE");
					}
					else{
						double arg1 = 0.0, arg2 = 0.0;
						
						arg1 = Double.parseDouble(strTemp1);
						arg2 = Double.parseDouble(strTemp2);
						
						switch(op){
						case '+':
							result = arg1 + arg2;
							break;
						case '-':
							result = arg1 - arg2;
							break;
						case '*':
							result = arg1 * arg2;
							break;
						case '/':
							result = arg1 / arg2;
							break;
						}
						
						strResult = Double.toString(result);
						answerField.setText(strResult);
						if(op == '/' && arg2 == 0.0){
							answerField.setText("DIVISION BY 0");
						}
					}
				}
			}
			
			//CLEARING FUNCTIONALITY IS DONE BY RESETING EVERYTHING
			if(src.equals(clear)){
				strTemp1 = null;
				strTemp2 = null;
				equalsClicked = false;
				opChosen = false;
				op = ' ';
				strResult = null;
				answerField.setText(" ");
			}
			
		}
	}

}
