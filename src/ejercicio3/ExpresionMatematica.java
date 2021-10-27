package ejercicio3;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.SwingConstants;
import java.awt.Font;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.Stack;

public class ExpresionMatematica extends JFrame
{
	//----------------------------------------------------------------------------------------------
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField txtExpresionMatematica;
	
	public static void main(String[] args)
	{
		ExpresionMatematica frame = new ExpresionMatematica();
		frame.setVisible(true);
	}
	//----------------------------------------------------------------------------------------------
	public ExpresionMatematica() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 378, 199);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		txtExpresionMatematica = new JTextField();
		txtExpresionMatematica.setFont(new Font("Tahoma", Font.PLAIN, 20));
		txtExpresionMatematica.setBounds(20, 52, 321, 40);
		contentPane.add(txtExpresionMatematica);
		txtExpresionMatematica.setColumns(10);
		
		JButton btnLimpiar = new JButton("Limpiar");
		btnLimpiar.setBounds(137, 114, 89, 23);
		contentPane.add(btnLimpiar);
		
		JButton btnVerificar = new JButton("Verificar");
		btnVerificar.setBounds(20, 114, 89, 23);
		contentPane.add(btnVerificar);
		
		JButton btnSalir = new JButton("Salir");
		btnSalir.setBounds(252, 114, 89, 23);
		contentPane.add(btnSalir);
		
		JLabel lblExpresionMatematica = new JLabel("Expresion matematica:");
		lblExpresionMatematica.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblExpresionMatematica.setHorizontalAlignment(SwingConstants.LEFT);
		lblExpresionMatematica.setBounds(20, 11, 321, 30);
		contentPane.add(lblExpresionMatematica);
		
		//--------------------------------------------------------------------------

		
		
		
		
		//boton verificar
		btnVerificar.addMouseListener(new MouseAdapter() 
		{
			public void mouseClicked(MouseEvent e) 
			{
				Stack<String> unaPila = new Stack<String>();
				String strExpresion = txtExpresionMatematica.getText();
				String strRespuesta="";
				String strError="verificado hasta: ";
				char chrCaracter =' ';
				
				for(int i=0; i<strExpresion.length(); i++)
				{
					chrCaracter=strExpresion.charAt(i);
					strError=strError+strExpresion.charAt(i);
					if (chrCaracter=='(')
					{
						unaPila.push("abre");
					}
					if (chrCaracter==')')
					{
						if(unaPila.empty())
						{
							strRespuesta="EXPRESION INCORRECTA! \n\nFalto un parentesis de apertura \n"+strError;
							break;
						}
						else
						{
							unaPila.pop();
						}
					}
				}
				if(strRespuesta=="")
				{
					if(unaPila.isEmpty())
					{
						strRespuesta="EXPRESION CORRECTA!\n";
					}
					else
					{
						if(unaPila.size()>1)
						{
							strRespuesta="EXPRESION INCORRECTA! \n\nFaltaron varios parentesis de cierre \n"+strError;
						}
						else
						{
							strRespuesta="EXPRESION INCORRECTA! \n\nFalto un parentesis de cierre \n"+strError;
						}
				}
				
				
					
					
				}
				JOptionPane.showMessageDialog(null, strRespuesta);
			}
		});
		
		//boton limpiar
		btnLimpiar.addMouseListener(new MouseAdapter() 
		{
			@Override
			public void mouseClicked(MouseEvent e) 
			{
				txtExpresionMatematica.setText("");
			}
		});
		
		//boton Salir
		btnSalir.addMouseListener(new MouseAdapter() 
		{
			@Override
			public void mouseClicked(MouseEvent e) 
			{
				System.exit(0);
			}
		});
		
		
		
		
		
	}
}
