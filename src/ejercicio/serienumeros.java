package ejercicio;


import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.SwingConstants;
import javax.swing.JTextArea;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class serienumeros extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField txtNumero2;
	private JTextField txtNumero1;
	private JTextField txtIteraccion;
	private JTextArea txaSerie;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		serienumeros frame = new serienumeros();
		frame.setVisible(true);
	}

	public serienumeros() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 300, 227);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		txtNumero2 = new JTextField();
		txtNumero2.setBounds(76, 49, 86, 20);
		contentPane.add(txtNumero2);
		txtNumero2.setColumns(10);
		
		txtNumero1 = new JTextField();
		txtNumero1.setBounds(76, 18, 86, 20);
		contentPane.add(txtNumero1);
		txtNumero1.setColumns(10);
		
		JLabel lblNumero1 = new JLabel("Numero 1");
		lblNumero1.setHorizontalAlignment(SwingConstants.LEFT);
		lblNumero1.setBounds(10, 21, 56, 14);
		contentPane.add(lblNumero1);
		
		JLabel lblNumero2 = new JLabel("Numero 2");
		lblNumero2.setHorizontalAlignment(SwingConstants.LEFT);
		lblNumero2.setBounds(10, 52, 56, 14);
		contentPane.add(lblNumero2);
		
		JButton btnGenerar = new JButton("Generar");
		btnGenerar.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) 
			{
				
				int _intNumero1= Integer.parseInt(txtNumero1.getText());
				int _intNumero2= Integer.parseInt(txtNumero2.getText());
				int _intIteraccion= Integer.parseInt(txtIteraccion.getText());
				int _intC =0;
				int _intSuma=0;
				String _strSerie=_intNumero1+"-"+_intNumero2;
				while(_intC<_intIteraccion)
				{
					_intC++;
					_intSuma=_intNumero1+_intNumero2;
					_strSerie=_strSerie+"-"+_intSuma;
					_intNumero1=_intNumero2;
					_intNumero2=_intSuma;
							
				}
				txaSerie.setText(_strSerie);
			}
		});
		btnGenerar.setBounds(185, 17, 89, 23);
		contentPane.add(btnGenerar);
		
		JLabel lblIteraciones = new JLabel("Iteracciones");
		lblIteraciones.setHorizontalAlignment(SwingConstants.LEFT);
		lblIteraciones.setBounds(10, 83, 76, 14);
		contentPane.add(lblIteraciones);
		
		txtIteraccion = new JTextField();
		txtIteraccion.setBounds(96, 80, 69, 20);
		contentPane.add(txtIteraccion);
		txtIteraccion.setColumns(10);
		
		JButton btnSalir = new JButton("Salir");
		btnSalir.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) 
			{
				System.exit(0);
			}
		});
		btnSalir.setBounds(185, 79, 89, 23);
		contentPane.add(btnSalir);
		
		txaSerie = new JTextArea();
		txaSerie.setBounds(10, 110, 264, 71);
		contentPane.add(txaSerie);
		
		JButton btnLimpiar = new JButton("Limpiar");
		btnLimpiar.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) 
			{
				txtNumero1.setText("");
				txtNumero2.setText("");
				txtIteraccion.setText("");
				txaSerie.setText("");
			}
		});
		btnLimpiar.setBounds(185, 48, 89, 23);
		contentPane.add(btnLimpiar);
	}
}
