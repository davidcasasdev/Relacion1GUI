package gui;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import net.miginfocom.swing.MigLayout;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Ejercicio2 extends JFrame {

	private JPanel contentPane;
	private JLabel lblContador1;
	private int cont1;
	private int cont2;
	private JLabel lblContador2;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Ejercicio2 frame = new Ejercicio2();
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
	public Ejercicio2() {
		cont1=0;
		cont2=0;
		setTitle("Ejercicio 2");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(new MigLayout("", "[grow][][][][grow][][][][grow]", "[][][][]"));
		
		JLabel lblNewLabel = new JLabel("Botón 1:");
		contentPane.add(lblNewLabel, "cell 1 1");
		
		lblContador1 = new JLabel("");
		contentPane.add(lblContador1, "cell 2 1");
		
		JLabel lblNewLabel_2 = new JLabel("veces");
		contentPane.add(lblNewLabel_2, "cell 3 1");
		
		JLabel lblNewLabel_3 = new JLabel("Botón 2:");
		contentPane.add(lblNewLabel_3, "cell 5 1");
		
		lblContador2 = new JLabel("");
		contentPane.add(lblContador2, "cell 6 1");
		
		JLabel lblNewLabel_5 = new JLabel("veces");
		contentPane.add(lblNewLabel_5, "cell 7 1");
		
		JButton btn1 = new JButton("Botón 1");
		btn1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				contar1();
			}
		});
		contentPane.add(btn1, "cell 1 2 3 1,alignx center");
		
		JButton btn2 = new JButton("Botón 2");
		btn2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				contar2();
			}
		});
		contentPane.add(btn2, "cell 5 2 3 1,alignx center");
		
		JButton btnNewButton = new JButton("Borar Cont 1");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				cont1=0;
				lblContador1.setText(""+cont1);
			}
		});
		contentPane.add(btnNewButton, "cell 1 3 3 1,alignx center");
		
		JButton btnNewButton_1 = new JButton("Borrar Cont 2");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				cont2=-1;
				contar2();
			}
		});
		contentPane.add(btnNewButton_1, "cell 5 3 3 1,alignx center");
		//getRootPane().setDefaultButton(btnAceptar);
	}

	protected void contar1() {
		cont1++;
		lblContador1.setText(""+cont1);lblContador1.setText(""+cont1);	
	}
	
	protected void contar2() {
		cont2++;
		lblContador2.setText(""+cont2);	
	}
	
//	protected void contar(int boton) {
//		if (boton==0) {
//			cont1++;
//			lblContador1.setText(""+cont1);	
//		} else {
//			cont2++;
//			lblContador2.setText(""+cont2);	
//		}
//	}

}
