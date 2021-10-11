package ejercicio2;

public class Pregunta 
{
	private String _strPregunta;
	private String _strRespuesta1;
	private String _strRespuesta2;
	private String _strRespuesta3;
	private String _strRespuestaCorrecta;
	
	public String getPregunta () { return _strPregunta; } 
	public void setPregunta (String p) 
	{
        _strPregunta = p;
    } 
	
	public String getRespuesta1 () { return _strRespuesta1; } 
	public void setRespuesta1 (String r) 
	{
        _strRespuesta1 = r;
    } 
	
	public String getRespuesta2 () { return _strRespuesta2; } 
	public void setRespuesta2 (String r) 
	{
        _strRespuesta2 = r;
    } 
	
	public String getRespuesta3 () { return _strRespuesta3; } 
	public void setRespuesta3 (String r) 
	{
        _strRespuesta3 = r;
    } 
	
	public String getRespuestaCorrecta () { return _strRespuestaCorrecta; } 
	public void setRespuestaCorrecta (String rc) 
	{
        _strRespuestaCorrecta = rc;
    }
}
