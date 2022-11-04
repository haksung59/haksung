package project2;
import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class Calculator extends JFrame {

	String temp1 = "";
	String temp2 = "";
	int calresult = 0;
	String finalresult ="";
	
public Calculator() {
		
		setTitle("계산기");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(250,280);
		
		Container mainPane = getContentPane();
		mainPane.setLayout(new BorderLayout());
		
		JTextField result = new JTextField("");
		mainPane.add(result,BorderLayout.NORTH);
		//버튼 16개 생성해서 추가.
		GridLayout grid = new GridLayout(4,4);
		JPanel btnPanel = new JPanel(grid);
		
		JButton btn7 = new JButton("7");
		JButton btn8 = new JButton("8");
		JButton btn9 = new JButton("9");
		JButton btnD = new JButton("/");
		JButton btn4 = new JButton("4");
		JButton btn5 = new JButton("5");
		JButton btn6 = new JButton("6");
		JButton btnM = new JButton("*");
		JButton btn1 = new JButton("1");
		JButton btn2 = new JButton("2");
		JButton btn3 = new JButton("3");
		JButton btnMinus = new JButton("-");
		JButton btnC = new JButton("C");
		JButton btn0 = new JButton("0");
		JButton btnE = new JButton("=");
		JButton btnP = new JButton("+");
		
		btnPanel.add(btn7);
		btnPanel.add(btn8);
		btnPanel.add(btn9);
		btnPanel.add(btnD);
		btnPanel.add(btn4);
		btnPanel.add(btn5);
		btnPanel.add(btn6);
		btnPanel.add(btnM);
		btnPanel.add(btn1);
		btnPanel.add(btn2);
		btnPanel.add(btn3);
		btnPanel.add(btnMinus);
		btnPanel.add(btnC);
		btnPanel.add(btn0);
		btnPanel.add(btnE);
		btnPanel.add(btnP);
		
		
		add(btnPanel, BorderLayout.CENTER);
		
		btn7.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e) {
				if(result.getText().equals("0")||result.getText().equals("+")||result.getText().equals("-")||
						result.getText().equals("*")||result.getText().equals("/")) {
					result.setText("7");
				}else {
					result.setText(result.getText()+"7");
				}
			}
		});
		btn8.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e) {
				if(result.getText().equals("0")||result.getText().equals("+")||result.getText().equals("-")||
						result.getText().equals("*")||result.getText().equals("/")) {
					result.setText("8");
				}else {
					result.setText(result.getText()+"8");
				}
			}
		});
		btn9.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e) {
				if(result.getText().equals("0")||result.getText().equals("+")||result.getText().equals("-")||
						result.getText().equals("*")||result.getText().equals("/")) {
					result.setText("9");
				}else {
					result.setText(result.getText()+"9");
				}
			}
		});
		btnD.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e) {
				String cal = result.getText();
				String[] caleach = cal.split("");
				if(caleach.length>=2 && (caleach[caleach.length-1].equals("+")||caleach[caleach.length-1].equals("-")||caleach[caleach.length-1].equals("*")
						||caleach[caleach.length-1].equals("/"))) {
					cal="";
					caleach[caleach.length-1]="/";
					for(int i=0; i<caleach.length; i++) {
						cal += caleach[i];
					}
					result.setText(cal);
						
				}else {
					result.setText(result.getText()+"/");
				}
			}
		});
		btn4.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e) {
				if(result.getText().equals("0")||result.getText().equals("+")||result.getText().equals("-")||
						result.getText().equals("*")||result.getText().equals("/")) {
					result.setText("4");
				}else {
					result.setText(result.getText()+"4");
				}
			}
		});
		btn5.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e) {
				if(result.getText().equals("0")||result.getText().equals("+")||result.getText().equals("-")||
						result.getText().equals("*")||result.getText().equals("/")) {
					result.setText("5");
				}else {
					result.setText(result.getText()+"5");
				}
			}
		});
		btn6.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e) {
				if(result.getText().equals("0")||result.getText().equals("+")||result.getText().equals("-")||
						result.getText().equals("*")||result.getText().equals("/")) {
					result.setText("6");
				}else {
					result.setText(result.getText()+"6");
				}
			}
		});
		btnM.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e) {
				String cal = result.getText();
				String[] caleach = cal.split("");
				if(caleach.length>=2 && (caleach[caleach.length-1].equals("+")||caleach[caleach.length-1].equals("-")||caleach[caleach.length-1].equals("*")
						||caleach[caleach.length-1].equals("/"))) {
					cal="";
					caleach[caleach.length-1]="*";
					for(int i=0; i<caleach.length; i++) {
						cal += caleach[i];
					}
					result.setText(cal);
						
				}else {
					result.setText(result.getText()+"*");
				}
			}
		});
		btn1.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e) {
				if(result.getText().equals("0")||result.getText().equals("+")||result.getText().equals("-")||
						result.getText().equals("*")||result.getText().equals("/")) {
					result.setText("1");
				}else {
					result.setText(result.getText()+"1");
				}
			}
		});
		btn2.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e) {
				if(result.getText().equals("0")||result.getText().equals("+")||result.getText().equals("-")||
						result.getText().equals("*")||result.getText().equals("/")) {
					result.setText("2");
				}else {
					result.setText(result.getText()+"2");
				}
			}
		});
		btn3.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e) {
				if(result.getText().equals("0")||result.getText().equals("+")||result.getText().equals("-")||
						result.getText().equals("*")||result.getText().equals("/")) {
					result.setText("3");
				}else {
					result.setText(result.getText()+"3");
				}
			}
		});
		btnMinus.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e) {
				String cal = result.getText();
				String[] caleach = cal.split("");
				if(caleach.length>=2 && (caleach[caleach.length-1].equals("+")||caleach[caleach.length-1].equals("-")||caleach[caleach.length-1].equals("*")
						||caleach[caleach.length-1].equals("/"))) {
					cal="";
					caleach[caleach.length-1]="-";
					for(int i=0; i<caleach.length; i++) {
						cal += caleach[i];
					}
					result.setText(cal);
						
				}else {
					result.setText(result.getText()+"-");
				}
			}
		});
		btnC.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e) {
				result.setText("0");
			}
		});
		btn0.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e) {
				if(result.getText().equals("0")||result.getText().equals("+")||result.getText().equals("-")||
						result.getText().equals("*")||result.getText().equals("/")) {
					result.setText("0");
				}else {
					result.setText(result.getText()+"0");
				}
			}
		});
		btnE.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e) {
				String cal = result.getText();
				String[] caleach = cal.split("");
				for(int i=0; i<caleach.length; i++) {
					if(caleach[i].equals("+")) {
						for(int j=0; j<i; j++) {
							temp1 += caleach[j];
						}
						for(int j=i+1; j<caleach.length; j++) {
							temp2 += caleach[j];
						}
						int num1 = Integer.parseInt(temp1);
						int num2 = Integer.parseInt(temp2);
						calresult = num1 + num2;
					}
					
					if(caleach[i].equals("-")) {
						for(int j=0; j<i; j++) {
							temp1 += caleach[j];
						}
						for(int j=i+1; j<caleach.length; j++) {
							temp2 += caleach[j];
						}
						int num1 = Integer.parseInt(temp1);
						int num2 = Integer.parseInt(temp2);
						calresult = num1 - num2;
					}
					if(caleach[i].equals("*")) {
						for(int j=0; j<i; j++) {
							temp1 += caleach[j];
						}
						for(int j=i+1; j<caleach.length; j++) {
							temp2 += caleach[j];
						}
						int num1 = Integer.parseInt(temp1);
						int num2 = Integer.parseInt(temp2);
						calresult = num1 * num2;
					}
					if(caleach[i].equals("/")) {
						for(int j=0; j<i; j++) {
							temp1 += caleach[j];
						}
						for(int j=i+1; j<caleach.length; j++) {
							temp2 += caleach[j];
						}
						double num1 = Double.valueOf(temp1);
						double num2 = Double.valueOf(temp2);
						calresult = (int)(num1 / num2);
					}
					continue;
				}
				finalresult = Integer.toString(calresult);
				result.setText(finalresult);
				temp1="";
				temp2="";
			}
		});
		btnP.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e) {
				String cal = result.getText();
				String[] caleach = cal.split("");
				if(caleach.length>=2 && (caleach[caleach.length-1].equals("+")||caleach[caleach.length-1].equals("-")||caleach[caleach.length-1].equals("*")
						||caleach[caleach.length-1].equals("/"))) {
					cal="";
					caleach[caleach.length-1]="+";
					for(int i=0; i<caleach.length; i++) {
						cal += caleach[i];
					}
					result.setText(cal);
						
				}else {
					result.setText(result.getText()+"+");
				}
			}
		});
		
		setVisible(true);
	} 
	
	public static void main(String[] args) {
		Calculator cal = new Calculator();
	}

}