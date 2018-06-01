package guis;

import java.awt.EventQueue;

import javax.swing.JDialog;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

public class GuiConsulta extends JDialog {
	
	private static final long serialVersionUID = 1L;
	private JComboBox comboBox;
	private JLabel lblCliente;
	private JScrollPane scrollPane;
	private JTextArea textArea;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					GuiConsulta dialog = new GuiConsulta();
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
	public GuiConsulta() {
		setBounds(100, 100, 450, 300);
		getContentPane().setLayout(null);
		
		comboBox = new JComboBox();
		comboBox.setBounds(66, 11, 80, 20);
		getContentPane().add(comboBox);
		
		lblCliente = new JLabel("Cliente");
		lblCliente.setBounds(10, 14, 46, 14);
		getContentPane().add(lblCliente);
		
		scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 49, 414, 201);
		getContentPane().add(scrollPane);
		
		textArea = new JTextArea();
		textArea.setEditable(false);
		scrollPane.setViewportView(textArea);

	}
}
