package guis;

import java.awt.EventQueue;

import javax.swing.JFrame;

import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Proyecto_AED_2018_I extends JFrame implements ActionListener {

	private static final long serialVersionUID = 1L;
	
	
	private JMenuBar menuBar;
	private JMenu mnArchivo;
	private JMenuItem mntmSalir;
	private JMenu mnMantenimiento;
	private JMenuItem mntmVehculo;
	private JMenuItem mntmConductor;
	private JMenuItem mntmCliente;
	private JMenuItem mntmOferta;
	private JMenu mnRegistro;
	private JMenuItem mntmConsulta;
	private JMenuItem mntmReserva;
	private JMenuItem mntmAlquiler;
	private JMenu mnPago;
	private JMenuItem mntmPagar;
	private JMenu mnReporte;
	private JMenuItem mntmReportar;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Proyecto_AED_2018_I frame = new Proyecto_AED_2018_I();
					frame.setVisible(true);
				}
				catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Proyecto_AED_2018_I() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 580, 429);
		
		menuBar = new JMenuBar();
		setJMenuBar(menuBar);
		
		mnArchivo = new JMenu("Archivo");
		menuBar.add(mnArchivo);
		
		mntmSalir = new JMenuItem("Salir");
		mntmSalir.addActionListener(this);
		mnArchivo.add(mntmSalir);
		
		mnMantenimiento = new JMenu("Mantenimiento");
		menuBar.add(mnMantenimiento);
		
		mntmVehculo = new JMenuItem("Veh\u00EDculo");
		mntmVehculo.addActionListener(this);
		mnMantenimiento.add(mntmVehculo);
		
		mntmConductor = new JMenuItem("Conductor");
		mntmConductor.addActionListener(this);
		mnMantenimiento.add(mntmConductor);
		
		mntmCliente = new JMenuItem("Cliente");
		mntmCliente.addActionListener(this);
		mnMantenimiento.add(mntmCliente);
		
		mntmOferta = new JMenuItem("Oferta");
		mntmOferta.addActionListener(this);
		mnMantenimiento.add(mntmOferta);
		
		mnRegistro = new JMenu("Registro");
		menuBar.add(mnRegistro);
		
		mntmConsulta = new JMenuItem("Consulta");
		mntmConsulta.addActionListener(this);
		mnRegistro.add(mntmConsulta);
		
		mntmReserva = new JMenuItem("Reserva");
		mntmReserva.addActionListener(this);
		mnRegistro.add(mntmReserva);
		
		mntmAlquiler = new JMenuItem("Alquiler");
		mntmAlquiler.addActionListener(this);
		mnRegistro.add(mntmAlquiler);
		
		mnPago = new JMenu("Pago");
		menuBar.add(mnPago);
		
		mntmPagar = new JMenuItem("Pagar");
		mntmPagar.addActionListener(this);
		mnPago.add(mntmPagar);
		
		mnReporte = new JMenu("Reporte");
		menuBar.add(mnReporte);
		
		mntmReportar = new JMenuItem("Reportar");
		mntmReportar.addActionListener(this);
		mnReporte.add(mntmReportar);
		
	}

	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == mntmSalir) {
			actionPerformedMntmSalir(e);
		}
		if (e.getSource() == mntmPagar) {
			actionPerformedMntmPagar(e);
		}
		if (e.getSource() == mntmAlquiler) {
			actionPerformedMntmAlquiler(e);
		}
		if (e.getSource() == mntmReserva) {
			actionPerformedMntmReserva(e);
		}
		if (e.getSource() == mntmConsulta) {
			actionPerformedMntmConsulta(e);
		}
		if (e.getSource() == mntmOferta) {
			actionPerformedMntmOferta(e);
		}
		if (e.getSource() == mntmCliente) {
			actionPerformedMntmCliente(e);
		}
		if (e.getSource() == mntmConductor) {
			actionPerformedMntmConductor(e);
		}
		if (e.getSource() == mntmVehculo) {
			actionPerformedMntmVehculo(e);
		}
		if (e.getSource() == mntmReportar){
			actionPerformedMntmReportar(e);
		}
	}
	protected void actionPerformedMntmVehculo(ActionEvent e) {
		
		GuiVehiculo gv = new GuiVehiculo();
		gv.setVisible(true);
		gv.setLocationRelativeTo(this);
		
	}
	protected void actionPerformedMntmConductor(ActionEvent e) {
		GuiConductor gc = new GuiConductor();
		gc.setVisible(true);
		gc.setLocationRelativeTo(this);
	}
	protected void actionPerformedMntmCliente(ActionEvent e) {
		GuiCliente gcl = new GuiCliente();
		gcl.setVisible(true);
		gcl.setLocationRelativeTo(this);
	}
	protected void actionPerformedMntmOferta(ActionEvent e) {
		GuiOferta go = new GuiOferta();
		go.setVisible(true);
		go.setLocationRelativeTo(this);
	}
	protected void actionPerformedMntmConsulta(ActionEvent e) {
		GuiConsulta gco = new GuiConsulta();
		gco.setVisible(true);
		gco.setLocationRelativeTo(this);
	}
	protected void actionPerformedMntmReserva(ActionEvent e) {
		GuiReserva gr = new GuiReserva();
		gr.setVisible(true);
		gr.setLocationRelativeTo(this);
	}
	protected void actionPerformedMntmAlquiler(ActionEvent e) {
		GuiAlquiler ga = new GuiAlquiler();
		ga.setVisible(true);
		ga.setLocationRelativeTo(this);
	}
	
	protected void actionPerformedMntmPagar(ActionEvent e) {
		GuiPago gp = new GuiPago();
		gp.setVisible(true);
		gp.setLocationRelativeTo(this);
	}
	protected void actionPerformedMntmReportar(ActionEvent e){
		GuiReporte gr = new GuiReporte();
		gr.setVisible(true);
		gr.setLocationRelativeTo(this);
	}
	protected void actionPerformedMntmSalir(ActionEvent e) {
	System.exit(0);
	}
}
