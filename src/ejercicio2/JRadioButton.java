package ejercicio2;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import ejercicio.serienumeros;

import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JTextField;
import java.awt.Color;
import javax.swing.SwingConstants;

public class JRadioButton extends JFrame {

	private JPanel contentPane;
	private JTextField txtNumero;
	
	/** * Launch the application.*/
	public static void main(String[] args) {
		JRadioButton frame = new JRadioButton();
		frame.setVisible(true);
	}
	
	public JRadioButton() 
	{
		setTitle("Jesus Esquivel (19100176)");
		
		
		List<Pregunta> ListaPreguntas = new ArrayList<Pregunta>();// se instancia la lista de preguntas
		List<String> ListaRespuestasSeleccionadas = new ArrayList<String>();// se instancia la lista de respuestas seleccionadas
		// se instancian objetos de la clase pregunta.
		Pregunta pregunta1 = new Pregunta(); 
		Pregunta pregunta2 = new Pregunta();
		Pregunta pregunta3 = new Pregunta();
		Pregunta pregunta4 = new Pregunta();
		Pregunta pregunta5 = new Pregunta();
		
		//datos de la pregunta 1
		String _strPregunta1 ="¿Cuál es el significado de las siglas JVM?";
		String _strPregunta1Respuesta1 ="Java Virtual Machine";
		String _strPregunta1Respuesta2 ="Java Variante Medica";
		String _strPregunta1Respuesta3 ="Juego Virtual Mecánico";
		String _strPregunta1RespuestaCorrecta ="Java Virtual Machine";
		
		// asignacion de datos de la pregunta 1
		pregunta1.setPregunta(_strPregunta1);
		pregunta1.setRespuesta1(_strPregunta1Respuesta1);
		pregunta1.setRespuesta2(_strPregunta1Respuesta2);
		pregunta1.setRespuesta3(_strPregunta1Respuesta3);
		pregunta1.setRespuestaCorrecta(_strPregunta1RespuestaCorrecta);
		
		//datos de la pregunta 2
		String _strPregunta2 ="¿Qué significa el término GUI?";
		String _strPregunta2Respuesta1 ="Gráficos universales Integrados";
		String _strPregunta2Respuesta2 ="Guia de Usuario Interno";
		String _strPregunta2Respuesta3 ="Graphical User Interface";
		String _strPregunta2RespuestaCorrecta ="Graphical User Interface";
		
		//asignacion de datos de la pregunta 2
		pregunta2.setPregunta(_strPregunta2);
		pregunta2.setRespuesta1(_strPregunta2Respuesta1);
		pregunta2.setRespuesta2(_strPregunta2Respuesta2);
		pregunta2.setRespuesta3(_strPregunta2Respuesta3);
		pregunta2.setRespuestaCorrecta(_strPregunta2RespuestaCorrecta);
		
		//datos de la pregunta 3
		String _strPregunta3 ="¿Cuál era el objetivo del desarrollo de la plataforma Java?";
		String _strPregunta3Respuesta1 ="Desarrollar código automático";
		String _strPregunta3Respuesta2 ="Poder ejecutar los programas sin tener en cuenta el hardware";
		String _strPregunta3Respuesta3 ="Crear páginas web";
		String _strPregunta3RespuestaCorrecta ="Poder ejecutar los programas sin tener en cuenta el hardware";
		
		//asignacion de datos de la pregunta 3
		pregunta3.setPregunta(_strPregunta3);
		pregunta3.setRespuesta1(_strPregunta3Respuesta1);
		pregunta3.setRespuesta2(_strPregunta3Respuesta2);
		pregunta3.setRespuesta3(_strPregunta3Respuesta3);
		pregunta3.setRespuestaCorrecta(_strPregunta3RespuestaCorrecta);
		
		//datos de la pregunta 4
		String _strPregunta4 ="¿Cuál es el eslogan que creó Sun Microsystems para promocionar los beneficios del lenguaje Java?";
		String _strPregunta4Respuesta1 ="Escribe una vez ejecuta en todas partes";
		String _strPregunta4Respuesta2 ="Pensar diferente";
		String _strPregunta4Respuesta3 ="Mas rápido que una bala";
		String _strPregunta4RespuestaCorrecta ="Escribe una vez ejecuta en todas partes";
		
		//asigacion de datos de la pregunta 4
		pregunta4.setPregunta(_strPregunta4);
		pregunta4.setRespuesta1(_strPregunta4Respuesta1);
		pregunta4.setRespuesta2(_strPregunta4Respuesta2);
		pregunta4.setRespuesta3(_strPregunta4Respuesta3);
		pregunta4.setRespuestaCorrecta(_strPregunta4RespuestaCorrecta);
		
		//datos de la pregunta 5
		String _strPregunta5 ="¿Qué son los eventos en java y cuando se generan?";
		String _strPregunta5Respuesta1 ="Son fiestas virtuales y se generan para celebrar algo";
		String _strPregunta5Respuesta2 ="Son objetos y se generan como resultado de la interacción del usuario con la interfase gráfica";
		String _strPregunta5Respuesta3 ="Ninguna de las anteriores";
		String _strPregunta5RespuestaCorrecta ="Son objetos y se generan como resultado de la interacción del usuario con la interfase gráfica";
		
		//asignacion de datos de la pregunta 5
		pregunta5.setPregunta(_strPregunta5);
		pregunta5.setRespuesta1(_strPregunta5Respuesta1);
		pregunta5.setRespuesta2(_strPregunta5Respuesta2);
		pregunta5.setRespuesta3(_strPregunta5Respuesta3);
		pregunta5.setRespuestaCorrecta(_strPregunta5RespuestaCorrecta);
		
		//se agregan las preguntas a la lista
		ListaPreguntas.add(pregunta1);
		ListaPreguntas.add(pregunta2);
		ListaPreguntas.add(pregunta3);
		ListaPreguntas.add(pregunta4);
		ListaPreguntas.add(pregunta5);
		
		//diseno
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 488, 210);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblPregunta = new JLabel("Pregunta");
		lblPregunta.setBounds(40, 11, 422, 14);
		contentPane.add(lblPregunta);
		
