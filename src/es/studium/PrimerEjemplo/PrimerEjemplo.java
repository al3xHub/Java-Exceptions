package es.studium.PrimerEjemplo;

public class PrimerEjemplo
{

	public static void main(String[] args)
	{
		int a, b;
		
		a=7;
		b=0;
		
		
		//Try dice: intenta aquí, si no lo capturamos y lo soltamos en Catch
		try
		{
			System.out.println(a/b);
		}
		
		//Atrapa el error y mostramos un mensaje por consola + el tipo de error "ae.getMessage()"
		catch(ArithmeticException ae)
		{
			System.out.println("Se ha producido un error" +ae.getMessage());
		}
		//Ahora el programa no se detiene y muestra otro mensaje por consola aunque no se haya podido hacer la operación
		
		System.out.println("En breves será resolvido");
	}

}
