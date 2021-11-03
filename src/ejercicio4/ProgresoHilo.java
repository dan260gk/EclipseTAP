package ejercicio4;

import javax.swing.JProgressBar;
public class ProgresoHilo implements Runnable
{
	private JProgressBar barra;
	public ProgresoHilo (JProgressBar barraVentana)
	{
		this.barra = barraVentana;
	}
	@Override
	public void run()
	{
		while (!Hilo.blnTerminado)
		{
			barra.setValue(Hilo.intProgreso);
			barra.repaint();
			if(Hilo.blnTerminado)
			{
				barra.setValue(100);
				break;
			}
		}
	}
}