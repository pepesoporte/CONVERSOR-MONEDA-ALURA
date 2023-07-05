import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.SwingConstants;
import javax.swing.JTextField;


public class menu extends JFrame {
	

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField monto;
	
	

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
		menu frame = new menu();	
			public void run() {
				try {
					//menu frame = new menu();
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
	public menu() {		
		
					
		setTitle("TIPO DE CAMBIO");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 379);
		
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("TIPO DE CAMBIO");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblNewLabel.setBounds(151, 24, 142, 30);
		contentPane.add(lblNewLabel);
		
		JButton btndolar = new JButton("DOLAR");
		btndolar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				int montos = Integer.parseInt(monto.getText()); 
				double totdolar = (montos / 3.62);				
				JOptionPane.showMessageDialog(null,"AL CAMBIO 3.62 ==> SERIA  : "+ totdolar+ "  $$ ");
				
			}
		});
		btndolar.setBounds(52, 132, 81, 43);
		contentPane.add(btndolar);
		
		JButton btneuros = new JButton("EUROS");
		btneuros.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				int montos = Integer.parseInt(monto.getText()); 
				double totdolar = (montos / 3.95);				
				JOptionPane.showMessageDialog(null,"AL CAMBIO 3.95 ==> SERIA  : "+ totdolar+ "  EUROS");
			}
		});
		btneuros.setBounds(182, 132, 75, 43);
		contentPane.add(btneuros);
		
		JButton btnsoles = new JButton("YUANES");
		btnsoles.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				int montos = Integer.parseInt(monto.getText()); 
				double totdolar = (montos / 0.50);				
				JOptionPane.showMessageDialog(null,"AL CAMBIO 0.50 ==> SERIA  : "+ totdolar+ "   YUANES ");
			}
		});
		btnsoles.setBounds(308, 132, 89, 43);
		contentPane.add(btnsoles);
		
		JButton btnsalir = new JButton("SALIR");
		btnsalir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(WIDTH);
			}
		});
		btnsalir.setBounds(177, 245, 116, 45);
		contentPane.add(btnsalir);
		
		JLabel lblNewLabel_1 = new JLabel("Ingrese monto en SOLES : ");
		lblNewLabel_1.setBounds(40, 65, 154, 30);
		contentPane.add(lblNewLabel_1);
		
		monto = new JTextField();
		monto.setBounds(192, 69, 100, 22);
		contentPane.add(monto);
		monto.setColumns(10);
		
		
		
			}
}
