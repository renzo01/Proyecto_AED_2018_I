package guis;

import java.awt.EventQueue;

import javax.swing.JDialog;

public class GuiReserva extends JDialog {
	
	private static final long serialVersionUID = 1L;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					GuiReserva dialog = new GuiReserva();
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
	public GuiReserva() {
		setBounds(100, 100, 450, 300);

	}

}
