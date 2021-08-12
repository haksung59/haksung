package com.hk.app;

import java.awt.*;
import java.awt.List;
import java.awt.event.*;
import java.util.*;
import javax.swing.*;
import javax.swing.table.*;

public class Exam2 extends JFrame {
	//중앙
	JLabel lab1, labE, labM, labK, labS = null;
	JTextField txt1, txtE, txtM, txtK, txtS = null;
	
	
	JButton btn1 = null;
	JButton btn2 = null;
	JButton btn3 = null;
	
	ArrayList totalavg = new ArrayList();
	
	DefaultTableModel model = null;
	
	public Exam2() {
		
		setTitle("윈도우제목-Exam2");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLayout(new BorderLayout());
		setSize(500, 300);
		Container mainPane = getContentPane();
		//보더 중앙
		JPanel[] sPanel = new JPanel[5];
		for(int i=0; i<sPanel.length; i++) {
			//JPanel sPanel = new JPanel();
			sPanel[i] = new JPanel();
		}
		
		labS = new JLabel("번호:");
		txtS = new JTextField("", 5);
		
		lab1 = new JLabel("이름:");
		txt1 = new JTextField("", 5);
		
		labE = new JLabel("영어:");
		txtE = new JTextField("", 5);
		
		labM = new JLabel("수학:");
		txtM = new JTextField("", 5);
		
		labK = new JLabel("국어:");
		txtK = new JTextField("", 5);
		

		sPanel[0].add(labS); sPanel[0].add(txtS);
		sPanel[1].add(lab1); sPanel[1].add(txt1);
		sPanel[2].add(labE); sPanel[2].add(txtE);
		sPanel[3].add(labM); sPanel[3].add(txtM);
		sPanel[4].add(labK); sPanel[4].add(txtK);
		
		JPanel top = new JPanel(new GridLayout(5,1,0,0));
		for(int i=0; i<sPanel.length; i++) {
			top.add(sPanel[i]);
		}
		
		mainPane.add(top, BorderLayout.WEST);
		
		//보더 중앙 - 테이블
		String[] colNames = {"번호","이름","영어","수학","국어","합계","평균"};
		DefaultTableModel model = new DefaultTableModel(colNames, 0);
		JTable table = new JTable(model);
		JScrollPane scrollpane = new JScrollPane(table);
		
		mainPane.add(scrollpane, BorderLayout.CENTER);
		
		//보더 하단
		JPanel bottom = new JPanel(new GridLayout(1,3,0,0));
		btn1 = new JButton("1번 추가");
		btn2 = new JButton("2번 삭제");
		btn3 = new JButton("3번 전체평균");
		bottom.add(btn1);
		bottom.add(btn2);
		bottom.add(btn3);
		
		mainPane.add(bottom,BorderLayout.SOUTH);
		
		btn1.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				JButton temp = (JButton)e.getSource();
				
				String[] row = new String[7];
				row[0] = txtS.getText();
				row[1] = txt1.getText();
				row[2] = txtE.getText();
				row[3] = txtM.getText();
				row[4] = txtK.getText();
				
				String Eng = txtE.getText();
				int English = Integer.valueOf(Eng);
				String Math = txtM.getText();
				int Mathmetics = Integer.valueOf(Math);
				String Kor = txtK.getText();
				int Korean = Integer.valueOf(Kor);
				
				int sum = English+Mathmetics+Korean;
				
				String Sum = Integer.toString(sum);
				int avg = sum/3;
				String Avg = Integer.toString(avg);
				
				row[5] = Sum;
				row[6] = Avg;
				
				totalavg.add(avg);
				
				model.addRow(row);
				
			}
			
		});
		btn2.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				int rowIndex = table.getSelectedRow();
				if(rowIndex==-1) {
					return;
				}
				model.removeRow(rowIndex);
				totalavg.remove(rowIndex);
				
			}
			
		});
		btn3.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				int size = totalavg.size();
				int sumtotalavg = 0;
				for(int i=0; i<size; i++) {
					int temp = (int)totalavg.get(i);
					sumtotalavg += temp;
				}
				int Finalavg = sumtotalavg / size;
				
				JOptionPane.showMessageDialog(null, Finalavg);
				
				
			}
			
		});
		
		setVisible(true);
		
	}

	public static void main(String[] args) {
		Exam2 test = new Exam2();
		

	}


}
