package holamundo;

import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.FlowLayout;
import java.awt.Component;
import javax.swing.Box;
import javax.swing.JTextField;
import javax.swing.JSplitPane;
import java.awt.BorderLayout;
import javax.swing.JTextArea;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JComboBox;
import javax.swing.JButton;

public class Prueba {

	private JFrame frame;
	private JTextField txtCodigoDepartamento;
	private JTextField txtNombreDepartamento;
	private JTextField txtY;
	private JButton btnNewButton;
	private JButton btnNewButton_1;
	private JButton btnNewButton_2;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Prueba window = new Prueba();
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
	public Prueba() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Datos de departamento");
		lblNewLabel.setBounds(0, 0, 434, 14);
		frame.getContentPane().add(lblNewLabel, BorderLayout.NORTH);
		
		JPanel panel = new JPanel();
		panel.setBounds(10, 25, 399, 144);
		frame.getContentPane().add(panel);
		panel.setLayout(null);
		
		btnNewButton = new JButton("");
		btnNewButton.setBounds(275, 11, 89, 23);
		panel.add(btnNewButton);
		
		txtCodigoDepartamento = new JTextField();
		txtCodigoDepartamento.setBounds(10, 11, 177, 20);
		panel.add(txtCodigoDepartamento);
		txtCodigoDepartamento.setText("Codigo departamento");
		txtCodigoDepartamento.setColumns(10);
		
		txtNombreDepartamento = new JTextField();
		txtNombreDepartamento.setBounds(10, 42, 177, 20);
		panel.add(txtNombreDepartamento);
		txtNombreDepartamento.setText("Nombre departamento");
		txtNombreDepartamento.setColumns(10);
		
		txtY = new JTextField();
		txtY.setBounds(10, 73, 177, 20);
		panel.add(txtY);
		txtY.setText("Localidad departamento");
		txtY.setColumns(10);
		
		btnNewButton_1 = new JButton("");
		btnNewButton_1.setBounds(275, 39, 89, 23);
		panel.add(btnNewButton_1);
		
		btnNewButton_2 = new JButton("");
		btnNewButton_2.setBounds(275, 73, 89, 23);
		panel.add(btnNewButton_2);
	}
}
