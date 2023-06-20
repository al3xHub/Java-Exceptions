package es.studium.SegundoEjemplo;

public class SegundoEjemplo
{

	public static void main(String[] args)
	{
		final int TAM = 5;
		int tabla[] = new int[TAM];
		
		for(int i=0; i<=TAM; i++)//El i<=TAM da error por que para llegar a 5 debe de dar 6 vueltas
		{
			try
			{
				tabla[i] = i*2; // con el try la tabla[5] se la salta y va directamente al for final.
			}
			
			catch(ArrayIndexOutOfBoundsException aioobe)
			{
				//Tareas relacionadas con aioobe
			}
			
			catch(Exception e)
			{
				//En general tareas relacionadas con excepciones
			}
		}
		
		for(int elemento: tabla) // for final
		{
			System.out.println(elemento);
		}
		
		/*
		 * La idea de los try & catch es hacer seguir funcionando el programa mas que correjir el error.
		 * De esta manera no se parará la ejecución del programa y podremos seguir usandolo que es
		 * sumamente importante.
		 */
	}

}
