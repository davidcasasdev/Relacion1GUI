package gui;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Ejercicio1 extends JFrame {

	private JPanel contentPane;
	private JLabel lblResultado;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Ejercicio1 frame = new Ejercicio1();
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
	public Ejercicio1() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		
		lblResultado = new JLabel("");
		lblResultado.setFont(new Font("Tahoma", Font.PLAIN, 14));
		contentPane.add(lblResultado);
		
		JButton btn1 = new JButton("Botón 1");
		btn1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				cambiarEtiqueta("botón 1");
			}
		});
	
		contentPane.add(btn1);
		
		JButton btn2 = new JButton("Botón 2");
		btn2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				cambiarEtiqueta("botón 2");
			}
		});
		
		contentPane.add(btn2);
	}

	
	
	protected void cambiarEtiqueta1() {
		lblResultado.setText("Has pulsado el botón 1");	
	}
	
	protected void cambiarEtiqueta2() {
		lblResultado.setText("Has pulsado el botón 2");	
	}

	protected void cambiarEtiqueta(String texto) {
		lblResultado.setText("Has pulsado:"+texto);
		
	}




}