		txtNumero = new JTextField();
		txtNumero.setEditable(false);
		txtNumero.setHorizontalAlignment(SwingConstants.CENTER);
		txtNumero.setBackground(Color.YELLOW);
		txtNumero.setText("1");
		txtNumero.setBounds(10, 8, 20, 20);
		contentPane.add(txtNumero);
		txtNumero.setColumns(10);
		
		javax.swing.JRadioButton radRespuesta1 = new javax.swing.JRadioButton("Respuesta 1");
		radRespuesta1.setSelected(true);
		radRespuesta1.setBounds(50, 32, 412, 23);
		contentPane.add(radRespuesta1);
		
		javax.swing.JRadioButton radRespuesta2 = new javax.swing.JRadioButton("Respuesta 2");
		radRespuesta2.setBounds(50, 58, 412, 23);
		contentPane.add(radRespuesta2);
		
		javax.swing.JRadioButton radRespuesta3 = new javax.swing.JRadioButton("Respuesta 3");
		radRespuesta3.setBounds(50, 84, 412, 23);
		contentPane.add(radRespuesta3);
		
		//grupo radb
		ButtonGroup btgRespuestas = new ButtonGroup();
		btgRespuestas.add(radRespuesta1);
		btgRespuestas.add(radRespuesta2);
		btgRespuestas.add(radRespuesta3);
		
		// codigo que carga los datos de la primera pregunta
		Pregunta preguntaActual = new Pregunta();
		preguntaActual=ListaPreguntas.get(Integer.parseInt(txtNumero.getText())-1);
		lblPregunta.setText(preguntaActual.getPregunta());
		radRespuesta1.setText(preguntaActual.getRespuesta1());
		radRespuesta2.setText(preguntaActual.getRespuesta2());
		radRespuesta3.setText(preguntaActual.getRespuesta3());

		// codigo que agrega respuestas vacias a la lista de respuestas
		ListaRespuestasSeleccionadas.add("0");//0
		ListaRespuestasSeleccionadas.add("1");//1
		ListaRespuestasSeleccionadas.add("2");//2
		ListaRespuestasSeleccionadas.add("3");//3
		ListaRespuestasSeleccionadas.add("4");//4
		
		JButton btnAnterior = new JButton("Anterior");
		btnAnterior.addMouseListener(new MouseAdapter() 
		{
			@Override
			public void mouseClicked(MouseEvent e) 
			{
				// si el numero de pregunta es diferente a 1
				if(Integer.parseInt(txtNumero.getText())!=1)
				{
					//se guardan las respuestas de la pregunta pasada
					if(radRespuesta1.isSelected()==true)
					{
						//se edita la respuesta en la lista
						ListaRespuestasSeleccionadas.set((Integer.parseInt(txtNumero.getText())-1), radRespuesta1.getText());
					}
					if(radRespuesta2.isSelected()==true)
					{
						ListaRespuestasSeleccionadas.set((Integer.parseInt(txtNumero.getText())-1), radRespuesta2.getText());
					}
					if(radRespuesta3.isSelected()==true)
					{
						ListaRespuestasSeleccionadas.set((Integer.parseInt(txtNumero.getText())-1), radRespuesta3.getText());
					}
					
					int num = Integer.parseInt(txtNumero.getText())-1;
					txtNumero.setText(num+"");// actualiza el numero de la pregunta
					Pregunta preguntaActual = new Pregunta(); //instancia una nueva pregunta
					//carga los datos de la pregunta enla lista y los muestra en los controles
					preguntaActual=ListaPreguntas.get(Integer.parseInt(txtNumero.getText())-1);
					lblPregunta.setText(preguntaActual.getPregunta());
					radRespuesta1.setText(preguntaActual.getRespuesta1());
					radRespuesta2.setText(preguntaActual.getRespuesta2());
					radRespuesta3.setText(preguntaActual.getRespuesta3());
					;
					//carga las respuestas de la lista de respuestas de la pregunta actual
					if(radRespuesta1.getText()==ListaRespuestasSeleccionadas.get((Integer.parseInt(txtNumero.getText())-1)))
					{
						radRespuesta1.setSelected(true);
					}
					if(radRespuesta2.getText()==ListaRespuestasSeleccionadas.get((Integer.parseInt(txtNumero.getText())-1)))
					{
						radRespuesta2.setSelected(true);
					}
					if(radRespuesta3.getText()==ListaRespuestasSeleccionadas.get((Integer.parseInt(txtNumero.getText())-1)))
					{
						radRespuesta3.setSelected(true);
					}
				}
				
			}
		});
		btnAnterior.setBounds(10, 140, 89, 23);
		contentPane.add(btnAnterior);
		
