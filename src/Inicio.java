import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import javax.swing.ImageIcon;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;
import java.awt.Color;
import javax.swing.JTextField;
import java.awt.Font;
import java.awt.Cursor;

public class Inicio extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 * 
	 */
	//METODO PARA ABRIR EL FRAME PRUEBA GRAFICA
	public void abrirFRame() {
		
		PruebaGrafica form = new PruebaGrafica();
		form.setVisible(true);
		this.dispose();
		
	}
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Inicio frame = new Inicio();
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
	public Inicio() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 625, 383);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		this.getContentPane().setBackground(getBackground());
		this.setLocationRelativeTo(null);
		this.setTitle("menu inicio");
		this.getContentPane().setBackground(getBackground());
		
		JButton btnEmpezar = new JButton("Empezar");
		btnEmpezar.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnEmpezar.setForeground(Color.BLACK);
		btnEmpezar.setBackground(new Color(65, 105, 225));
		btnEmpezar.setIcon(null);
		btnEmpezar.addActionListener(new ActionListener() {
			
			/*METODO PARA INVOCAR EL METODO PARA ABRIR EL FRAME 
			 * PRUEBA GRAFICA POR MEDIO DE LA ACCION DEL BOTON
			*/
			public void actionPerformed(ActionEvent e) {
				abrirFRame();
			}
		});
		btnEmpezar.setBounds(44, 296, 89, 23);
		contentPane.add(btnEmpezar);
		this.setLocationRelativeTo(null);
		this.setTitle("menu inicio");
		this.getContentPane().setBackground(getBackground());
		
		JLabel lblTitulo = new JLabel("BABY SUMA");
		lblTitulo.setFont(new Font("Tahoma", Font.PLAIN, 25));
		lblTitulo.setForeground(new Color(255, 255, 0));
		lblTitulo.setBounds(220, 11, 167, 35);
		contentPane.add(lblTitulo);
		
		JLabel lblNewLabel = new JLabel("New label");
		lblNewLabel.setIcon(new ImageIcon("C:\\Programacion\\Workspaces\\JuegoSuma\\imagenes\\Fondo.png"));
		lblNewLabel.setBounds(0, 0, 609, 344);
		contentPane.add(lblNewLabel);
		this.setLocationRelativeTo(null);
		this.setTitle("menu principal");
		
		
		
		
	}
}
