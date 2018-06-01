package guis;

import java.awt.EventQueue;

import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

public class GuiConductor extends JDialog {
	
	private static final long serialVersionUID = 1L;
	private JLabel lblIdConductor;
	private JLabel lblNroBrevete;
	private JLabel lblNombreConductor;
	private JLabel lblApellidoConductor;
	private JLabel lblCategoriaConductor;
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
					GuiConductor dialog = new GuiConductor();
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
	public GuiConductor() {
		setBounds(100, 100, 450, 382);
		getContentPane().setLayout(null);
		
		lblIdConductor = new JLabel("ID");
		lblIdConductor.setBounds(10, 11, 46, 14);
		getContentPane().add(lblIdConductor);
		
		lblNroBrevete = new JLabel("Nro. Brevete");
		lblNroBrevete.setBounds(10, 36, 68, 14);
		getContentPane().add(lblNroBrevete);
		
		lblNombreConductor = new JLabel("Nombre");
		lblNombreConductor.setBounds(10, 61, 46, 14);
		getContentPane().add(lblNombreConductor);
		
		lblApellidoConductor = new JLabel("Apellido");
		lblApellidoConductor.setBounds(10, 86, 46, 14);
		getContentPane().add(lblApellidoConductor);
		
		lblCategoriaConductor = new JLabel("Categoria");
		lblCategoriaConductor.setBounds(10, 111, 68, 14);
		getContentPane().add(lblCategoriaConductor);
		
		textField = new JTextField();
		textField.setBounds(85, 8, 86, 20);
		getContentPane().add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setBounds(85, 33, 86, 20);
		getContentPane().add(textField_1);
		textField_1.setColumns(10);
		
		textField_2 = new JTextField();
		textField_2.setBounds(85, 58, 86, 20);
		getContentPane().add(textField_2);
		textField_2.setColumns(10);
		
		textField_3 = new JTextField();
		textField_3.setBounds(85, 83, 86, 20);
		getContentPane().add(textField_3);
		textField_3.setColumns(10);
		
		textField_4 = new JTextField();
		textField_4.setBounds(85, 108, 86, 20);
		getContentPane().add(textField_4);
		textField_4.setColumns(10);
		
		scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 140, 414, 192);
		getContentPane().add(scrollPane);
		
		textArea = new JTextArea();
		scrollPane.setViewportView(textArea);

	}
}
