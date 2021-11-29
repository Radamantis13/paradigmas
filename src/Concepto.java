import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import java.awt.Font;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Concepto extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	
	public void abrirFRame() {
		
		PruebaGrafica form = new PruebaGrafica();
		form.setVisible(true);
		this.dispose();
		
	}
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Concepto frame = new Concepto();
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
	public Concepto() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 538, 439);
		contentPane = new JPanel();
		contentPane.setForeground(Color.BLUE);
		contentPane.setBackground(Color.BLUE);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		this.getContentPane().setBackground(getBackground());
		this.setLocationRelativeTo(null);
		this.setTitle("Concepto");
		this.getContentPane().setBackground(getBackground());
		
		JLabel lblTitulo = new JLabel("BABY SUMA");
		lblTitulo.setForeground(Color.BLUE);
		lblTitulo.setFont(new Font("Tahoma", Font.PLAIN, 25));
		lblTitulo.setBounds(182, 11, 138, 37);
		contentPane.add(lblTitulo);
		
		JLabel lblNewLabel = new JLabel("Que significa sumar");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblNewLabel.setForeground(Color.BLACK);
		lblNewLabel.setBounds(10, 44, 182, 30);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("consiste en reunir varias cantidades en una sola");
		lblNewLabel_1.setForeground(Color.BLACK);
		lblNewLabel_1.setBounds(10, 51, 299, 49);
		contentPane.add(lblNewLabel_1);
		
		JButton btnNewButton = new JButton("Volver al juego");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				abrirFRame();
			}
		});
		btnNewButton.setBounds(26, 346, 125, 23);
		contentPane.add(btnNewButton);
		
		JLabel lblEjemplos = new JLabel("New label");
		lblEjemplos.setBackground(Color.BLUE);
		lblEjemplos.setIcon(new ImageIcon("C:\\Programacion\\Workspaces\\JuegoSuma\\imagenes\\Concepto.png"));
		lblEjemplos.setBounds(0, 0, 522, 400);
		contentPane.add(lblEjemplos);
	}
}
