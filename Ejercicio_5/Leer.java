package Ejercicio_5;
import java.io.*;
public class Leer
{
    public static String dato ()
    {
	String sdato = "";
	try
	{
	    // Definir un flujo de caracteres de entrada: teclado
	    InputStreamReader isr = new InputStreamReader (System.in);
	    BufferedReader teclado = new BufferedReader (isr);
	    // La entrada finaliza al pulsar la tecla Entrar
	    sdato = teclado.readLine ();
	}
	catch (IOException e)
	{
	    System.err.println ("Error: " + e.getMessage ());
	}
	return sdato; // devolver el dato introducido
    } //fin del metodo dato


    public static short datoShort ()
    {
	try
	{
	    return Short.parseShort (dato ());
	}
	catch (NumberFormatException e)
	{
	    return Short.MIN_VALUE; // valor mas pequeo
	}
    } //fin del metodo datoShort


    public static int datoInt ()
    {
	try
	{
	    return Integer.parseInt (dato ());
	}
	catch (NumberFormatException e)
	{
	    System.out.println ("Error: Tipo de dato entero:  " + Integer.MIN_VALUE + " - " + Integer.MAX_VALUE);
	    return Integer.MIN_VALUE; // valor mas pequeo
	}

    } //fin del metodo datoInt


    public static long datoLong ()
    {
	try
	{
	    return Long.parseLong (dato ());
	}
	catch (NumberFormatException e)
	{
	    System.out.println ("Error: Tipo de dato long:  " + Long.MIN_VALUE + " - " + Long.MAX_VALUE);
	    return Long.MIN_VALUE; // valor mas pequeo
	}
    } //fin del metodo datoLong


    public static float datoFloat ()
    {
	try
	{
	    Float f = new Float (dato ());
	    return f.floatValue ();
	}
	catch (NumberFormatException e)
	{
	    return Float.NaN; // No es un Numero; valor float.
	}
    } //fin del metodo datoFloat


    public static double datoDouble ()
    {
	try
	{
	    Double d = new Double (dato ());
	    return d.doubleValue ();
	}
	catch (NumberFormatException e)
	{
	    System.out.println ("Error: Tipo de dato double: " + Double.MIN_VALUE + " - " + Double.MAX_VALUE);
	    return Double.NaN; // No es un Numero; valor double.
	}
    } //fin del metodo datoDouble


    public static char caracter ()
    {
	char car;
	car = ' ';
	try
	{
	    car = ' ';
	    car = (char) System.in.read ();
	    System.in.read ();
	}

	catch (IOException e)
	{
	    System.err.println ("Error: " + e.getMessage ());
	}
	return car;
	// devolver el dato introducido
    } //fin del metodo caracter
} //fin de la clase Leer

