import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JRadioButton;
import javax.swing.JRootPane;
import javax.swing.JCheckBox;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.awt.event.ActionEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import javax.swing.SwingConstants;
import javax.swing.JTextArea;
import java.awt.print.*;
import javafx.print.*;


public class menu {


	JFrame frame;
	private JTextField total;
	private JTextField payment;
	ButtonGroup items;
	private JLabel lblTempest;
	private JLabel lblSanji;
	private JLabel lblPaul;
	private JLabel lblJames;
	private JLabel lblParker;
	private JLabel lblSmith;
	private JLabel lblCaravan;
	private JLabel lblStaniel;
	private JCheckBox chckbxStaniel;
	private JButton compute;
	private JButton Clear;
	private JCheckBox chckbxCaravan;
	private JCheckBox chckbxSmith;
	private JLabel lblNewLabel_1;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JLabel lblAmount_1;
	private JLabel lblAmount_2;
	private JTextField textField_5;
	private JLabel lblAmount_3;
	private JTextField textField_6;
	private JTextField textField_4;
	private JTextField textField_7;
	private JTextField textField_8;
	private JTextField textField_9;
	private JTextField textField_10;
	private JTextField textField_11;
	private JTextField textField_12;
	private JLabel lblNewLabel_2;
	private JCheckBox chckbxParker;
	private JCheckBox chckbxJames;
	private JCheckBox chckbxPaul;
	private JButton btnClose;
	private JLabel Change;
	private JTextField sukli;
	private JLabel Change_1;
	private JTextField textField01;
	private JCheckBox chckbxTempest;
	private JTextField textField_13;
	private JTextField textField02;
	private JTextField textField_14;
	private JTextField textField03;
	private JTextField textField_15;
	private JCheckBox chckbxJoy;
	private JCheckBox chckbxSanji;
	private JLabel lblJolly;
	private JTextArea texReceipt;
	private JLabel lblNewLabel_3;
	
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					menu window = new menu();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
			
			
		});
	}

	/**
	 * Create the application.
	 */
	public  menu() {
			  	
		
		//freebies
				int tempest = 399, jolly = 299, sanji = 399;
				//shirt
				int a = 450, b = 399, c = 499;
				//short
				int d = 399, ed = 500, f = 479;
		
		items = new ButtonGroup();
		frame = new JFrame();
		frame.setSize(100, 100);
		frame.setUndecorated(true);
		frame.getRootPane().setWindowDecorationStyle(JRootPane.NONE);
		frame.setVisible(true);
		frame.setResizable(false);
		frame.getContentPane().setBackground(Color.DARK_GRAY);
		frame.setBounds(100, 100, 1200, 600);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		lblSmith = new JLabel("");
		lblSmith.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				total.setText(c + "");
			}
		});
		lblSmith.setIcon(new ImageIcon("C:\\Users\\HP\\eclipse-workspace\\Oxygn\\img\\Shirt1.jpg"));
		lblSmith.setBounds(731, 109, 109, 116);
		lblSmith.setToolTipText("Smith");
		frame.getContentPane().add(lblSmith);
		
		JLabel lblNewLabel_4 = new JLabel("");
		lblNewLabel_4.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				if(arg0.getSource() == lblNewLabel_4) {
					chckbxTempest.setEnabled(true);
					chckbxSanji.setEnabled(true);
					chckbxJoy.setEnabled(true);
					textField01.setEnabled(true);
					textField02.setEnabled(true);
					textField03.setEnabled(true);
				}
			}
		});
		
		lblNewLabel_4.setIcon(new ImageIcon("C:\\Users\\HP\\eclipse-workspace\\Oxygn\\bin\\frrrr.png"));
		lblNewLabel_4.setBounds(471, 322, 180, 50);
		frame.getContentPane().add(lblNewLabel_4);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon("C:\\Users\\HP\\Downloads\\oxygn.jpg"));
		lblNewLabel.setBounds(10, 11, 180, 80);
		frame.getContentPane().add(lblNewLabel);
		
		lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				if(arg0.getSource() == lblNewLabel_1 ) {
				chckbxStaniel.setEnabled(true);
				chckbxSmith.setEnabled(true);
				chckbxCaravan.setEnabled(true);
				textField_1.setEnabled(true);
				textField_2.setEnabled(true);
				textField_3.setEnabled(true);
				}
		}
		});
		lblNewLabel_1.setIcon(new ImageIcon("C:\\Users\\HP\\eclipse-workspace\\O2\\src\\shirty.png"));
		lblNewLabel_1.setBounds(553, 55, 109, 50);
		frame.getContentPane().add(lblNewLabel_1);
		
		lblNewLabel_2 = new JLabel("");
		lblNewLabel_2.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				if(arg0.getSource() == lblNewLabel_2) {
				textField_7.setEnabled(true);
				textField_9.setEnabled(true);
				textField_11.setEnabled(true);
				chckbxPaul.setEnabled(true);
				chckbxParker.setEnabled(true);
				chckbxJames.setEnabled(true);
				}
			}
		});
		lblNewLabel_2.setIcon(new ImageIcon("C:\\Users\\HP\\eclipse-workspace\\Oxygn\\src\\shii.png"));
		lblNewLabel_2.setBounds(982, 55, 122, 50);
		frame.getContentPane().add(lblNewLabel_2);
		
		lblStaniel = new JLabel("Staniel");
		lblStaniel.setToolTipText("Staniel");
		lblStaniel.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				total.setText(a + "");
			}
		});
		lblStaniel.setIcon(new ImageIcon("C:\\Users\\HP\\eclipse-workspace\\Oxygn\\img\\shirt4.jpg"));
		lblStaniel.setBounds(369, 122, 98, 110);
		frame.getContentPane().add(lblStaniel);
		
		lblCaravan = new JLabel("Caravan");
		lblCaravan.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				total.setText(b + "");
			}
		});
		lblCaravan.setIcon(new ImageIcon("C:\\Users\\HP\\eclipse-workspace\\Oxygn\\img\\Shirt2.jpg"));
		lblCaravan.setBounds(553, 116, 98, 116);
		frame.getContentPane().add(lblCaravan);
		lblCaravan.setToolTipText("Caravan");
		lblParker = new JLabel("");
		lblParker.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				total.setText(d + "");
			}
		});
		lblParker.setIcon(new ImageIcon("C:\\Users\\HP\\eclipse-workspace\\Oxygn\\img\\short4.jpg"));
		lblParker.setBounds(895, 122, 115, 110);
		lblParker.setToolTipText("Parker");
		frame.getContentPane().add(lblParker);
		
		lblJames = new JLabel("");
		lblJames.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				total.setText(ed + "");
			}
		});
		lblJames.setIcon(new ImageIcon("C:\\Users\\HP\\eclipse-workspace\\Oxygn\\img\\short2.jpg"));
		lblJames.setBounds(1054, 259, 115, 110);
		lblJames.setToolTipText("James");
		frame.getContentPane().add(lblJames);
		
		lblPaul = new JLabel("");
		lblPaul.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				total.setText(f + "");
			}
		});
		lblPaul.setIcon(new ImageIcon("C:\\Users\\HP\\eclipse-workspace\\Oxygn\\img\\short5.jpg"));
		lblPaul.setBounds(989, 410, 115, 80);
		lblPaul.setToolTipText("Paul");
		frame.getContentPane().add(lblPaul);
		
		lblSanji = new JLabel("");
		lblSanji.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				total.setText(sanji + "");
			}
		});
		lblSanji.setIcon(new ImageIcon("C:\\Users\\HP\\eclipse-workspace\\Oxygn\\img\\sz1.jpg"));
		lblSanji.setBounds(731, 380, 109, 100);
		lblSanji.setToolTipText("Sanji");
		frame.getContentPane().add(lblSanji);
		
		lblTempest = new JLabel("");
		lblTempest.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				total.setText(tempest +"");
			}
		});
		lblTempest.setIcon(new ImageIcon("C:\\Users\\HP\\eclipse-workspace\\Oxygn\\img\\sz4.jpg"));
		lblTempest.setBounds(380, 380, 122, 110);
		lblTempest.setToolTipText("Tempest");
		frame.getContentPane().add(lblTempest);
		
		lblJolly = new JLabel("");
		lblJolly.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				total.setText(jolly +"");
			}
		});
		lblJolly.setIcon(new ImageIcon("C:\\Users\\HP\\eclipse-workspace\\Oxygn\\img\\sz2.jpg"));
		lblJolly.setBounds(553, 392, 98, 91);
		lblJolly.setToolTipText("Joy");
		frame.getContentPane().add(lblJolly);
		
		JLabel lblAmount = new JLabel("Amount");
		lblAmount.setFont(new Font("Tahoma", Font.PLAIN, 24));
		lblAmount.setForeground(Color.WHITE);
		lblAmount.setBounds(20, 11, 146, 36);
		frame.getContentPane().add(lblAmount);
		
		total = new JTextField();
		total.setBounds(20, 51, 180, 28);
		frame.getContentPane().add(total);
		total.setColumns(10);
		
		JLabel lblPayment = new JLabel("Quantity");
		lblPayment.setForeground(Color.WHITE);
		lblPayment.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblPayment.setBounds(306, 257, 64, 23);
		frame.getContentPane().add(lblPayment);
		
		compute = new JButton("Compute");
		//ComputeButton
		compute.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				computeActionPerformed(arg0);
				lblNewLabel_3.getIcon();
				texReceipt.append("\n              ===== RECEIPT ===== \n\n" +
				"        Product     Quantity    Amount\n " + "       " +chckbxStaniel.getText() + "           " + textField_1.getText() +"              " +  textField_4.getText() +"\n        " + 
				chckbxCaravan.getText() + "        " + textField_2.getText() +"              " +  textField_5.getText() + "\n        " + chckbxSmith.getText() +
				 "            " + textField_3.getText() +"              " +  textField_6.getText() +  "\n        " + chckbxParker.getText() + "           " + textField_7.getText() +"              " +  textField_8.getText()
				+ "\n        " + chckbxJames.getText() + "          " + textField_9.getText() +"              " +  textField_10.getText()
				+ "\n        " + chckbxPaul.getText() + "               " + textField_11.getText() +"             " +  textField_12.getText()
				+ "\n        " + chckbxTempest.getText() + "       " + textField01.getText() +"             " +  textField_13.getText()
				+"\n        " + chckbxPaul.getText() + "               " + textField02.getText() +"             " +  textField_14.getText()
				+ "\n        " + chckbxSanji.getText() + "               " + textField03.getText() +"             " +  textField_15.getText()
				+ "\n\n         Total: "+ total.getText() + "\n        Change: " + Change_1.getText()
				);
				try {
					texReceipt.print();
				}
				catch (java.awt.print.PrinterException e)
				{
					System.err.format("No Printer Found! ",e.getMessage());
				}
			}
		});
		compute.setBackground(Color.LIGHT_GRAY);
		compute.setBounds(20, 501, 217, 28);
		frame.getContentPane().add(compute);
		
		
		//clearButton
		Clear = new JButton("Clear");
		Clear.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				total.setText("");
				payment.setText("");
				Change_1.setText("");
				texReceipt.setText("");
				
				chckbxStaniel.setSelected(false);
				chckbxCaravan.setSelected(false);
				chckbxSmith.setSelected(false);
				chckbxParker.setSelected(false);
				chckbxJames.setSelected(false);
				chckbxPaul.setSelected(false);
				chckbxTempest.setSelected(false);
				chckbxJoy.setSelected(false);
				chckbxSanji.setSelected(false);
				
			}
		});
		Clear.setBackground(Color.LIGHT_GRAY);
		Clear.setBounds(20, 539, 217, 28);
		frame.getContentPane().add(Clear);
		
		chckbxStaniel = new JCheckBox("Staniel");
		chckbxStaniel.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent arg0) {
				chckbxStanielItemStateChanged(arg0);
			}
		});
		chckbxStaniel.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				chckbxStanielActionPerformed(arg0);
			}
		});
		chckbxStaniel.addMouseListener(new java.awt.event.MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				chckbxStanielMouseClicked(arg0);
			}
		});
		
		chckbxStaniel.setFont(new Font("Tahoma", Font.PLAIN, 14));
		chckbxStaniel.setForeground(Color.WHITE);
		chckbxStaniel.setBackground(Color.DARK_GRAY);
		chckbxStaniel.setBounds(369, 232, 97, 23);
		frame.getContentPane().add(chckbxStaniel);
		
		chckbxCaravan = new JCheckBox("Caravan");
		chckbxCaravan.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				chckbxCaravanMouseClicked(e);
			}
		});
		chckbxCaravan.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent e) {
				chckbxCaravanItemStateChanged(e);
			}
		});
		chckbxCaravan.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				chckbxCaravanActionPerformed(arg0);
			}
		});
		chckbxCaravan.setFont(new Font("Tahoma", Font.PLAIN, 14));
		chckbxCaravan.setForeground(Color.WHITE);
		chckbxCaravan.setBackground(Color.DARK_GRAY);
		chckbxCaravan.setBounds(554, 232, 97, 23);
		frame.getContentPane().add(chckbxCaravan);
		
		chckbxSmith = new JCheckBox("Smith");
		chckbxSmith.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				chckbxSmithMouseClicked(e);
			}
		});
		chckbxSmith.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent e) {
				chckbxSmithItemStateChanged(e);
			}
		});
		chckbxSmith.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				chckbxSmithActionPerformed(arg0);
			}
		});
		chckbxSmith.setFont(new Font("Tahoma", Font.PLAIN, 14));
		chckbxSmith.setForeground(Color.WHITE);
		chckbxSmith.setBackground(Color.DARK_GRAY);
		chckbxSmith.setBounds(731, 232, 97, 23);
		frame.getContentPane().add(chckbxSmith);
		chckbxStaniel.setEnabled(false);
		chckbxSmith.setEnabled(false);
		chckbxCaravan.setEnabled(false);
		
		//Item A Staniel
		textField_1 = new JTextField();
		textField_1.setEnabled(false);
		textField_1.addKeyListener(new KeyAdapter() {
			@Override
			public void keyReleased(KeyEvent arg0) {
		        try{
		            if(textField_1.getText().length()>4){
		              JOptionPane.showMessageDialog(null, "Only 4 digits are allowed","ERROR",JOptionPane.ERROR_MESSAGE);
		              textField_1.setText(null);
		            }
		            if(textField_1.getText().equals("")){
		            	textField_4.setText(null);
		            }else{
		            String quantity_get = textField_1.getText();
		         int quantity = Integer.parseInt(quantity_get);
		         int amount = quantity * a;
		         textField_4.setText(String.valueOf(amount));
		            }
		            }catch(Exception e){
		                JOptionPane.showMessageDialog(null, "Invalid input");
		                textField_1.setText(null);
		                textField_4.setText(null);      
			}
			}
			});
		
		textField_1.setColumns(10);
		textField_1.setBounds(368, 259, 98, 20);
		frame.getContentPane().add(textField_1);
		
		//item B Caravan 
		textField_2 = new JTextField();
		textField_1.setEnabled(false);
		textField_2.setEnabled(false);

		textField_2.addKeyListener(new KeyAdapter() {
			@Override
			public void keyReleased(KeyEvent arg0) {
				try{
		            if(textField_2.getText().length()>4){
		              JOptionPane.showMessageDialog(null, "Only 4 digits are allowed","ERROR",JOptionPane.ERROR_MESSAGE);
		              textField_2.setText(null);
		            }
		            if(textField_2.getText().equals("")){
		            	textField_5.setText(null);
		            }else{
		            String quantity_get = textField_2.getText();
		         int quantity = Integer.parseInt(quantity_get);
		         int amount = quantity * b;
		         textField_5.setText(String.valueOf(amount));
		            }
		            }catch(Exception e){
		                JOptionPane.showMessageDialog(null, "Invalid input");
		                textField_2.setText(null);
		                textField_5.setText(null);      
			}
			}
		});
		textField_2.setColumns(10);
		textField_2.setBounds(554, 260, 98, 20);
		frame.getContentPane().add(textField_2);
		
		
		JLabel lblPayment_2 = new JLabel("Quantity");
		lblPayment_2.setForeground(Color.WHITE);
		lblPayment_2.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblPayment_2.setBounds(492, 257, 47, 23);
		frame.getContentPane().add(lblPayment_2);
		
		textField_3 = new JTextField();
		textField_3.addKeyListener(new KeyAdapter() {
			@Override
			public void keyReleased(KeyEvent arg0) {
				try{
		            if(textField_3.getText().length()>4){
		              JOptionPane.showMessageDialog(null, "Only 4 digits are allowed","ERROR",JOptionPane.ERROR_MESSAGE);
		              textField_3.setText(null);
		            }
		            if(textField_3.getText().equals("")){
		            	textField_6.setText(null);
		            }else{
		            String quantity_get = textField_3.getText();
		         int quantity = Integer.parseInt(quantity_get);
		         int amount = quantity * c;
		         textField_6.setText(String.valueOf(amount));
		            }
		            }catch(Exception e){
		                JOptionPane.showMessageDialog(null, "Invalid input");
		                textField_3.setText(null);
		                textField_6.setText(null);      
			}
			}
		});
		textField_3.setEnabled(false);
		textField_3.setColumns(10);
		textField_3.setBounds(730, 260, 98, 20);
		frame.getContentPane().add(textField_3);
		
		JLabel lblPayment_3 = new JLabel("Quantity");
		lblPayment_3.setForeground(Color.WHITE);
		lblPayment_3.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblPayment_3.setBounds(662, 257, 54, 23);
		frame.getContentPane().add(lblPayment_3);
		
		textField_4 = new JTextField();
		textField_4.setEditable(false);
		textField_4.setColumns(10);
		textField_4.setBounds(368, 291, 98, 20);
		frame.getContentPane().add(textField_4);
		
		lblAmount_1 = new JLabel("Amount");
		lblAmount_1.setForeground(Color.WHITE);
		lblAmount_1.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblAmount_1.setBounds(306, 291, 64, 23);
		frame.getContentPane().add(lblAmount_1);
		
		lblAmount_2 = new JLabel("Amount");
		lblAmount_2.setForeground(Color.WHITE);
		lblAmount_2.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblAmount_2.setBounds(492, 289, 64, 23);
		frame.getContentPane().add(lblAmount_2);
		
		textField_5 = new JTextField();
		textField_5.setEditable(false);
		textField_5.setColumns(10);
		textField_5.setBounds(554, 289, 98, 20);
		frame.getContentPane().add(textField_5);
		
		lblAmount_3 = new JLabel("Amount");
		lblAmount_3.setForeground(Color.WHITE);
		lblAmount_3.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblAmount_3.setBounds(662, 289, 54, 23);
		frame.getContentPane().add(lblAmount_3);
		
		textField_6 = new JTextField();
		textField_6.setEditable(false);
		textField_6.setColumns(10);
		textField_6.setBounds(730, 287, 98, 20);
		frame.getContentPane().add(textField_6);
		
		chckbxParker = new JCheckBox("Parker");
		chckbxParker.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				chckbxParkerMouseClicked(arg0);
			}
		});
		chckbxParker.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent arg0) {
				chckbxParkerItemStateChanged(arg0);
			}
		});
		chckbxParker.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				chckbxParkerActionPerformed(arg0);
			}
		});
		chckbxParker.setForeground(Color.WHITE);
		chckbxParker.setFont(new Font("Tahoma", Font.PLAIN, 14));
		chckbxParker.setEnabled(false);
		chckbxParker.setBackground(Color.DARK_GRAY);
		chckbxParker.setBounds(1072, 143, 97, 23);
		frame.getContentPane().add(chckbxParker);
		
		JLabel lblPayment_3_1 = new JLabel("Quantity");
		lblPayment_3_1.setForeground(Color.WHITE);
		lblPayment_3_1.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblPayment_3_1.setBounds(1017, 168, 54, 23);
		frame.getContentPane().add(lblPayment_3_1);
		
		textField_7 = new JTextField();
		textField_7.addKeyListener(new KeyAdapter() {
			@Override
			public void keyReleased(KeyEvent arg0) {
				try{
		            if(textField_7.getText().length()>4){
		              JOptionPane.showMessageDialog(null, "Only 4 digits are allowed","ERROR",JOptionPane.ERROR_MESSAGE);
		              textField_7.setText(null);
		            }
		            if(textField_7.getText().equals("")){
		            	textField_8.setText(null);
		            }else{
		            String quantity_get = textField_7.getText();
		         int quantity = Integer.parseInt(quantity_get);
		         int amount = quantity * d;
		         textField_8.setText(String.valueOf(amount));
		            }
		            }catch(Exception e){
		                JOptionPane.showMessageDialog(null, "Invalid input");
		                textField_7.setText(null);
		                textField_8.setText(null);      
			}
			}
		});
		textField_7.setEnabled(false);
		textField_7.setColumns(10);
		textField_7.setBounds(1071, 171, 98, 20);
		frame.getContentPane().add(textField_7);
		
		JLabel lblAmount_3_1 = new JLabel("Amount");
		lblAmount_3_1.setForeground(Color.WHITE);
		lblAmount_3_1.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblAmount_3_1.setBounds(1017, 200, 54, 23);
		frame.getContentPane().add(lblAmount_3_1);
		
		textField_8 = new JTextField();
		textField_8.setEditable(false);
		textField_8.setColumns(10);
		textField_8.setBounds(1071, 198, 98, 20);
		frame.getContentPane().add(textField_8);
		
		chckbxJames = new JCheckBox("James");
		chckbxJames.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				chckbxJamesMouseClicked(arg0);
			}
		});
		chckbxJames.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent arg0) {
				chckbxJamesItemStateChanged(arg0);
			}
		});
		chckbxJames.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				chckbxJamesActionPerformed(arg0);
			}
		});
		chckbxJames.setForeground(Color.WHITE);
		chckbxJames.setFont(new Font("Tahoma", Font.PLAIN, 14));
		chckbxJames.setEnabled(false);
		chckbxJames.setBackground(Color.DARK_GRAY);
		chckbxJames.setBounds(950, 272, 97, 23);
		frame.getContentPane().add(chckbxJames);
		
		JLabel lblPayment_3_2 = new JLabel("Quantity");
		lblPayment_3_2.setForeground(Color.WHITE);
		lblPayment_3_2.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblPayment_3_2.setBounds(895, 297, 54, 23);
		frame.getContentPane().add(lblPayment_3_2);
		
		textField_9 = new JTextField();
		textField_9.addKeyListener(new KeyAdapter() {
			@Override
			public void keyReleased(KeyEvent arg0) {
				try{
		            if(textField_9.getText().length()>4){
		              JOptionPane.showMessageDialog(null, "Only 4 digits are allowed","ERROR",JOptionPane.ERROR_MESSAGE);
		              textField_9.setText(null);
		            }
		            if(textField_9.getText().equals("")){
		            	textField_10.setText(null);
		            }else{
		            String quantity_get = textField_9.getText();
		         int quantity = Integer.parseInt(quantity_get);
		         int amount = quantity * ed;
		         textField_10.setText(String.valueOf(amount));
		            }
		            }catch(Exception e){
		                JOptionPane.showMessageDialog(null, "Invalid input");
		                textField_9.setText(null);
		                textField_10.setText(null);      
			}
			}
		});
		textField_9.setEnabled(false);
		textField_9.setColumns(10);
		textField_9.setBounds(949, 300, 98, 20);
		frame.getContentPane().add(textField_9);
		
		JLabel lblAmount_3_2 = new JLabel("Amount");
		lblAmount_3_2.setForeground(Color.WHITE);
		lblAmount_3_2.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblAmount_3_2.setBounds(895, 329, 54, 23);
		frame.getContentPane().add(lblAmount_3_2);
		
		textField_10 = new JTextField();
		textField_10.setEditable(false);
		textField_10.setColumns(10);
		textField_10.setBounds(949, 327, 98, 20);
		frame.getContentPane().add(textField_10);
		
		chckbxPaul = new JCheckBox("Paul");
		chckbxPaul.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				chckbxPaulMouseClicked(arg0);
			}
		});
		chckbxPaul.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent arg0) {
				chckbxPaulItemStateChanged(arg0);
			}
		});
		chckbxPaul.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				chckbxPaulActionPerformed(arg0);
			}
		});
		chckbxPaul.setForeground(Color.WHITE);
		chckbxPaul.setFont(new Font("Tahoma", Font.PLAIN, 14));
		chckbxPaul.setEnabled(false);
		chckbxPaul.setBackground(Color.DARK_GRAY);
		chckbxPaul.setBounds(986, 501, 97, 23);
		frame.getContentPane().add(chckbxPaul);
		
		JLabel lblPayment_3_3 = new JLabel("Quantity");
		lblPayment_3_3.setForeground(Color.WHITE);
		lblPayment_3_3.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblPayment_3_3.setBounds(931, 526, 54, 23);
		frame.getContentPane().add(lblPayment_3_3);
		
		textField_11 = new JTextField();
		textField_11.addKeyListener(new KeyAdapter() {
			@Override
			public void keyReleased(KeyEvent arg0) {
				try{
		            if(textField_11.getText().length()>4){
		              JOptionPane.showMessageDialog(null, "Only 4 digits are allowed","ERROR",JOptionPane.ERROR_MESSAGE);
		              textField_11.setText(null);
		            }
		            if(textField_11.getText().equals("")){
		            	textField_12.setText(null);
		            }else{
		            String quantity_get = textField_11.getText();
		         int quantity = Integer.parseInt(quantity_get);
		         int amount = quantity * f;
		         textField_12.setText(String.valueOf(amount));
		            }
		            }catch(Exception e){
		                JOptionPane.showMessageDialog(null, "Invalid input");
		                textField_11.setText(null);
		                textField_12.setText(null);      
			}
			}
		});
		textField_11.setEnabled(false);
		textField_11.setColumns(10);
		textField_11.setBounds(985, 529, 98, 20);
		frame.getContentPane().add(textField_11);
		
		JLabel lblAmount_3_3 = new JLabel("Amount");
		lblAmount_3_3.setForeground(Color.WHITE);
		lblAmount_3_3.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblAmount_3_3.setBounds(931, 558, 54, 23);
		frame.getContentPane().add(lblAmount_3_3);
		
		textField_12 = new JTextField();
		textField_12.setEditable(false);
		textField_12.setColumns(10);
		textField_12.setBounds(985, 556, 98, 20);
		frame.getContentPane().add(textField_12);
		
		btnClose = new JButton("");
		btnClose.setToolTipText("Close");
		btnClose.setIcon(new ImageIcon("C:\\Users\\HP\\eclipse-workspace\\Oxygn\\src\\ss.png"));
		btnClose.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if (JOptionPane.showConfirmDialog( frame,"confirm if you Want to Exit","Name of the Application or Title",
			            JOptionPane.YES_NO_OPTION)==JOptionPane.YES_OPTION)
			            System.exit(0);
			}
		});
		btnClose.setForeground(Color.WHITE);
		btnClose.setBackground(Color.RED);
		btnClose.setBorderPainted(false);
		btnClose.setFocusPainted(false);
		btnClose.setContentAreaFilled(false);
		btnClose.setBounds(1151, 11, 39, 36);
		frame.getContentPane().add(btnClose);
		
		Change_1 = new JLabel("");
		Change_1.setHorizontalAlignment(SwingConstants.CENTER);
		Change_1.setForeground(Color.WHITE);
		Change_1.setFont(new Font("Tahoma", Font.PLAIN, 24));
		Change_1.setBounds(20, 140, 180, 36);
		frame.getContentPane().add(Change_1);
		
		sukli = new JTextField();
		sukli.setEditable(false);
		sukli.setForeground(Color.DARK_GRAY);
		sukli.setBorder(null);
		sukli.setBackground(Color.DARK_GRAY);
		sukli.setColumns(10);
		sukli.setBounds(10, 521, 0, 14);
		frame.getContentPane().add(sukli);
		
		Change = new JLabel("Change");
		Change.setForeground(Color.WHITE);
		Change.setFont(new Font("Tahoma", Font.PLAIN, 24));
		Change.setBounds(20, 92, 146, 36);
		frame.getContentPane().add(Change);
		
		payment = new JTextField();
		payment.setForeground(Color.DARK_GRAY);
		payment.setBorder(null);
		payment.setEditable(false);
		payment.setBackground(Color.DARK_GRAY);
		payment.setColumns(10);
		payment.setBounds(263, 341, -4, -12);
		frame.getContentPane().add(payment);
		
		chckbxTempest = new JCheckBox("Tempest");
		chckbxTempest.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				chckbxTempestMouseClicked(e);
			}
		});
		chckbxTempest.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent arg0) {
				chckbxTempestItemStateChanged(arg0);
			}
		});
		chckbxTempest.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				chckbxTempestActionPerformed(arg0);
			}
		});
		chckbxTempest.setForeground(Color.WHITE);
		chckbxTempest.setFont(new Font("Tahoma", Font.PLAIN, 14));
		chckbxTempest.setEnabled(false);
		chckbxTempest.setBackground(Color.DARK_GRAY);
		chckbxTempest.setBounds(369, 489, 97, 23);
		frame.getContentPane().add(chckbxTempest);
		
		textField01 = new JTextField();
		textField01.addKeyListener(new KeyAdapter() {
			@Override
			public void keyReleased(KeyEvent arg0) {
				try{
		            if(textField01.getText().length()>4){
		              JOptionPane.showMessageDialog(null, "Only 4 digits are allowed","ERROR",JOptionPane.ERROR_MESSAGE);
		              textField01.setText(null);
		            }
		            if(textField01.getText().equals("")){
		            	textField_13.setText(null);
		            }else{
		            String quantity_get = textField01.getText();
		         int quantity = Integer.parseInt(quantity_get);
		         int amount = quantity * tempest;
		         textField_13.setText(String.valueOf(amount));
		            }
		            }catch(Exception e){
		                JOptionPane.showMessageDialog(null, "Invalid input");
		                textField01.setText(null);
		                textField_13.setText(null);      
			}
			}
		});
		textField01.setEnabled(false);
		textField01.setColumns(10);
		textField01.setBounds(368, 516, 98, 20);
		frame.getContentPane().add(textField01);
		
		JLabel lblPayment_1 = new JLabel("Quantity");
		lblPayment_1.setForeground(Color.WHITE);
		lblPayment_1.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblPayment_1.setBounds(306, 514, 64, 23);
		frame.getContentPane().add(lblPayment_1);
		
		JLabel lblAmount_1_1 = new JLabel("Amount");
		lblAmount_1_1.setForeground(Color.WHITE);
		lblAmount_1_1.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblAmount_1_1.setBounds(306, 548, 64, 23);
		frame.getContentPane().add(lblAmount_1_1);
		
		textField_13 = new JTextField();
		textField_13.setEditable(false);
		textField_13.setColumns(10);
		textField_13.setBounds(368, 548, 98, 20);
		frame.getContentPane().add(textField_13);
		
		chckbxJoy = new JCheckBox("Joy");
		chckbxJoy.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				chckbxMouseClicked(e);
			}
		});
		chckbxJoy.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent arg0) {
				chckbxJoyItemStateChanged(arg0);
			}
		});
		chckbxJoy.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				chckbxJoyActionPerformed(arg0);
			}
		});
		chckbxJoy.setForeground(Color.WHITE);
		chckbxJoy.setFont(new Font("Tahoma", Font.PLAIN, 14));
		chckbxJoy.setEnabled(false);
		chckbxJoy.setBackground(Color.DARK_GRAY);
		chckbxJoy.setBounds(555, 489, 97, 23);
		frame.getContentPane().add(chckbxJoy);
		
		textField02 = new JTextField();
		textField02.addKeyListener(new KeyAdapter() {
			@Override
			public void keyReleased(KeyEvent arg0) {
				try{
		            if(textField02.getText().length()>4){
		              JOptionPane.showMessageDialog(null, "Only 4 digits are allowed","ERROR",JOptionPane.ERROR_MESSAGE);
		              textField02.setText(null);
		            }
		            if(textField02.getText().equals("")){
		            	textField_14.setText(null);
		            }else{
		            String quantity_get = textField02.getText();
		         int quantity = Integer.parseInt(quantity_get);
		         int amount = quantity * jolly;
		         textField_14.setText(String.valueOf(amount));
		            }
		            }catch(Exception e){
		                JOptionPane.showMessageDialog(null, "Invalid input");
		                textField02.setText(null);
		                textField_14.setText(null);      
			}
			}
		});
		textField02.setEnabled(false);
		textField02.setColumns(10);
		textField02.setBounds(554, 516, 98, 20);
		frame.getContentPane().add(textField02);
		
		JLabel lblPayment_4 = new JLabel("Quantity");
		lblPayment_4.setForeground(Color.WHITE);
		lblPayment_4.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblPayment_4.setBounds(492, 514, 64, 23);
		frame.getContentPane().add(lblPayment_4);
		
		JLabel lblAmount_1_2 = new JLabel("Amount");
		lblAmount_1_2.setForeground(Color.WHITE);
		lblAmount_1_2.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblAmount_1_2.setBounds(492, 548, 64, 23);
		frame.getContentPane().add(lblAmount_1_2);
		
		textField_14 = new JTextField();
		textField_14.setEditable(false);
		textField_14.setColumns(10);
		textField_14.setBounds(554, 548, 98, 20);
		frame.getContentPane().add(textField_14);
		
		chckbxSanji = new JCheckBox("Sanji");
		chckbxSanji.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				chckbxSanjiMouseClicked(e);
			}
		});
		chckbxSanji.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent arg0) {
				chckbxSanjiItemStateChanged(arg0);
			}
		});
		chckbxSanji.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				chckbxSanjiActionPerformed(arg0);
			}
		});
		chckbxSanji.setForeground(Color.WHITE);
		chckbxSanji.setFont(new Font("Tahoma", Font.PLAIN, 14));
		chckbxSanji.setEnabled(false);
		chckbxSanji.setBackground(Color.DARK_GRAY);
		chckbxSanji.setBounds(731, 491, 97, 23);
		frame.getContentPane().add(chckbxSanji);
		
		textField03 = new JTextField();
		textField03.addKeyListener(new KeyAdapter() {
			@Override
			public void keyReleased(KeyEvent arg0) {
				try{
		            if(textField03.getText().length()>4){
		              JOptionPane.showMessageDialog(null, "Only 4 digits are allowed","ERROR",JOptionPane.ERROR_MESSAGE);
		              textField03.setText(null);
		            }
		            if(textField03.getText().equals("")){
		            	textField_15.setText(null);
		            }else{
		            String quantity_get = textField03.getText();
		         int quantity = Integer.parseInt(quantity_get);
		         int amount = quantity * sanji;
		         textField_15.setText(String.valueOf(amount));
		            }
		            }catch(Exception e){
		                JOptionPane.showMessageDialog(null, "Invalid input");
		                textField03.setText(null);
		                textField_15.setText(null);      
			}
			}
		});
		textField03.setEnabled(false);
		textField03.setColumns(10);
		textField03.setBounds(730, 518, 98, 20);
		frame.getContentPane().add(textField03);
		
		JLabel lblPayment_5 = new JLabel("Quantity");
		lblPayment_5.setForeground(Color.WHITE);
		lblPayment_5.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblPayment_5.setBounds(668, 516, 64, 23);
		frame.getContentPane().add(lblPayment_5);
		
		JLabel lblAmount_1_3 = new JLabel("Amount");
		lblAmount_1_3.setForeground(Color.WHITE);
		lblAmount_1_3.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblAmount_1_3.setBounds(668, 550, 64, 23);
		frame.getContentPane().add(lblAmount_1_3);
		
		textField_15 = new JTextField();
		textField_15.setEditable(false);
		textField_15.setColumns(10);
		textField_15.setBounds(730, 550, 98, 20);
		frame.getContentPane().add(textField_15);
		
		texReceipt = new JTextArea();
		texReceipt.setBounds(20, 195, 217, 295);
		frame.getContentPane().add(texReceipt);
		
		lblNewLabel_3 = new JLabel("");
		lblNewLabel_3.setIcon(new ImageIcon("C:\\Users\\HP\\Pictures\\Project Pictures\\My Designs\\oxygn.jpg"));
		lblNewLabel_3.setBounds(32, 204, 180, 76);
		frame.getContentPane().add(lblNewLabel_3);
	}

	protected void chckbxSanjiMouseClicked(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	protected void chckbxSanjiItemStateChanged(ItemEvent arg0) {
		// TODO Auto-generated method stub
		if(arg0.getStateChange() == ItemEvent.DESELECTED){
	         //   System.out.println("Deselected!");
	            textField03.setText("");
	            textField_15.setText("");
	            textField03.setEnabled(false);
	            
	        }else{
	             // System.out.println("Selected");
	        	textField_15.setEnabled(true);
	        }
	}

	protected void chckbxSanjiActionPerformed(ActionEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	protected void chckbxMouseClicked(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	protected void chckbxJoyItemStateChanged(ItemEvent arg0) {
		// TODO Auto-generated method stub
		if(arg0.getStateChange() == ItemEvent.DESELECTED){
	         //   System.out.println("Deselected!");
	            textField02.setText("");
	            textField_14.setText("");
	            textField02.setEnabled(false);
	            
	        }else{
	             // System.out.println("Selected");
	        	textField_14.setEnabled(true);
	        }
	}

	protected void chckbxJoyActionPerformed(ActionEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	protected void chckbxTempestMouseClicked(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	protected void chckbxTempestItemStateChanged(ItemEvent arg0) {
		// TODO Auto-generated method stub
		if(arg0.getStateChange() == ItemEvent.DESELECTED){
	         //   System.out.println("Deselected!");
	            textField01.setText("");
	            textField_13.setText("");
	            textField01.setEnabled(false);
	            
	        }else{
	             // System.out.println("Selected");
	        	textField_13.setEnabled(true);
	        }
	}

	protected void chckbxTempestActionPerformed(ActionEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	private void computeActionPerformed(ActionEvent arg0) {
		// TODO Auto-generated method stub
		int v1 = 0 ;  
        int v2;
        int v3;
        int v4;
        int v5;
        int v6;
        int v7;
        int v8;
        int v9;
        
		
		if(textField_4.getText().equals("")) {
			textField_4.setText(null);
			v1 = 0;
		}else {
			v1 = Integer.parseInt(textField_4.getText());
		}
		//v1
		if(textField_5.getText().equals("")){
	           
			textField_5.setText(null);
             v2 = 0;
        }else{
                v2 = Integer.parseInt(textField_5.getText()) ;
        }
		//v2
        if(textField_6.getText().equals("")){
   
        	textField_6.setText(null);
                     v3 = 0;
        }else{
             v3 = Integer.parseInt(textField_6.getText()) ;  
        }
        //v3
         if(textField_8.getText().equals("")){
           
        	 textField_8.setText(null);
             v4 = 0;
        }else{
                       
        	v4 =  Integer.parseInt(textField_8.getText());  
         }
         //v4
          if(textField_10.getText().equals("")){
         
        	  textField_10.setText(null); 
               v5 = 0;
        }else{
              v5 =  Integer.parseInt(textField_10.getText()) ;     
          }
          //v5
           if(textField_12.getText().equals("")){
          
        	   textField_12.setText(null);
              v6 = 0;
        }else{
                 v6 =   Integer.parseInt(textField_12.getText()) ;    
           }
           //v6
           if(textField_13.getText().equals("")){
               
        	   textField_13.setText(null);
              v7 = 0;
        }else{
                 v7 =   Integer.parseInt(textField_13.getText()) ;    
           }
           //v7
		if(textField_14.getText().equals("")){
		               
		        	   textField_14.setText(null);
		              v8 = 0;
		        }else{
		                 v8 =   Integer.parseInt(textField_14.getText()) ;    
		           }
		//v8
		if(textField_15.getText().equals("")){
            
     	   textField_15.setText(null);
           v9 = 0;
     }else{
              v9 =   Integer.parseInt(textField_15.getText()) ;    
        }
          try{
               
               double total_amount = v1+v2+v3+v4+v5+v6+v7+v8+v9;
       if(total_amount==0){
       JOptionPane.showMessageDialog(null, "Total amount is 0");
        }else{
     
    total.setText(String.valueOf(total_amount));
    double customer_cash = 0;
              try{  
                  String input = JOptionPane.showInputDialog(null,"Please enter customer cash","Customer cash",JOptionPane.INFORMATION_MESSAGE);
    
                 customer_cash = Double.parseDouble(input); 
              
                 if(total_amount>customer_cash){
                       JOptionPane.showMessageDialog(null, "Customer cash is not enough");
                 }else{
                      double change = customer_cash  - total_amount;
        sukli.setText(String.valueOf(change));
       payment.setText(String.valueOf(customer_cash));
       JOptionPane.showMessageDialog(null, "Total amount "+total_amount+"\n"+"Cash entered "+customer_cash+"\n"+"Total change "+change);
       Change_1.setText(change+"");
                 }
    }catch(Exception e){
                   JOptionPane.showMessageDialog(null, "Invalid Input");
               }
       }
    }catch(Exception e){
        
    }

	}

	protected void chckbxPaulMouseClicked(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	protected void chckbxPaulItemStateChanged(ItemEvent arg0) {
		// TODO Auto-generated method stub
		if(arg0.getStateChange() == ItemEvent.DESELECTED){
	         //   System.out.println("Deselected!");
	            textField_11.setText("");
	            textField_12.setText("");
	            textField_11.setEnabled(false);
	            
	        }else{
	             // System.out.println("Selected");
	        	textField_12.setEnabled(true);
	        }
	}

	protected void chckbxPaulActionPerformed(ActionEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	protected void chckbxJamesMouseClicked(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	protected void chckbxJamesItemStateChanged(ItemEvent arg0) {
		// TODO Auto-generated method stub
		if(arg0.getStateChange() == ItemEvent.DESELECTED){
	         //   System.out.println("Deselected!");
	            textField_9.setText("");
	            textField_10.setText("");
	            textField_9.setEnabled(false);
	            
	        }else{
	             // System.out.println("Selected");
	        	textField_10.setEnabled(true);
	        }
	}

	protected void chckbxJamesActionPerformed(ActionEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	protected void chckbxParkerMouseClicked(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	protected void chckbxParkerItemStateChanged(ItemEvent arg0) {
		// TODO Auto-generated method stub
		if(arg0.getStateChange() == ItemEvent.DESELECTED){
	         //   System.out.println("Deselected!");
	            textField_7.setText("");
	            textField_8.setText("");
	            textField_7.setEnabled(false);
	            
	        }else{
	             // System.out.println("Selected");
	        	textField_8.setEnabled(true);
	        }
	}

	protected void chckbxParkerActionPerformed(ActionEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	protected void chckbxSmithMouseClicked(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	protected void chckbxSmithItemStateChanged(ItemEvent e) {
		// TODO Auto-generated method stub
		if(e.getStateChange() == ItemEvent.DESELECTED){
	         //   System.out.println("Deselected!");
	            textField_6.setText("");
	            textField_3.setText("");
	            textField_6.setEnabled(false);
	            
	        }else{
	             // System.out.println("Selected");
	        	textField_6.setEnabled(true);
	        }
	}

	protected void chckbxSmithActionPerformed(ActionEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	protected void chckbxCaravanMouseClicked(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	protected void chckbxCaravanItemStateChanged(ItemEvent e) {
		// TODO Auto-generated method stub
		if(e.getStateChange() == ItemEvent.DESELECTED){
	         //   System.out.println("Deselected!");
	            textField_5.setText("");
	            textField_2.setText("");
	            textField_5.setEnabled(false);
	            
	        }else{
	             // System.out.println("Selected");
	        	textField_5.setEnabled(true);
	        }
	}

	protected void chckbxCaravanActionPerformed(ActionEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	protected void chckbxStanielItemStateChanged(ItemEvent arg0) {
		// TODO Auto-generated method stub
		 if(arg0.getStateChange() == ItemEvent.DESELECTED){
	         //   System.out.println("Deselected!");
	            textField_4.setText("");
	            textField_1.setText("");
	            textField_4.setEnabled(false);
	            
	        }else{
	             // System.out.println("Selected");
	        	textField_4.setEnabled(true);
	        }
	}

	protected void chckbxStanielActionPerformed(ActionEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	protected void chckbxStanielMouseClicked(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}
}
