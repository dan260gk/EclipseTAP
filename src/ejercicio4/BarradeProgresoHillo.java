package ejercicio4;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JProgressBar;
import java.awt.Color;
import javax.swing.JButton;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class BarradeProgresoHillo extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	public static void main(String[] args) 
	{
		BarradeProgresoHillo frame = new BarradeProgresoHillo();
		frame.setVisible(true);
	}

	public BarradeProgresoHillo() {
		setBackground(new Color(128, 128, 128));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 300, 150);
		contentPane = new JPanel();
		contentPane.setBackground(Color.WHITE);
		contentPane.setForeground(new Color(0, 0, 0));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JProgressBar progressBar = new JProgressBar();
		progressBar.setBackground(new Color(192, 192, 192));
		progressBar.setForeground(Color.RED);
		progressBar.setBounds(10, 29, 264, 20);
		contentPane.add(progressBar);
		
		
		JButton btnIniciar = new JButton("Iniciar");
		btnIniciar.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) 
			{
				
				Hilo objHilo1 = new Hilo("unHilo");
				Thread varHilo1 = new Thread(objHilo1);

				ProgresoHilo objHilo2 = new ProgresoHilo(progressBar);
				Thread varHilo2 = new Thread(objHilo2);
				varHilo1.start();
				varHilo2.start();
				
			}
		});
		btnIniciar.setBounds(30, 77, 89, 23);
		contentPane.add(btnIniciar);
		
		JButton btnSalir = new JButton("Salir");
		btnSalir.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) 
			{
				System.exit(0);
			}
		});
		btnSalir.setBounds(160, 77, 89, 23);
		contentPane.add(btnSalir);
	}
}
