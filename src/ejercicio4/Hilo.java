package ejercicio4;

public class Hilo implements Runnable
{
	public static boolean blnTerminado = false;
	public static int intProgreso = 0;
	public String strNombreHilo="";
	public Hilo (String nombre)
	{
		this.strNombreHilo=nombre;
	}
	@Override
	public void run()
	{
		blnTerminado = false;
		for (int i=1; i<=100; i++)
		{
			intProgreso=i;
			try 
			{
				Thread.sleep(600);
			} catch (InterruptedException e) 
			{
				
			}	
		}
		blnTerminado=true;
	}
}