		JButton btnSiguiente = new JButton("Siguiente");
		btnSiguiente.addMouseListener(new MouseAdapter() 
		{
			@Override
			public void mouseClicked(MouseEvent e) 
			{
				// si el numero de pregunta es diferente a 5
				if(Integer.parseInt(txtNumero.getText())!=5)
				{
					//se guardan las respuestas de la pregunta pasada
					if(radRespuesta1.isSelected()==true)
					{
						//se edita la respuesta en la lista
						ListaRespuestasSeleccionadas.set((Integer.parseInt(txtNumero.getText())-1), radRespuesta1.getText());
					}
					if(radRespuesta2.isSelected()==true)
					{
						ListaRespuestasSeleccionadas.set((Integer.parseInt(txtNumero.getText())-1), radRespuesta2.getText());
					}
					if(radRespuesta3.isSelected()==true)
					{
						ListaRespuestasSeleccionadas.set((Integer.parseInt(txtNumero.getText())-1), radRespuesta3.getText());
					}
					
					int num = Integer.parseInt(txtNumero.getText())+1;
					txtNumero.setText(num+"");// actualiza el numero de la pregunta
					Pregunta preguntaActual = new Pregunta(); //instancia una nueva pregunta
					//carga los datos de la pregunta enla lista y los muestra en los controles
					preguntaActual=ListaPreguntas.get(Integer.parseInt(txtNumero.getText())-1);
					lblPregunta.setText(preguntaActual.getPregunta());
					radRespuesta1.setText(preguntaActual.getRespuesta1());
					radRespuesta2.setText(preguntaActual.getRespuesta2());
					radRespuesta3.setText(preguntaActual.getRespuesta3());
					//carga las respuestas de la lista de respuestas de la pregunta actual
					
					if(radRespuesta1.getText()==ListaRespuestasSeleccionadas.get((Integer.parseInt(txtNumero.getText())-1)))
					{
						radRespuesta1.setSelected(true);
					}
					if(radRespuesta2.getText()==ListaRespuestasSeleccionadas.get((Integer.parseInt(txtNumero.getText())-1)))
					{
						radRespuesta2.setSelected(true);
					}
					if(radRespuesta3.getText()==ListaRespuestasSeleccionadas.get((Integer.parseInt(txtNumero.getText())-1)))
					{
						radRespuesta3.setSelected(true);
					}
				}
			}
		});
		btnSiguiente.setBounds(109, 140, 89, 23);
		contentPane.add(btnSiguiente);
		
		JButton btnEvaluar = new JButton("Evaluar");
		btnEvaluar.addMouseListener(new MouseAdapter() 
		{
			@Override
			public void mouseClicked(MouseEvent e) 
			{
				//si al evaluar, el usuario se ubica en la ultima pregunta
				if(Integer.parseInt(txtNumero.getText())==5)
				{
					//guarda las respuestas seleccionadas
					if(radRespuesta1.isSelected()==true)
					{
						ListaRespuestasSeleccionadas.set((Integer.parseInt(txtNumero.getText())-1), radRespuesta1.getText());
					}
					if(radRespuesta2.isSelected()==true)
					{
						ListaRespuestasSeleccionadas.set((Integer.parseInt(txtNumero.getText())-1), radRespuesta2.getText());
					}
					if(radRespuesta3.isSelected()==true)
					{
						ListaRespuestasSeleccionadas.set((Integer.parseInt(txtNumero.getText())-1), radRespuesta3.getText());
					}
				}
				
				int resultado = 0;
				Pregunta unaPregunta= new Pregunta();
				//ciclo para comparar si las respuestas son correctas
				for (int i = 0; i <= ListaPreguntas.size() - 1; i++) 
				{
			        unaPregunta = ListaPreguntas.get(i);
			        if(unaPregunta.getRespuestaCorrecta()==ListaRespuestasSeleccionadas.get(i))
			        {
			        	resultado=resultado+1;
			        }
			    }
				//muestra el resultado en una ventana aparte
				JOptionPane.showMessageDialog(null, "Aciertos: " + resultado+"/5");
			}
		});
		btnEvaluar.setBounds(208, 140, 89, 23);
		contentPane.add(btnEvaluar);
		
		JButton btnSalir = new JButton("Salir");
		btnSalir.addMouseListener(new MouseAdapter() 
		{
			@Override
			public void mouseClicked(MouseEvent e) 
			{
				System.exit(0);
			}
		});
		btnSalir.setBounds(307, 140, 89, 23);
		contentPane.add(btnSalir);
		
		
		
		
		
		
	}
}

