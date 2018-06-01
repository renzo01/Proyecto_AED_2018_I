package guis;

import java.awt.EventQueue;

import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

public class GuiCliente extends JDialog {
	
	private static final long serialVersionUID = 1L;
	private JLabel lblCodigoCliente;
	private JLabel lblNombres;
	private JLabel lblApellidos;
	private JLabel lblTelefono;
	private JLabel lblDni;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JScrollPane scrollPane;
	private JTextArea textArea;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					GuiCliente dialog = new GuiCliente();
					dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
					dialog.setVisible(true);
				}
				catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the dialog.
	 */
	public GuiCliente() {
		setBounds(100, 100, 450, 352);
		getContentPane().setLayout(null);
		
		lblCodigoCliente = new JLabel("Codigo Cliente");
		lblCodigoCliente.setBounds(10, 11, 69, 14);
		getContentPane().add(lblCodigoCliente);
		
		lblNombres = new JLabel("Nombres");
		lblNombres.setBounds(10, 36, 46, 14);
		getContentPane().add(lblNombres);
		
		lblApellidos = new JLabel("Apellidos");
		lblApellidos.setBounds(10, 61, 46, 14);
		getContentPane().add(lblApellidos);
		
		lblTelefono = new JLabel("Telefono");
		lblTelefono.setBounds(10, 86, 46, 14);
		getContentPane().add(lblTelefono);
		
		lblDni = new JLabel("DNI");
		lblDni.setBounds(10, 111, 46, 14);
		getContentPane().add(lblDni);
		
		textField = new JTextField();
		textField.setBounds(89, 8, 86, 20);
		getContentPane().add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setBounds(89, 33, 86, 20);
		getContentPane().add(textField_1);
		textField_1.setColumns(10);
		
		textField_2 = new JTextField();
		textField_2.setBounds(89, 58, 86, 20);
		getContentPane().add(textField_2);
		textField_2.setColumns(10);
		
		textField_3 = new JTextField();
		textField_3.setBounds(89, 83, 86, 20);
		getContentPane().add(textField_3);
		textField_3.setColumns(10);
		
		textField_4 = new JTextField();
		textField_4.setBounds(89, 108, 86, 20);
		getContentPane().add(textField_4);
		textField_4.setColumns(10);
		
		scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 139, 414, 163);
		getContentPane().add(scrollPane);
		
		textArea = new JTextArea();
		scrollPane.setViewportView(textArea);

	}

}
