package guis;

import java.awt.EventQueue;

import javax.swing.JDialog;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

public class GuiAlquiler extends JDialog {
	
	private static final long serialVersionUID = 1L;
	private JTextField textField;
	private JLabel lblIdAlquiler;
	private JLabel lblCodCli;
	private JTextField textField_1;
	private JLabel lblPlaca;
	private JLabel lblFechaAlquiler;
	private JLabel lblDias;
	private JLabel lblPrexDia;
	private JLabel lblEstado;
	private JLabel lblReservado;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;
	private JTextField textField_6;
	private JTextField textField_7;
	private JScrollPane scrollPane;
	private JTextArea textArea;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					GuiAlquiler dialog = new GuiAlquiler();
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
	public GuiAlquiler() {
		setBounds(100, 100, 450, 490);
		getContentPane().setLayout(null);
		
		textField = new JTextField();
		textField.setBounds(95, 11, 86, 20);
		getContentPane().add(textField);
		textField.setColumns(10);
		
		lblIdAlquiler = new JLabel("ID");
		lblIdAlquiler.setBounds(10, 14, 32, 14);
		getContentPane().add(lblIdAlquiler);
		
		lblCodCli = new JLabel("Codigo Cliente");
		lblCodCli.setBounds(10, 41, 75, 14);
		getContentPane().add(lblCodCli);
		
		textField_1 = new JTextField();
		textField_1.setBounds(95, 38, 86, 20);
		getContentPane().add(textField_1);
		textField_1.setColumns(10);
		
		lblPlaca = new JLabel("Placa");
		lblPlaca.setBounds(10, 66, 46, 14);
		getContentPane().add(lblPlaca);
		
		lblFechaAlquiler = new JLabel("Fecha Alquiler");
		lblFechaAlquiler.setBounds(10, 91, 75, 14);
		getContentPane().add(lblFechaAlquiler);
		
		lblDias = new JLabel("Dias");
		lblDias.setBounds(10, 116, 46, 14);
		getContentPane().add(lblDias);
		
		lblPrexDia = new JLabel("Precio x Dia");
		lblPrexDia.setBounds(10, 141, 75, 14);
		getContentPane().add(lblPrexDia);
		
		lblEstado = new JLabel("Estado");
		lblEstado.setBounds(10, 166, 46, 14);
		getContentPane().add(lblEstado);
		
		lblReservado = new JLabel("Reservado");
		lblReservado.setBounds(10, 191, 62, 14);
		getContentPane().add(lblReservado);
		
		textField_2 = new JTextField();
		textField_2.setBounds(95, 63, 86, 20);
		getContentPane().add(textField_2);
		textField_2.setColumns(10);
		
		textField_3 = new JTextField();
		textField_3.setBounds(95, 88, 86, 20);
		getContentPane().add(textField_3);
		textField_3.setColumns(10);
		
		textField_4 = new JTextField();
		textField_4.setBounds(95, 113, 86, 20);
		getContentPane().add(textField_4);
		textField_4.setColumns(10);
		
		textField_5 = new JTextField();
		textField_5.setBounds(95, 138, 86, 20);
		getContentPane().add(textField_5);
		textField_5.setColumns(10);
		
		textField_6 = new JTextField();
		textField_6.setBounds(95, 163, 86, 20);
		getContentPane().add(textField_6);
		textField_6.setColumns(10);
		
		textField_7 = new JTextField();
		textField_7.setBounds(95, 188, 86, 20);
		getContentPane().add(textField_7);
		textField_7.setColumns(10);
		
		scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 218, 414, 222);
		getContentPane().add(scrollPane);
		
		textArea = new JTextArea();
		scrollPane.setViewportView(textArea);

	}
}
