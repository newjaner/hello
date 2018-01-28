import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.Scrollbar;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.AdjustmentEvent;
import java.awt.event.AdjustmentListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.TextEvent;
import java.awt.event.TextListener;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JRadioButton;
import javax.swing.JTextField;
import javax.swing.JScrollBar;

public class Aaa extends JFrame implements ActionListener {

	private ButtonGroup grpOpciones;
	private JPanel contentPane;
	private JRadioButton btn1;
	private JRadioButton btn2;
	private JRadioButton btn3;
	private JTextField textField;
	private JScrollBar scrollBar;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Aaa frame = new Aaa();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Aaa() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 585, 440);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		btn1 = new JRadioButton("A1");
		btn1.setBounds(35, 73, 127, 25);
		contentPane.add(btn1);
		
		btn2 = new JRadioButton("A2");
		btn2.setBounds(35, 125, 127, 25);
		contentPane.add(btn2);
		
		btn3 = new JRadioButton("A3");
		btn3.setBounds(35, 183, 127, 25);
		contentPane.add(btn3);
		
		grpOpciones=new ButtonGroup();
		grpOpciones.add(btn1);
		grpOpciones.add(btn2);
		grpOpciones.add(btn3);
		
		textField = new JTextField();
		textField.setBounds(67, 282, 116, 22);
		contentPane.add(textField);
		textField.setColumns(10);
		
		scrollBar = new JScrollBar();
		scrollBar.setOrientation(JScrollBar.HORIZONTAL);
		scrollBar.setBounds(296, 282, 154, 25);
		contentPane.add(scrollBar);
		
		btn1.addActionListener(this);
		btn2.addActionListener(this);
		btn3.addActionListener(this);
		
		scrollBar.addAdjustmentListener(new AdjustmentListener() {
			
			@Override
			public void adjustmentValueChanged(AdjustmentEvent e) {
				// TODO Auto-generated method stub
				textField.setText(e.getValue()+"");
			}
		});
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if((JRadioButton)e.getSource()==btn1){
			scrollBar.setValue(50);
		}
		if((JRadioButton)e.getSource()==btn2){
			
		}
		
		
	}
}
