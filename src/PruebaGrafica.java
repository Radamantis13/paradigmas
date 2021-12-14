import java.awt.BorderLayout;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.print.attribute.standard.Media;
import javax.swing.ImageIcon;
import java.awt.Color;
import java.awt.Font;
import java.awt.MediaTracker;

import javax.swing.SwingConstants;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextField;
import java.awt.Cursor;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.io.File;
import java.applet.AudioClip;
import javax.swing.JProgressBar;

public class PruebaGrafica extends JFrame {

	private JPanel contentPane;
	private JTextField textSumandouno;
	private JTextField textSumandodos;
	private JTextField textProgreso;
	
	//variables sonido
	
	

	/**
	 * Launch the application.
	 */
    	public void abrirFRame() {
		
    		Inicio form = new Inicio();
    		form.setVisible(true);
    		this.dispose();
		
    	}
    	
    	// abrir frame de concepto
    	
    	public void abrirConcepto() {
    		
    		Concepto form = new Concepto();
    		form.setVisible(true);
    		this.dispose();
		
    	}
    	
    	public int puntaje(int conta) {
			return conta;
    		
    	}
    	
    	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					PruebaGrafica frame = new PruebaGrafica();
					frame.setVisible(true);
					frame.setLocationRelativeTo(null);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public PruebaGrafica() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 693, 444);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblTituloPrincipal = new JLabel("BABY SUMA");
		lblTituloPrincipal.setHorizontalAlignment(SwingConstants.CENTER);
		lblTituloPrincipal.setFont(new Font("Cooper Black", Font.PLAIN, 20));
		lblTituloPrincipal.setForeground(Color.MAGENTA);
		lblTituloPrincipal.setIcon(null);
		lblTituloPrincipal.setBounds(302, 33, 154, 22);
		contentPane.add(lblTituloPrincipal);
		
		JLabel lblResultados = new JLabel("Opciones de Resultados");
		lblResultados.setFont(new Font("Cooper Black", Font.PLAIN, 23));
		lblResultados.setForeground(Color.MAGENTA);
		lblResultados.setBounds(10, 60, 297, 45);
		contentPane.add(lblResultados);
		
		JMenuBar menuBar = new JMenuBar();
		menuBar.setBounds(0, 0, 765, 22);
		contentPane.add(menuBar);
		
		JMenu mnNewMenu = new JMenu("Opciones");
		menuBar.add(mnNewMenu);
		
		this.getContentPane().setBackground(getBackground());
		this.setLocationRelativeTo(null);
		this.setTitle("Juego");
		this.getContentPane().setBackground(getBackground());
		
		JMenuItem mntmNewMenuItem = new JMenuItem("Salir");
		mntmNewMenuItem.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		mnNewMenu.add(mntmNewMenuItem);
		
		textSumandouno = new JTextField();
		textSumandouno.setText("1");
		textSumandouno.setEditable(false);
		textSumandouno.setBounds(405, 236, 44, 20);
		contentPane.add(textSumandouno);
		textSumandouno.setColumns(10);
		
		JLabel lblSumandouno = new JLabel("Sumando Uno");
		lblSumandouno.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblSumandouno.setForeground(Color.BLUE);
		lblSumandouno.setBounds(302, 239, 90, 14);
		contentPane.add(lblSumandouno);
		
		JLabel lblSumandoDos = new JLabel("Sumando Dos");
		lblSumandoDos.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblSumandoDos.setForeground(Color.BLUE);
		lblSumandoDos.setBounds(302, 279, 100, 14);
		contentPane.add(lblSumandoDos);
		
		textSumandodos = new JTextField();
		textSumandodos.setBounds(405, 276, 44, 20);
		contentPane.add(textSumandodos);
		textSumandodos.setColumns(10);
		
		textProgreso = new JTextField();
		textProgreso.setText("0%");
		textProgreso.setEditable(true);
		textProgreso.setBounds(337, 78, 146, 14);
		contentPane.add(textProgreso);
		textProgreso.setColumns(10);
		
		JLabel lblTomJerry = new JLabel("New label");
		lblTomJerry.setIcon(new ImageIcon("C:\\Programacion\\Workspaces\\JuegoSuma\\imagenes\\icono.jpg"));
		lblTomJerry.setBounds(453, 236, 219, 165);
		contentPane.add(lblTomJerry);
		
		JButton btnUno = new JButton("New button");
		btnUno.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int uno = Integer.parseInt(textSumandouno.getText());
				int dos = Integer.parseInt(textSumandodos.getText());
				int resultado = 0; 
				resultado = uno + dos;
				if (dos <= 10) {
					if(resultado == 1) {
						JOptionPane.showMessageDialog(null, "correcto ");
						textProgreso.setText("100%");
						
					}else {
						JOptionPane.showMessageDialog(null, "incorrecto ");
						textProgreso.setText("0%");
					}
				}else {
					JOptionPane.showMessageDialog(null, "el valor a sumar es mayor a 10 ");
				}
				
					
			}
		});
		btnUno.setIcon(new ImageIcon("C:\\Programacion\\Workspaces\\JuegoSuma\\imagenes\\1.png"));
		btnUno.setBounds(20, 116, 55, 115);
		contentPane.add(btnUno);
		
		JButton btnDos = new JButton("New button");
		btnDos.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int uno = Integer.parseInt(textSumandouno.getText());
				int dos = Integer.parseInt(textSumandodos.getText());
				int resultado = 0; 
				resultado = uno + dos;
				if (dos <= 10) {
					if(resultado == 2) {
						JOptionPane.showMessageDialog(null, "correcto ");
						textProgreso.setText("100%");
					}else {
						JOptionPane.showMessageDialog(null, "incorrecto ");
						textProgreso.setText("0%");
					}
				}else {
					JOptionPane.showMessageDialog(null, "el valor a sumar es mayor a 10 ");
				}
				
			}
		});
		btnDos.setIcon(new ImageIcon("C:\\Programacion\\Workspaces\\JuegoSuma\\imagenes\\2.png"));
		btnDos.setBounds(85, 122, 86, 103);
		contentPane.add(btnDos);
		
		JButton btnTres = new JButton("New button");
		btnTres.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int uno = Integer.parseInt(textSumandouno.getText());
				int dos = Integer.parseInt(textSumandodos.getText());
				int resultado = 0; 
				resultado = uno + dos;
				if (dos <= 10) {
					if(resultado == 3) {
						JOptionPane.showMessageDialog(null, "correcto ");
						textProgreso.setText("100%");
					}else {
						JOptionPane.showMessageDialog(null, "incorrecto ");
						textProgreso.setText("0%");
					}
				}else {
					JOptionPane.showMessageDialog(null, "el valor a sumar es mayor a 10 ");
				}
				
			}
		});
		btnTres.setIcon(new ImageIcon("C:\\Programacion\\Workspaces\\JuegoSuma\\imagenes\\3.png"));
		btnTres.setBounds(189, 122, 73, 103);
		contentPane.add(btnTres);
		
		JButton btnCuatro = new JButton("New button");
		btnCuatro.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int uno = Integer.parseInt(textSumandouno.getText());
				int dos = Integer.parseInt(textSumandodos.getText());
				int resultado = 0; 
				resultado = uno + dos;
				if (dos <= 10) {
					if(resultado == 4) {
						JOptionPane.showMessageDialog(null, "correcto ");
						textProgreso.setText("100%");
					}else {
						JOptionPane.showMessageDialog(null, "incorrecto ");
						textProgreso.setText("0%");
					}
				}else {
					JOptionPane.showMessageDialog(null, "el valor a sumar es mayor a 10 ");
				}
				
			}
		});
		btnCuatro.setIcon(new ImageIcon("C:\\Programacion\\Workspaces\\JuegoSuma\\imagenes\\4.png"));
		btnCuatro.setBounds(285, 122, 89, 103);
		contentPane.add(btnCuatro);
		
		JButton btnCinco = new JButton("New button");
		btnCinco.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int uno = Integer.parseInt(textSumandouno.getText());
				int dos = Integer.parseInt(textSumandodos.getText());
				int resultado = 0; 
				resultado = uno + dos;
				if (dos <= 10) {
					if(resultado == 5) {
						JOptionPane.showMessageDialog(null, "correcto ");
						textProgreso.setText("100%");
					}else {
						JOptionPane.showMessageDialog(null, "incorrecto ");
						textProgreso.setText("0%");
					}
				}else {
					JOptionPane.showMessageDialog(null, "el valor a sumar es mayor a 10 ");
				}
				
			}
		});
		btnCinco.setIcon(new ImageIcon("C:\\Programacion\\Workspaces\\JuegoSuma\\imagenes\\5.png"));
		btnCinco.setBounds(395, 122, 89, 97);
		contentPane.add(btnCinco);
		
		JButton btnSeis = new JButton("New button");
		btnSeis.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int uno = Integer.parseInt(textSumandouno.getText());
				int dos = Integer.parseInt(textSumandodos.getText());
				int resultado = 0; 
				resultado = uno + dos;
				if (dos <= 10) {
					if(resultado == 6) {
						JOptionPane.showMessageDialog(null, "correcto ");
						textProgreso.setText("100%");
					}else {
						JOptionPane.showMessageDialog(null, "incorrecto ");
						textProgreso.setText("0%");
					}
				}else {
					JOptionPane.showMessageDialog(null, "el valor a sumar es mayor a 10 ");
				}
					
				
			}
		});
		btnSeis.setIcon(new ImageIcon("C:\\Programacion\\Workspaces\\JuegoSuma\\imagenes\\6.png"));
		btnSeis.setBounds(494, 122, 89, 103);
		contentPane.add(btnSeis);
		
		JButton btnSiete = new JButton("New button");
		btnSiete.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int uno = Integer.parseInt(textSumandouno.getText());
				int dos = Integer.parseInt(textSumandodos.getText());
				int resultado = 0; 
				resultado = uno + dos;
				if (dos <= 10) {
					if(resultado == 7) {
						JOptionPane.showMessageDialog(null, "correcto ");
						textProgreso.setText("100%");
					}else {
						JOptionPane.showMessageDialog(null, "incorrecto ");
						textProgreso.setText("0%");
					}
				}else {
					JOptionPane.showMessageDialog(null, "el valor a sumar es mayor a 10 ");
				}
				
			}
		});
		btnSiete.setIcon(new ImageIcon("C:\\Programacion\\Workspaces\\JuegoSuma\\imagenes\\7.png"));
		btnSiete.setBounds(593, 116, 74, 107);
		contentPane.add(btnSiete);
		
		JButton btnOcho = new JButton("New button");
		btnOcho.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int uno = Integer.parseInt(textSumandouno.getText());
				int dos = Integer.parseInt(textSumandodos.getText());
				int resultado = 0; 
				resultado = uno + dos;
				if (dos <= 10) {
					if(resultado == 8) {
						JOptionPane.showMessageDialog(null, "correcto ");
						textProgreso.setText("100%");
					}else {
						JOptionPane.showMessageDialog(null, "incorrecto ");
						textProgreso.setText("0%");
					}
				}else {
					JOptionPane.showMessageDialog(null, "el valor a sumar es mayor a 10 ");
				}
				
			}
		});
		btnOcho.setIcon(new ImageIcon("C:\\Programacion\\Workspaces\\JuegoSuma\\imagenes\\8.png"));
		btnOcho.setBounds(10, 242, 73, 111);
		contentPane.add(btnOcho);
		
		JButton btnNueve = new JButton("New button");
		btnNueve.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int uno = Integer.parseInt(textSumandouno.getText());
				int dos = Integer.parseInt(textSumandodos.getText());
				int resultado = 0; 
				resultado = uno + dos;
				if (dos <= 10) {
					if(resultado == 9) {
						JOptionPane.showMessageDialog(null, "correcto ");
						textProgreso.setText("100%");
					}else {
						JOptionPane.showMessageDialog(null, "incorrecto ");
						textProgreso.setText("0%");
					}
				}else {
					JOptionPane.showMessageDialog(null, "el valor a sumar es mayor a 10 ");
				}
				
			}
		});
		btnNueve.setIcon(new ImageIcon("C:\\Programacion\\Workspaces\\JuegoSuma\\imagenes\\9.png"));
		btnNueve.setBounds(95, 242, 79, 111);
		contentPane.add(btnNueve);
		
		JButton btnDiez = new JButton("New button");
		btnDiez.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int uno = Integer.parseInt(textSumandouno.getText());
				int dos = Integer.parseInt(textSumandodos.getText());
				int resultado = 0; 
				resultado = uno + dos;
				if (dos <= 10) {
					if(resultado == 10) {
						JOptionPane.showMessageDialog(null, "correcto ");
						textProgreso.setText("100%");
					}else {
						JOptionPane.showMessageDialog(null, "incorrecto ");
						textProgreso.setText("0%");
					}
				}else {
					JOptionPane.showMessageDialog(null, "el valor a sumar es mayor a 10 ");
				}
				
			}
		});
		btnDiez.setIcon(new ImageIcon("C:\\Programacion\\Workspaces\\JuegoSuma\\imagenes\\10.png"));
		btnDiez.setBounds(185, 241, 107, 112);
		contentPane.add(btnDiez);
		
		JButton btnVolver = new JButton("Volver al incio");
		btnVolver.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnVolver.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				abrirFRame();
				
			}
		});
		btnVolver.setBounds(20, 364, 125, 23);
		contentPane.add(btnVolver);
		
		JButton btnConcepto = new JButton("Concepto");
		btnConcepto.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				abrirConcepto();
			}
		});
		btnConcepto.setBounds(337, 364, 89, 23);
		contentPane.add(btnConcepto);
		
		JProgressBar Barraprogreso = new JProgressBar();
		Barraprogreso.setBounds(337, 78, 146, 14);
		contentPane.add(Barraprogreso);
		
		JLabel lblbarraprogreso = new JLabel("Barra de progreso");
		lblbarraprogreso.setFont(new Font("Cooper Black", Font.PLAIN, 15));
		lblbarraprogreso.setForeground(Color.MAGENTA);
		lblbarraprogreso.setBounds(337, 60, 147, 14);
		contentPane.add(lblbarraprogreso);
		
		JLabel lblFondo = new JLabel("New label");
		lblFondo.setIcon(new ImageIcon("C:\\Programacion\\Workspaces\\JuegoSuma\\imagenes\\azul.jpg"));
		lblFondo.setBounds(0, 21, 677, 380);
		contentPane.add(lblFondo);
	}
}
